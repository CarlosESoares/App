package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    ListView list;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.list2);
        DAOplaneta dao = new DAOplaneta();
      PlanetaAdapter planetaAdapter = new PlanetaAdapter(this,R.layout.iten_planeta,dao.planetas);
      list.setAdapter(planetaAdapter);
    list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            /*Toast.makeText(getApplicationContext(),Integer.toString(i)+
                    " "+
                    nomes[i],Toast.LENGTH_LONG).show();
*/        }
    });
{


        }
    }

}