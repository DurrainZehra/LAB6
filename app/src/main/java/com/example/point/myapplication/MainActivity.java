package com.example.point.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView= (ListView)findViewById(R.id.listView);
        ArrayList<DataModel> list=new ArrayList<>();
        list.add(new DataModel("Areeba", "Hello", "01:00 AM"));
        list.add(new DataModel("Sara", "How are you?", "02:00 AM"));
        list.add(new DataModel("Rida", "I am fine", "03:50 AM"));
        list.add(new DataModel("Sana", "Thankyou", "04:00 AM"));
        CustomAdapter adapter=new CustomAdapter(this,R.layout.custom_row_layout,list); listView.setAdapter(adapter);
    }
}
