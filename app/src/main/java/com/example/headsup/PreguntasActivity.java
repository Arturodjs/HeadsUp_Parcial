package com.example.headsup;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class PreguntasActivity extends AppCompatActivity {
    ArrayList<CapturarPregunta> preguntasAnimales;
    ArrayList<CapturarPregunta> preguntasPoliticas;
    ArrayList<CapturarPregunta> preguntasDeportes;
    ArrayList<CapturarPregunta> preguntasMusica;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    private void llenarPreguntas(){
        preguntasAnimales.add(new CapturarPregunta("Toro"));
        preguntasAnimales.add(new CapturarPregunta("Perro"));
        preguntasAnimales.add(new CapturarPregunta("Gato"));
        preguntasAnimales.add(new CapturarPregunta("Vaca"));
        preguntasAnimales.add(new CapturarPregunta("León"));
        preguntasAnimales.add(new CapturarPregunta("Dinosaurio"));
        preguntasAnimales.add(new CapturarPregunta("Tortuga"));
        preguntasAnimales.add(new CapturarPregunta("Armadillo"));
        preguntasAnimales.add(new CapturarPregunta("Cangrejo"));
        preguntasAnimales.add(new CapturarPregunta("Serpiente"));
        preguntasAnimales.add(new CapturarPregunta("Canguro"));
        preguntasAnimales.add(new CapturarPregunta("Mono"));
        preguntasAnimales.add(new CapturarPregunta("Caballo"));
        preguntasAnimales.add(new CapturarPregunta("Gallina"));
        preguntasAnimales.add(new CapturarPregunta("Araña"));
        preguntasAnimales.add(new CapturarPregunta("Tiburón"));
        preguntasAnimales.add(new CapturarPregunta("Lobo"));
        preguntasAnimales.add(new CapturarPregunta("Calamar"));
        preguntasAnimales.add(new CapturarPregunta("Estrella de mar"));
        preguntasAnimales.add(new CapturarPregunta("Dragón"));
        preguntasDeportes.add(new CapturarPregunta("Futbol"));
        preguntasDeportes.add(new CapturarPregunta("Baloncesto"));
        preguntasDeportes.add(new CapturarPregunta("Beisbol"));
        preguntasDeportes.add(new CapturarPregunta("Voleibol"));
        preguntasDeportes.add(new CapturarPregunta("Tennis"));
        preguntasDeportes.add(new CapturarPregunta("Golf"));
        preguntasDeportes.add(new CapturarPregunta("Atletismo"));
        preguntasDeportes.add(new CapturarPregunta("Turf"));
        preguntasDeportes.add(new CapturarPregunta("Surf"));
        preguntasDeportes.add(new CapturarPregunta("Natación"));
        preguntasDeportes.add(new CapturarPregunta("Ciclismo"));
        preguntasDeportes.add(new CapturarPregunta("Gimnasia"));
        preguntasDeportes.add(new CapturarPregunta("Boxeo"));
        preguntasDeportes.add(new CapturarPregunta("Lucha Libre"));
        preguntasDeportes.add(new CapturarPregunta("Arquería"));
        preguntasDeportes.add(new CapturarPregunta("Esgrima"));
        preguntasDeportes.add(new CapturarPregunta("Clavados"));
        preguntasDeportes.add(new CapturarPregunta("Maratón"));
        preguntasDeportes.add(new CapturarPregunta("Ping Pong"));
        preguntasDeportes.add(new CapturarPregunta("Futbol Americano"));
        preguntasMusica.add(new CapturarPregunta("Michael Jackson"));
        preguntasMusica.add(new CapturarPregunta("Elvis Presley"));
        preguntasMusica.add(new CapturarPregunta("Adele"));
        preguntasMusica.add(new CapturarPregunta("Justin Bieber"));
        preguntasMusica.add(new CapturarPregunta("Jennifer López"));
        preguntasMusica.add(new CapturarPregunta("Marc Anthony"));
        preguntasMusica.add(new CapturarPregunta("Jay-Z"));
        preguntasMusica.add(new CapturarPregunta("Snoop Dogg"));
        preguntasMusica.add(new CapturarPregunta("Guns'n Roses"));
        preguntasMusica.add(new CapturarPregunta("Linkin Park"));
        preguntasMusica.add(new CapturarPregunta("Daddy Yankee"));
        preguntasMusica.add(new CapturarPregunta("Don Omar"));
        preguntasMusica.add(new CapturarPregunta("Romeo Santos"));
        preguntasMusica.add(new CapturarPregunta("Los Hermanos Rosario"));
        preguntasMusica.add(new CapturarPregunta("Toño Rosario"));
        preguntasMusica.add(new CapturarPregunta("Mozart"));
        preguntasMusica.add(new CapturarPregunta("Beethoven"));
        preguntasMusica.add(new CapturarPregunta("AC/DC"));
        preguntasMusica.add(new CapturarPregunta("Queen"));
        preguntasMusica.add(new CapturarPregunta("Green Day"));
        preguntasPoliticas.add(new CapturarPregunta("Donald Trump"));
        preguntasPoliticas.add(new CapturarPregunta("Xi Jinping"));
        preguntasPoliticas.add(new CapturarPregunta("Leonel Fernández"));
        preguntasPoliticas.add(new CapturarPregunta("Hipólito Mejía"));
        preguntasPoliticas.add(new CapturarPregunta("George Bush"));
        preguntasPoliticas.add(new CapturarPregunta("Barack Obama"));
        preguntasPoliticas.add(new CapturarPregunta("Danilo Medina"));
        preguntasPoliticas.add(new CapturarPregunta("Juan Bosch"));
        preguntasPoliticas.add(new CapturarPregunta("Joaquín Balaguer"));
        preguntasPoliticas.add(new CapturarPregunta("Rafael Leónidas Trujillo"));
        preguntasPoliticas.add(new CapturarPregunta("Hillary Clinton"));
        preguntasPoliticas.add(new CapturarPregunta("John F. Kennedy"));
        preguntasPoliticas.add(new CapturarPregunta("Vladimir Putin"));
        preguntasPoliticas.add(new CapturarPregunta("Boris Johnson"));
        preguntasPoliticas.add(new CapturarPregunta("Isabel II"));
        preguntasPoliticas.add(new CapturarPregunta("Justin Trudeau"));
        preguntasPoliticas.add(new CapturarPregunta("Richard Nixon"));
        preguntasPoliticas.add(new CapturarPregunta("Abraham Lincoln"));
        preguntasPoliticas.add(new CapturarPregunta("Mariano Rajoy"));
        preguntasPoliticas.add(new CapturarPregunta("Nicolás Maduro"));


    }
    public void onClick(View v){
        Random random = new Random();
        switch(v.getId()){
            case R.id.Politica:
                llenarPreguntas();
                for(int i = 0;i < preguntasPoliticas.size(); i++){
                    preguntasPoliticas.get(random.nextInt(preguntasPoliticas.size()));
                }
                break;
            case R.id.Deportes:
                llenarPreguntas();;
                for(int i = 0;i < preguntasDeportes.size(); i++){
                    preguntasDeportes.get(random.nextInt(preguntasDeportes.size()));
                }
                break;
            case R.id.Animales:
                llenarPreguntas();
                for(int i = 0;i < preguntasAnimales.size(); i++){
                    preguntasAnimales.get(random.nextInt(preguntasAnimales.size()));
                }
                break;
            case R.id.Musica:
                llenarPreguntas();
                for(int i = 0;i < preguntasMusica.size(); i++){
                    preguntasMusica.get(random.nextInt(preguntasMusica.size()));
                }
                break;

        }

    }
}
