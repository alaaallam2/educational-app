package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class home extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        listView = (ListView) findViewById(R.id.list_view);
        String[] values =new String[]{"Lesson 1" ,"lesson 2","lesson3","lesson4","lesson5","lesson6","Start a quiz","To Other Services"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,android.R.id.text1,values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent myintent =new Intent(view.getContext(),item0.class);
                    startActivityForResult(myintent,0);
                }
                if (position==1) {
                    Intent myintent =new Intent(view.getContext(),item1.class);
                    startActivityForResult(myintent,0);
                }
                if (position==2) {
                    Intent myintent =new Intent(view.getContext(),item3.class);
                    startActivityForResult(myintent,0);
                }
                if (position==3) {
                    Intent myintent =new Intent(view.getContext(),MainActivity4.class);
                    startActivityForResult(myintent,0);
                }
                if (position==4) {
                    Intent myintent =new Intent(view.getContext(),MainActivity5.class);
                    startActivityForResult(myintent,0);
                }
                if (position==5) {
                    Intent myintent =new Intent(view.getContext(),MainActivity6.class);
                    startActivityForResult(myintent,0);
                }
                if (position==6) {
                    Intent myintent =new Intent(view.getContext(),item4.class);
                    startActivityForResult(myintent,0);
                }
                if (position==7) {
                    Intent myintent =new Intent(view.getContext(),MainActivity2.class);
                    startActivityForResult(myintent,0);
                }

            }
        });

    }
}