package okayyildirim.com.callcalendar.CallLists;


import okayyildirim.com.callcalendar.Adapters.CallListAdapter;

public interface CallListView
{
    void initAppData();
    void setListItems(CallListAdapter callListAdapter);

}
