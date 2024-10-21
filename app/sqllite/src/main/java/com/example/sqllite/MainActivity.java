package com.example.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase database;
    EditText editTextnome, editTextemail, editTextdata;
    Button button;
    ListView listView;
    ArrayList<String> nomes = new ArrayList<>();
    ArrayAdapter<String> adapter;
    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar os componentes
        editTextdata = findViewById(R.id.EditTextData);
        editTextemail = findViewById(R.id.EditTextEmail);
        editTextnome = findViewById(R.id.EditTextNome);
        listView = findViewById(R.id.List);
        button = findViewById(R.id.button);

        // Configurar o banco de dados
        database = openOrCreateDatabase("meudb", MODE_PRIVATE, null);
        database.execSQL("CREATE TABLE IF NOT EXISTS pessoas (id INTEGER PRIMARY KEY AUTOINCREMENT, nome VARCHAR, email VARCHAR, dtnsc DATE)");

        // Configurar o botão de cadastro
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = editTextnome.getText().toString();
                String email = editTextemail.getText().toString();
                String data = editTextdata.getText().toString();

                ContentValues cv = new ContentValues();
                cv.put("nome", nome);
                cv.put("email", email);
                cv.put("dtnsc", data);
                long status = database.insert("pessoas", null, cv);

                if (status > 0) {
                    Toast.makeText(getApplicationContext(), "Usuário inserido com sucesso!", Toast.LENGTH_LONG).show();
                    // Limpar os campos após inserção
                    editTextnome.setText("");
                    editTextemail.setText("");
                    editTextdata.setText("");
                } else {
                    Toast.makeText(getApplicationContext(), "Erro na inserção", Toast.LENGTH_LONG).show();
                }

                carregarListagem();
            }
        });

        // Carregar a listagem inicial
        carregarListagem();

        // Configurar clique nos itens da lista
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (cursor.moveToPosition(position)) {
                    // Pegar os dados do cursor e preencher os campos
                    String nome = cursor.getString(cursor.getColumnIndex("nome"));
                    String email = cursor.getString(cursor.getColumnIndex("email"));
                    String data = cursor.getString(cursor.getColumnIndex("dtnsc"));

                    editTextnome.setText(nome);
                    editTextemail.setText(email);
                    editTextdata.setText(data);
                }
            }
        });
    }

    public void carregarListagem() {
        cursor = database.rawQuery("SELECT * FROM pessoas", null);
        nomes.clear();

        // Preencher a lista de nomes
        if (cursor.moveToFirst()) {
            do {
                nomes.add(cursor.getString(cursor.getColumnIndex("nome")));
            } while (cursor.moveToNext());
        }

        // Configurar o adaptador da lista
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nomes);
        listView.setAdapter(adapter);
    }
}
