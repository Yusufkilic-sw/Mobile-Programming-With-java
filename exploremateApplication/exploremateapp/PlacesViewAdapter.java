package com.example.exploremateapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlacesViewAdapter extends  RecyclerView.Adapter<PlacesViewAdapter.PlacesViewHolder> {
    Context context;
    List<Places>data;

    PlacesAdapterListener listener;
    interface  PlacesAdapterListener{
        public void placesRowClicked(Places place);
    }
    public PlacesViewAdapter(Context context, List<Places> data,PlacesAdapterListener listener) {
        this.context = context;
        this.data = data;
        this.listener =listener;
    }


    @NonNull
    @Override
    public PlacesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root2 = LayoutInflater.from(context).inflate(R.layout.places_row_layout,parent,false);
        PlacesViewHolder holder = new PlacesViewHolder(root2);

        return holder;


    }

    @Override
    public void onBindViewHolder(@NonNull PlacesViewHolder holder, int position) {
        holder.txtPlacesName.setText((data.get(position).getPlace()));
        holder.imgPlace.setImageResource(data.get(position).getImg());

        holder.root.setOnClickListener(v->{
            listener.placesRowClicked(data.get(position));
        });



    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class PlacesViewHolder extends RecyclerView.ViewHolder{
        ConstraintLayout root;
        TextView txtPlacesName;
        ImageView imgPlace;

        public PlacesViewHolder(@NonNull View itemView) {
            super(itemView);
            root =itemView.findViewById(R.id.places_row);
            txtPlacesName = itemView.findViewById(R.id.txtPlacesName);
            imgPlace = itemView.findViewById(R.id.imgPlaces);
        }
    }
}
