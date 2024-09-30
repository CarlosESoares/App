package com.example.contador;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activit2 extends AppCompatActivity{

Float resultado;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        String peso = bundle.getString("peso");
        String altura = bundle.getString("altura");

        float p;
        p = Float.parseFloat(peso);
        float a;

        a = Float.valueOf(altura);
        float a2 = a * a;
        resultado = p / a2;


        Button b = (Button) view;

        if (resultado < 18.5) {
            textView.setText(" Abaixo do peso: " + resultado);

        } else if (resultado > 18.5 && resultado < 24.9) {

            textView.setText("Peso normal:" + resultado);

        } else if (resultado > 25 && resultado < 29.9) {
            textView.setText("Sobre Peso:" + resultado);


        } else if (resultado > 30 && resultado < 34.9) {
            textView.setText("Obesidade 1:" + resultado);

        } else if (resultado > 35 && resultado < 39.9) {
            textView.setText("Obesidade 2:" + resultado);


        } else {
            textView.setText("Obesidade 3:" + resultado);
        }
    }
}

