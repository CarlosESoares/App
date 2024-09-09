package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button button;
    TextView textView;

    Random contador = new Random(20);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button =findViewById(R.id.BtnClicke);

        button.setText("click");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button b = (Button) view;


                textView.setText("valor " + contador);

            }
        });
    }
    }
