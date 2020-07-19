package com.example.cadastrojogador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE_NOME = "com.example.cadastrojogador.NOME";
    public final static String EXTRA_MESSAGE_POSICAO = "com.example.cadastrojogador.POSICAO";
    public final static String EXTRA_MESSAGE_IDADE = "com.example.cadastrojogador.IDADE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome_jogador = findViewById(R.id.nome_jogador);
        ckb_goleiro = findViewById(R.id.ckb_goleiro);
        ckb_zagueiro = findViewById(R.id.ckb_zagueiro);
        ckb_lateral = findViewById(R.id.ckb_lateral);
        ckb_meia = findViewById(R.id.ckb_meia);
        = findViewById(R.id.nome_jogador);
        = findViewById(R.id.nome_jogador);
        = findViewById(R.id.nome_jogador);
        = findViewById(R.id.nome_jogador);
        = findViewById(R.id.nome_jogador);
    }
}
    public void Formulario(View v)
    {
        EditText txtNome = findViewById((R.id.nome_jogador));
        CheckBox ckb_goleiro  = findViewById(R.id.ckb_goleiro));
        CheckBox ckb_zagueiro = findViewById(R.id.ckb_zagueiro));


//EXEMPLO DA PROF
        String msgIMC;
        double peso = Double.parseDouble(txtPeso.getText().toString());
        double alt = Double.parseDouble(txtAlt.getText().toString());
        double imc = peso / pow(alt,2);
        if(swSexo.isChecked())

        Intent intent = new Intent(this, ResultadoCadastro.class);
        String valor = String.valueOf(imc);
        intent.putExtra(EXTRA_MESSAGE, msgIMC);
        intent.putExtra(EXTRA_MESSAGE_VALOR, valor);
        startActivity(intent);
    }
}

