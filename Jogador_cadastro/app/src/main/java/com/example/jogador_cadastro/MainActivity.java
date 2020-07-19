package com.example.jogador_cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.RadioButton;


public class MainActivity<EXTRA_MESSAGE_NOME, EXTRA_MESSAGE_POSICAO, EXTRA_MESSAGE_IDADE> extends AppCompatActivity {
    public final static String EXTRA_MESSAGE_NOME = "com.example.jogador_cadastro.NOME";
    public final static String EXTRA_MESSAGE_POSICAO = "com.example.jogador_cadastro.POSICAO";
    public final static String EXTRA_MESSAGE_IDADE = "com.example.jogador_cadastro.IDADE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Cadastrar(View view) {
        EditText txtNome = findViewById(R.id.nome_jogador);
        CheckBox ckb_goleiro = findViewById(R.id.ckb_goleiro);
        CheckBox ckb_zagueiro = findViewById(R.id.ckb_zagueiro);
        CheckBox ckb_lateral = findViewById(R.id.ckb_lateral);
        CheckBox ckb_meia = findViewById(R.id.ckb_meia);
        CheckBox ckb_atacante = findViewById(R.id.ckb_atacante);
        RadioButton rdb1 = findViewById(R.id.radio_idades_1);
        RadioButton rdb2 = findViewById(R.id.radio_idades_2);
        RadioButton rdb3 = findViewById(R.id.radio_idades_3);
        RadioButton rdb4 = findViewById(R.id.radio_idades_4);
        String s;

        String n = txtNome.getText().toString();

        String check = "";

        if (ckb_goleiro.isChecked()) {
            check = check.concat(check + "\nGoleiro selecionado");
        }
        if (ckb_zagueiro.isChecked()) {
            check = check.concat(check + "\nZagueiro selecionado");
        }
        if (ckb_lateral.isChecked()) {
            check = check.concat(check + "\nLateral selecionado");
        }
        if (ckb_meia.isChecked()) {
            check = check.concat(check + "\nMeia selecionado");
        }
        if (ckb_atacante.isChecked()) {
            check = check.concat(check + "\nAtacante selecionado");
        }

        if (rdb1.isChecked())
            s = "Entre 18 e 23";
        else if (rdb2.isChecked())
            s = "Entre 24 e 29";
        else if (rdb3.isChecked())
            s = "Entre 30 e 35";
        else if (rdb4.isChecked())
            s = "36 ou mais";
        else
            s = "Selecione uma faixa de idade";

        Intent intent = new Intent(this, ResultadoCadastro.class);
        intent.putExtra(EXTRA_MESSAGE_NOME, n);
        intent.putExtra(EXTRA_MESSAGE_POSICAO, check);
        intent.putExtra(EXTRA_MESSAGE_IDADE, s);

        startActivity(intent);
    }
}