package com.example.bdd;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ConteneurDeDonnee> {
    private List<Planete> planetes;

    public MyRecyclerViewAdapter(List<Planete> planetes)
    {
        this.planetes = planetes;

    }

    @Override
    public ConteneurDeDonnee onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new ConteneurDeDonnee(view);
    }

    @Override
    public void onBindViewHolder(ConteneurDeDonnee conteneur, int position) {
        //conteneur.imageView.setImageResource(planetes.get(position).getImage());
        conteneur.nom.setText(planetes.get(position).getNom());
        conteneur.taille.setText(planetes.get(position).getTaille());

    }

    @Override
    public int getItemCount() {
        return planetes.size();
    }

    public static class ConteneurDeDonnee extends RecyclerView.ViewHolder{
        TextView nom;
        TextView taille;
        ImageView imageView;

        public ConteneurDeDonnee(View itemView) {
            super(itemView);
            nom= (TextView) itemView.findViewById(R.id.nom);
            taille= (TextView) itemView.findViewById(R.id.taille);
            //imageView =  itemView.findViewById(R.id.image);


        }

    }
}




