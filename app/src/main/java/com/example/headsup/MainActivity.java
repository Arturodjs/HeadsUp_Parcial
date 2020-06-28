package com.example.headsup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch(view.getId()) {
            case (R.id.Animales):
                ListaPreguntas.listaActual = 1;
                break;
            case (R.id.Politica):
                ListaPreguntas.listaActual = 2;
                break;
            case (R.id.Deportes):
                ListaPreguntas.listaActual = 3;
                break;
            case (R.id.Musica):
                ListaPreguntas.listaActual = 4;
                break;
        }
        Intent intent = new Intent(this, forehead_splash.class);
        startActivity(intent);
    }
}
