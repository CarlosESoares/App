package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    float resultado;
    TextView textView;
    ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        String peso = bundle.getString("peso");
        String altura = bundle.getString("altura");
        imagem.findViewById(R.id.imageView);
        textView.findViewById(R.id.IMCRESULTADO);

        float p;
        p = Float.parseFloat(peso);
        float a;
        a = Float.valueOf(altura);
        float a2 = a * a;
        resultado = p / a2;

        if (resultado < 18.5) {
            textView.setText(" Abaixo do peso: " + resultado);
            imagem.setImageResource(R.drawable.abaixopeso);

        } else if (resultado > 18.5 && resultado < 24.9) {

            textView.setText("Peso normal:" + resultado);
            imagem.setImageResource(R.drawable.normal);
        } else if (resultado > 25 && resultado < 29.9) {
            textView.setText("Sobre Peso:" + resultado);]
            imagem.setImageResource(R.drawable.sobrepeso);

        } else if (resultado > 30 && resultado < 34.9) {
            textView.setText("Obesidade 1:" + resultado);
            imagem.setImageResource(R.drawable.obesidade1);
        } else if (resultado > 35 && resultado < 39.9) {
            textView.setText("Obesidade 2:" + resultado);
            imagem.setImageResource(R.drawable.obesidade2);

        } else {
            textView.setText("Obesidade 3:" + resultado);
            imagem.setImageResource(R.drawable.obesidade3);
        }
    }
}
    }
}