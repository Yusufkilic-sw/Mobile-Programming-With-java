package com.example.exploremateapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.List;

public class TurkeyActivity extends AppCompatActivity {
    List<Places> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkey);

        String returned = (String) getIntent().getSerializableExtra("turkey");
        data = Places.getTurkey();


        Button btnItaly = findViewById(R.id.btnItaly);
        btnItaly.setOnClickListener(v -> {

            Intent i2 = new Intent(TurkeyActivity.this,MainActivity.class);
            i2.putExtra("italy","ff");


            startActivity(i2);


        });

        Button btnFrance = findViewById(R.id.btnFrance);
        btnFrance.setOnClickListener(v -> {


            Intent i2 = new Intent(TurkeyActivity.this,FranceActivity.class);
            i2.putExtra("france","ff");
            startActivity(i2);
        });





        RecyclerView recPlaces = findViewById(R.id.recPlaces);
        recPlaces.setLayoutManager(new LinearLayoutManager(this));

        PlacesViewAdapter placesAdp = new PlacesViewAdapter(this, data, new PlacesViewAdapter.PlacesAdapterListener() {
            @Override
            public void placesRowClicked(Places place) {
                Intent i = new Intent(TurkeyActivity.this,PlacesDetailActivity.class);
                i.putExtra("selectedplace", place);
                startActivity(i);

            }
        });


        recPlaces.setAdapter(placesAdp);
    }

}

