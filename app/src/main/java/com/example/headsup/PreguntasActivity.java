package com.example.headsup;

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
        charade = chooseRandom(preguntas);
        question.setText(charade);

        // Crear un contador
        CountDownTimer contador = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            timer.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                charade = chooseRandom(preguntas);
            }
        };
        contador.start();


    }

    public String chooseRandom(ArrayList<String> lista){
        Random random =  new Random();
        String res = "";
        for(int i = 0; i < lista.size(); i++){
            int pos = random.nextInt(lista.size());
            res = lista.get(pos); // devuelve entre 0 y lista.size()
            lista.remove(pos);
        }
        return res;
    }
}
