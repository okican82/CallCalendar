package okayyildirim.com.callcalendar.CallLists;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

import okayyildirim.com.callcalendar.Adapters.CallListAdapter;
import okayyildirim.com.callcalendar.Models.ListItem;
import okayyildirim.com.callcalendar.R;

public class CallList extends Activity implements CallListView, View.OnClickListener, AdapterView.OnItemClickListener {




    private ListView CallLists;
    private ImageButton addButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_list);


        CallLists = (ListView) findViewById(R.id.CallLists);
        addButton = (ImageButton) findViewById(R.id.addButton);
        addButton.setOnClickListener(this);

        initAppData();

    }
    @Override
    public void initAppData()
    {

    }

    @Override
    public void setListItems(CallListAdapter callListAdapter)
    {
        CallLists.setAdapter(callListAdapter);
        CallLists.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        //open Add New view
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        // liste görüntüleme açılacak.
    }
}
