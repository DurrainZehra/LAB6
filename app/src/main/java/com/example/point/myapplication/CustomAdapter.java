package com.example.point.myapplication;
import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import static com.example.point.myapplication.R.id.parent;
/** * Created by Administrator on 2/15/2018. */
public class CustomAdapter extends ArrayAdapter <DataModel> {
    public static LayoutInflater layoutInflater = null;
    public class ViewHolder{
        TextView txtUserName;
        TextView txtUserMsg;
        TextView txtUserTime;
    }
        public CustomAdapter(Context context, int resource, ArrayList<DataModel>list) {
        super(context, resource, list);
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder viewHolder= new ViewHolder();
        DataModel data= getItem(position);
        View rowView;
        rowView= layoutInflater.inflate(R.layout.custom_row_layout,null);
        viewHolder.txtUserName= (TextView)rowView.findViewById(R.id.textUserName);
        viewHolder.txtUserMsg= (TextView)rowView.findViewById(R.id.textUserMessage);
        viewHolder.txtUserTime= (TextView)rowView.findViewById(R.id.textTime);
        viewHolder.txtUserName.setText(data.getUsername());
        viewHolder.txtUserMsg.setText(data.getUsermsg());
        viewHolder.txtUserTime.setText(data.getUsertime());
        return rowView;
    }
}