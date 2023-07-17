package com.example.exploremateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Places selected = (Places) getIntent().getSerializableExtra("coms");
        TextView txtCom = findViewById(R.id.txtHistory);
        txtCom.setText(selected.getHistory());


        getSupportActionBar().setTitle((selected.getPlace()));

    }

}
