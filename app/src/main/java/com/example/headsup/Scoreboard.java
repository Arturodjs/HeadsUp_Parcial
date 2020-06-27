package com.example.headsup;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Scoreboard extends AppCompatActivity {

    TextView puntos;
    ListView lista;
    ArrayList<String> res_correctas;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leaderboard);

        // cargar ids
        puntos = (TextView) findViewById(R.id.idPuntos);
        lista = (ListView) findViewById(R.id.listLeaderBoard);
        res_correctas = ListaPreguntas.preguntasCorrectas;

        puntos.setText("PUNTUACIÓN: " + ListaPreguntas.puntuacion);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, res_correctas);
        lista.setAdapter(adapter);

    }
}
