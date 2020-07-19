package com.example.jogador_cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_cadastro);
        Bundle extras = getIntent().getExtras();

        TextView nome = findViewById(R.id.txtV1);
        TextView posicao = findViewById(R.id.txtV2);
        TextView idade = findViewById(R.id.txtV3);


        String n = extras.getString(MainActivity.EXTRA_MESSAGE_NOME);
        String check = extras.getString(MainActivity.EXTRA_MESSAGE_POSICAO);
        String s = extras.getString(MainActivity.EXTRA_MESSAGE_IDADE);
        nome.setText(n);
        posicao.setText(check);
        idade.setText(s);

    }
}
