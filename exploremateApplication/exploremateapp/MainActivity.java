package com.example.exploremateapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Places> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String returned = (String) getIntent().getSerializableExtra("italy");
        data = Places.getItaly();


        Button btnFrance = findViewById(R.id.btnFrance);
        btnFrance.setOnClickListener(v -> {


            Intent i2 = new Intent(MainActivity.this,FranceActivity.class);
            i2.putExtra("france","ff");
            startActivity(i2);
        });
        Button btnTurkey = findViewById(R.id.btnTurkey);
        btnTurkey.setOnClickListener(v -> {
            Intent i2 = new Intent(MainActivity.this,TurkeyActivity.class);
            i2.putExtra("turkey","ff");
            startActivity(i2);

        });





        RecyclerView recPlaces = findViewById(R.id.recPlaces);
        recPlaces.setLayoutManager(new LinearLayoutManager(this));

        PlacesViewAdapter placesAdp = new PlacesViewAdapter(this, data, new PlacesViewAdapter.PlacesAdapterListener() {
            @Override
            public void placesRowClicked(Places place) {
                Intent i = new Intent(MainActivity.this,PlacesDetailActivity.class);
                i.putExtra("selectedplace", place);
                startActivity(i);

            }
        });

        recPlaces.setAdapter(placesAdp);
    }

}
