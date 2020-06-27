package com.example.headsup;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {
    private TextView txtV;
    private ImageView imgV;
    //Esto es el splash screen, inicializando y programan transicion
    @Override
        protected void onCreate(Bundle savedInstanceState) {

        // Inicializar listas de preguntas
        ListaPreguntas.llenarListas();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        txtV = (TextView) findViewById(R.id.splash_txt);
        imgV = (ImageView) findViewById(R.id.splash_logo);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        txtV.startAnimation(myanim);
        imgV.startAnimation(myanim);
        final Intent i = new Intent(this, MainActivity.class);
        Thread timer = new Thread(){
            public void run (){
                try {
                    sleep(5000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                //transicion del splash screen al primer activity
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }

}
