package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    String[] nomes = new String[]{"datena","ciro","caderada","eleição"};
    ListView list;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.list2);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,android.R.id.text1,nomes);
    list.setAdapter(arrayAdapter);
    }
}