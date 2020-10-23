package br.unitins.couterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        String nn = getIntent().getStringExtra("nome"); // Recuperando a mensagem passada da tela1

        Toast.makeText(this, nn, Toast.LENGTH_LONG).show(); // Mostra na tela a mensagem
    }
    @Override
    public void onBackPressed() { // Quando aperta em voltar acionar esse método
//        super.onBackPressed();

        Intent intent = new Intent();
        intent.putExtra("estado", "TO"); // Mensagem de volta

        setResult(RESULT_OK, intent);
        finish();   //Finalizar a "intent"
    }
}