package br.unitins.couterapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Tela1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

    }

    public void navegarcao(View view){

        // Navegar entrer as tela
        Intent intent = new Intent(getApplicationContext(), Tela2.class);
        intent.putExtra("nome", "UNITINS"); //Manda informação pra outra tela

//        startActivity(intent); // passando a "intent" que foi criada
        startActivityForResult(intent, 5); // Voltando a resposta pra tela1
    }

    @Override   // Pega a resposta da tela 2
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 5){  // verificando
            String estado = data.getStringExtra("estado");

            Toast.makeText(this, estado, Toast.LENGTH_LONG).show(); // Mostra na tela a mensagem
        }
    }
}