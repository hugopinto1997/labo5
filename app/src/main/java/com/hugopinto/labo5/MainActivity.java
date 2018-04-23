package com.hugopinto.labo5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    serieAdapter adapter;
    ArrayList<serie> series;
    LinearLayoutManager lManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        series= new ArrayList<>();
        int cont;
        String cosa;

        rv=findViewById(R.id.recycler);
        rv.setHasFixedSize(true);
        lManager= new LinearLayoutManager(this );
        rv.setLayoutManager(lManager);

        prepareSeries();
        cont = series.size();


        Toast.makeText(getApplicationContext(),"size del array"+cont, Toast.LENGTH_LONG).show();
        ver();
        adapter=new serieAdapter(series);
        rv.setAdapter(adapter);


    }

    public void prepareSeries(){
        series = new ArrayList<>();
        series.add(new serie("The Walking Dead", "13", R.drawable.twd, " TV show created by Robert Kirgman"));
        series.add(new serie("Game of Thrones", "13",R.drawable.got, " Serie de TV famosa de FOX" ));
        series.add(new serie("Breaking Bad", "13", R.drawable.bb, " La metanfetamina azul es la mejor :)"));
        series.add(new serie("Breaking Bad", "13", R.drawable.bb, " La metanfetamina azul es la mejor :)"));

    }
    public void ver(){
        Toast.makeText(getApplicationContext(), "mensaje", Toast.LENGTH_SHORT).show();
    }


}
