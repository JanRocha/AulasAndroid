package br.com.uninove.curriculo2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    Button btnDadosPessoais;
    Button btnDadosProfissionais;
    Button btnContato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDadosPessoais= (Button) findViewById(R.id.btnDadosPessoais);
        btnContato=(Button) findViewById(R.id.btnContato);
        btnDadosProfissionais=(Button) findViewById(R.id.btnDadosprofissionais);
        //chamando a segunda tela

    }
    public void AbrirDadosPessoais(View view){
        //Intentity -> inteção de fazer algo
        Intent it = new Intent(this, DadosPessoaisActivity.class);
        startActivity(it);
    }
    public void AbrirContato(View view){
        //Intentity -> inteção de fazer algo
        Intent it = new Intent(this, ContatoActivity.class);
        startActivity(it);
    }
}
