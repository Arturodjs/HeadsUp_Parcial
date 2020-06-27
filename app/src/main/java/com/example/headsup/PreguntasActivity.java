package com.example.headsup;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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
    int puntos = 0;
    ArrayList<String> preguntas_correctas = new ArrayList<String>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions_layout);

        Gyroscope gyroscope = new Gyroscope(this);

        gyroscope.setListener(new Gyroscope.Listener() {
            @Override
            public void onRotation(float rx, float ry, float rz) {
                if(ry > 1.0f)
                {
                    Toast.makeText(getApplicationContext(), "Correcto", Toast.LENGTH_SHORT).show();
                }
                else if(ry < -1.0f) {
                    Toast.makeText(getApplicationContext(), "Incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });

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
        CountDownTimer contador = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timer.setText("Segundos restantes: " + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                irScoreboard();
            }
        };
        contador.start();
    }

    private void saltar() {
        charade = chooseRandom();
        question.setText(charade);
    }

    private void correcta() {
        puntos += 1;
        preguntas_correctas.add(charade);
        saltar();
    }

    private void irScoreboard() {

        ListaPreguntas.puntuacion = puntos;
        ListaPreguntas.preguntasCorrectas = preguntas_correctas;

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
