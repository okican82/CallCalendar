package okayyildirim.com.callcalendar.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import okayyildirim.com.callcalendar.Models.ListItem;
import okayyildirim.com.callcalendar.R;

public class CallListAdapter extends ArrayAdapter<ListItem>
{

    private Context _context;
    private final ArrayList<ListItem> items;
    private ViewGroup _parent;


    public CallListAdapter(Context context, ArrayList<ListItem> callItems)
    {
        super(context,0,callItems);
        _context = context;
        this.items = callItems;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.call_list_item,parent,false);

        ListItem item = getItem(position);



        return convertView;
    }
}
