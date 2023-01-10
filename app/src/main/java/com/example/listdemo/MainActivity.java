package com.example.listdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView listView;
String list[]={"Nepal","India","Pakistan","Japan","Bharatpur",
        "Chitwan","Intelzy","ISMT","Mukhiya Kaka","Rahul Loni","ShivaGhat","Golaghat",
        "Spatgandgichowk","ChandaniChowk","Ktm"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        ArrayAdapter arrayAdapter=new ArrayAdapter<String>
                (this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,list);
        listView.setAdapter(arrayAdapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent intentItem1=new Intent(getApplicationContext(),Second.class);
                    startActivity(intentItem1);
                }else if (i==1){
                    Toast.makeText(MainActivity.this, "Click To India ", Toast.LENGTH_SHORT).show();
                }else if (i==3){
                    Intent intent3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://thirdweb.com/"));
                    startActivity(intent3);
                }
            }
        });
    }
    public  void init(){
        listView=(ListView) findViewById(R.id.list);
    }
}