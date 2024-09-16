package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

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

                float p;
                p = Float.parseFloat(peso.getText().toString());
                float a;

                a = Float.valueOf(altura.getText().toString());
                float a2 = a*a;
                resultado = p/a2;


                Button b = (Button) view;

                if (resultado <18.5){
                    textView.setText(" Abaixo do peso: " + resultado );

                }
                else if (resultado > 18.5 && resultado <24.9){

                    textView.setText("Peso normal:" + resultado);

                } else if (resultado > 25 && resultado < 29.9) {
                    textView.setText("Sobre Peso:" + resultado);
                    
                    
                } else if (resultado >30 && resultado<34.9) {
                    textView.setText("Obesidade 1:" + resultado);
                    
                } else if (resultado >35 && resultado<39.9) {
                    textView.setText("Obesidade 2:" + resultado);

                    
                }
                else {
                    textView.setText("Obesidade 3:" + resultado);
                }
            }
        });
    }
    }
