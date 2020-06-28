package com.example.headsup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class forehead_splash extends AppCompatActivity {
    private TextView txtV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forehead_splash);
        txtV = (TextView) findViewById(R.id.foreheadText);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        txtV.startAnimation(myanim);
        final Intent i = new Intent(this, PreguntasActivity.class);
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
