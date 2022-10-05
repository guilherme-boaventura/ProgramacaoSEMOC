package com.example.programacaosemoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<modelo> modelos = new ArrayList<>();

    int[] imagens = { R.drawable.abertura, R.drawable.batepapo, R.drawable.mesaredonda, R.drawable.mesaredonda,
            R.drawable.mesaredonda, R.drawable.mesaredonda, R.drawable.batepapo, R.drawable.pesquisa, R.drawable.pesquisa,
            R.drawable.pesquisa,R.drawable.pesquisa, R.drawable.mesaredonda,
            R.drawable.mesaredonda, R.drawable.mesaredonda,R.drawable.mesaredonda, R.drawable.mesaredonda,
            R.drawable.mesaredonda, R.drawable.mesaredonda,R.drawable.mesaredonda, R.drawable.pesquisa, R.drawable.pesquisa,
            R.drawable.pesquisa,R.drawable.pesquisa,R.drawable.mesaredonda,
            R.drawable.mesaredonda, R.drawable.mesaredonda, R.drawable.batepapo, R.drawable.mesaredonda, R.drawable.mesaredonda,
            R.drawable.mesaredonda, R.drawable.mesaredonda, R.drawable.pesquisa,R.drawable.pesquisa,R.drawable.pesquisa,R.drawable.pesquisa,
            R.drawable.mesaredonda, R.drawable.mesaredonda,
            R.drawable.mesaredonda, R.drawable.mesaredonda,R.drawable.mesaredonda, R.drawable.mesaredonda,
            R.drawable.mesaredonda, R.drawable.mesaredonda,R.drawable.fim};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);

        setarModelos();

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,
        modelos);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setarModelos() {
        String[] eixos = getResources().getStringArray(R.array.eixos);
        String[] datahora = getResources().getStringArray(R.array.datasehoras);
        String[] temas = getResources().getStringArray(R.array.temas);
        String[] locais = getResources().getStringArray(R.array.locais);

        for (int i = 0; i<eixos.length;i++) {
            modelos.add(new modelo(eixos[i], datahora[i], temas[i], locais[i], imagens[i]));

        }
    }

}