package com.hugopinto.labo5;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class serieAdapter extends  RecyclerView.Adapter<serieAdapter.SerieViewHolder>{
    private ArrayList<serie> series;

    public static class SerieViewHolder extends RecyclerView.ViewHolder {
        CardView card;
        TextView name;
        ImageView img;
        Button btn;
        Context context;

        public SerieViewHolder(View itemView){
            super(itemView);
            context=itemView.getContext();
            card=itemView.findViewById(R.id.card_view);
            name=itemView.findViewById(R.id.name);
            img=itemView.findViewById(R.id.img);
            btn=itemView.findViewById(R.id.boton);


        }

    }

    public serieAdapter(ArrayList<serie> series) {
        this.series = series;
    }

    @Override
    public SerieViewHolder onCreateViewHolder(ViewGroup parent, int ViewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview,parent,false);
        return (new SerieViewHolder(v));
    }

    @Override
    public void onBindViewHolder(SerieViewHolder holder, final int position){
        holder.name.setText(series.get(position).getName());
        holder.img.setImageResource(series.get(position).getImg());
        holder.btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(),"Descripcion:"+series.get(position).getDesc(), Toast.LENGTH_LONG).show();
            }
        });
    }



    @Override
    public int getItemCount(){
        return series.size();
    }
}





