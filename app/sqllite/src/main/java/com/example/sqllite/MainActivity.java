package com.example.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase database;
    EditText editTextnome,editTextemail,editTextdata;

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextdata = findViewById(R.id.EditTextData);
        editTextemail = findViewById(R.id.EditTextEmail);
        editTextnome = findViewById(R.id.EditTextNome);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = editTextnome.getText().toString();
                String email = editTextemail.getText().toString();

                ContentValues cv= new ContentValues();
                cv.put("nome",nome);

                cv.put("email",email);
                long status = database.insert("pessoas",null,cv);

                database.insert("pessoas",null,cv);

                if(status>0){
                    Toast.makeText(getApplicationContext(),"Usuario inserido com sucesso!",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(),"Erro na inserção",Toast.LENGTH_LONG).show();
                }
            }
        });


        database = openOrCreateDatabase("meudb", MODE_PRIVATE,null);
        database.execSQL("CREATE TABLE IF NOT exists pessoas (id INTEGER primary kEY AUTOINCREMENT,nome varchar, email varchar,dtnsc DATE)");

    }
}