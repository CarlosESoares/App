package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button button;
    TextView textView;

    EditText peso;
    EditText altura;

    Float resultado = null;
    Random Contador = new Random(20);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       peso = findViewById(R.id.Peso);
       altura = findViewById(R.id.Altura);

        textView = findViewById(R.id.Resultado);
        button =findViewById(R.id.BtnClicke);



         button.setText("Calcular");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                i.putExtra("peso",peso.getText().toString());
                i.putExtra("altura",altura.getText().toString());

                startActivity(i);

        }

        });
    }
}

