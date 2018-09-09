package okayyildirim.com.callcalendar.CallLists;

import okayyildirim.com.callcalendar.Adapters.CallListAdapter;
import okayyildirim.com.callcalendar.DB.DB;

public class CallListItaretorImpl implements CallListItaretor
{

    @Override
    public CallListAdapter getCallListFromDB()
    {
        DB db = DB.getInstance(getApplicationContext());

        CallListAdapter callerList = DB.getAllRecords();

        return
    }
}
