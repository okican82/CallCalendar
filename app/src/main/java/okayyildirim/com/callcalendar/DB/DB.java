package okayyildirim.com.callcalendar.DB;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import okayyildirim.com.callcalendar.Models.ListItem;

public class DB extends SQLiteOpenHelper {

    private final static int DatabaseVersiyon = 1;
    private static DB INSTANCE = null;
    private final static String DatabaseName = "CallList";

    public static DB getInstance(Context contect)
    {
        if (INSTANCE == null) {
            INSTANCE = new DB(contect.getApplicationContext());
        }
        return INSTANCE;
    }

    public DB(Context context)
    {
        super(context, DatabaseName, null, DatabaseVersiyon);
    }

    public void onCreate(SQLiteDatabase db) {  // Database i oluşturuyoruz.Bu methodu biz çağırmıyoruz. Database de obje oluşturduğumuzda otamatik çağırılıyor.
        String Call_List = "CREATE TABLE LISTS ("
                + " ID INTEGER PRIMARY KEY,"
                + " NAME TEXT,"
                + " DATE INTEGER"
                + ")";
        db.execSQL(Call_List);

        String List_Phonebook = "CREATE TABLE LIST_PHONEBOOK ("
                + " LIST_ID INTEGER PRIMARY KEY,"
                + " PERSON_ID INTEGER"
                + ")";
        db.execSQL(List_Phonebook);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub
    }


    public ArrayList<ListItem> getCallLists()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        String selectQuery = "";
        selectQuery = "SELECT * FROM CALL_LIST";
        selectQuery += " order by 1 desc";

        Cursor cursor = db.rawQuery(selectQuery,null);
        ArrayList<ListItem> timeLimitList = new ArrayList<ListItem>();

        if(cursor.moveToFirst())
        {
            do
            {
                timeLimitList.add(new ListItem(cursor.getInt(0),cursor.getString(1),cursor.getString(2)));

            }while (cursor.moveToNext());
        }

        db.close();

        return timeLimitList;

    }

}
