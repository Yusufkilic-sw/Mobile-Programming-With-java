package com.example.exploremateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PlacesDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_detail);

        Places selected = (Places) getIntent().getSerializableExtra("selectedplace");
        ImageView imgDesc = findViewById(R.id.imageDesc);
        TextView txtDesc = findViewById(R.id.txtDesc);
        Button txtComment = findViewById(R.id.btnComment);

        imgDesc.setImageResource(selected.getImg());
        txtDesc.setText(selected.getDesc());
        txtComment.setOnClickListener(v -> {
            Intent i2 = new Intent(PlacesDetailActivity.this, History.class);
             i2.putExtra("coms",selected);
            startActivity(i2);
            // i2.FLAG_ACTIVITY_SINGLE_TOP
            //i2.FLAG_ACTIVITY_CLEAR_TOP


        });

    }
}