package com.example.programacaosemoc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
Context context;
ArrayList <modelo> modelos;

    public RecyclerViewAdapter(Context context, ArrayList<modelo> modelos) {
        this.context = context;
        this.modelos = modelos;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        return new RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {
    holder.tema.setText(modelos.get(position).getTema());
    holder.datahora.setText(modelos.get(position).getDatahora());
    holder.eixo.setText(modelos.get(position).getEixo());
    holder.local.setText(modelos.get(position).getLocal());
    holder.imageView.setImageResource(modelos.get(position).getImagem());
    }

    @Override
    public int getItemCount() {
        return modelos.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tema, eixo, datahora, local;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            tema = itemView.findViewById(R.id.textView);
            eixo = itemView.findViewById(R.id.textView18);
            datahora = itemView.findViewById(R.id.textView20);
            local = itemView.findViewById(R.id.textView19);
        }
    }
}
