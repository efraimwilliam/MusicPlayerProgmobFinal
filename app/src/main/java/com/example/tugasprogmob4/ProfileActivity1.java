package com.example.tugasprogmob4;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ProfileActivity1 extends AppCompatActivity {
    private TextView tvNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile1);


        //make back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Profile Page");

        tvNama= findViewById(R.id.tvNama);
        tvNama.setText("Efraim William Solang");
    }
}
