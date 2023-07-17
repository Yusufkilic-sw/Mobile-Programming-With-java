package com.example.exploremateapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.List;

public class FranceActivity extends AppCompatActivity {
    List<Places> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_france);
        String returned = (String) getIntent().getSerializableExtra("france");
        data = Places.getFrance();


        Button btnItaly = findViewById(R.id.btnItaly);
        btnItaly.setOnClickListener(v -> {

            Intent i2 = new Intent(FranceActivity.this,MainActivity.class);
            i2.putExtra("italy","ff");


            startActivity(i2);


        });

        Button btnTurkey = findViewById(R.id.btnTurkey);
        btnTurkey.setOnClickListener(v -> {
            Intent i2 = new Intent(FranceActivity.this,TurkeyActivity.class);
            i2.putExtra("turkey","ff");


            startActivity(i2);


        });





        RecyclerView recPlaces = findViewById(R.id.recPlaces);
        recPlaces.setLayoutManager(new LinearLayoutManager(this));

        PlacesViewAdapter placesAdp = new PlacesViewAdapter(this, data, new PlacesViewAdapter.PlacesAdapterListener() {
            @Override
            public void placesRowClicked(Places place) {
                Intent i = new Intent(FranceActivity.this,PlacesDetailActivity.class);
                i.putExtra("selectedplace", place);
                startActivity(i);

            }
        });


        recPlaces.setAdapter(placesAdp);
    }

}