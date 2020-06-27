package com.example.headsup;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PreguntasActivity extends AppCompatActivity {

    TextView question;
    TextView timer;
    ArrayList<String> preguntas;
    String charade;
    CountDownTimer contador;
    int puntos;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions_layout);

        // Cargar preguntas
        switch(ListaPreguntas.listaActual)
        {
            case(1):
                preguntas = ListaPreguntas.preguntasAnimales;
                break;
            case(2):
                preguntas = ListaPreguntas.preguntasPoliticas;
                break;
            case(3):
                preguntas = ListaPreguntas.preguntasDeportes;
                break;
            case(4):
                preguntas = ListaPreguntas.preguntasMusica;
                break;
        }

        // Cargar ids
        question = (TextView) findViewById(R.id.idQuestions);
        timer = (TextView) findViewById(R.id.Timer);

        // Mostrar pregunta
        charade = chooseRandom();
        question.setText(charade);

        // Crear un contador
        CountDownTimer contador = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timer.setText("Segundos restantes: " + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                charade = chooseRandom();
                question.setText(charade);
                //this.start();
                irScoreboard();
            }
        };
        contador.start();
    }

    private void irScoreboard() {

        ListaPreguntas.puntuacion = puntos;

        Intent intent = new Intent(this, Scoreboard.class);
        startActivity(intent);
    }

    public String chooseRandom(){
        Random random =  new Random();
        String res = "";
        for(int i = 0; i < preguntas.size(); i++){
            int pos = random.nextInt(preguntas.size());
            res = preguntas.get(pos); // devuelve entre 0 y lista.size()
            preguntas.remove(pos);
        }
        return res;
    }
}
