package com.example.tugasprogmob4;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Menu2Activity extends AppCompatActivity {
    private TextView next,sing1,sing2,sing3,sing4,sing5,sing6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        //make back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Your Music");

        //dekralarsi
        TextView next = (TextView) findViewById(R.id.nextbutton);
        TextView sing1 = (TextView) findViewById(R.id.yoursinger1);
        TextView sing2 = (TextView) findViewById(R.id.yoursinger2);
        TextView sing3 = (TextView) findViewById(R.id.yoursinger3);
        TextView sing4 = (TextView) findViewById(R.id.yoursinger4);
        TextView sing5 = (TextView) findViewById(R.id.yoursinger5);
        TextView sing6 = (TextView) findViewById(R.id.yoursinger6);

        //set text
        sing1.setText("Macepet-cepetan");
        sing2.setText("Meong Meong");
        sing3.setText("Tresna Mejohan");
        sing4.setText("Putri Cening Ayu");
        sing5.setText("Ratu Anom");
        sing6.setText("Jangi Janger");

        sing1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music1(v);
            }
        });
        sing2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music2(v);
            }
        });
        sing3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music3(v);
            }
        });
        sing4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music4(v);
            }
        });
        sing5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music5(v);
            }
        });
        sing6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music6(v);
            }
        });
    }


    private void music1(View v) {
        Intent i = new Intent(this, Music1Activity.class);
        i.putExtra("cover", R.drawable.cover_macepet_cepetan);
        startActivity(i);
    }
    private void music2(View v) {
        Intent i = new Intent(this, Music2Activity.class);
        i.putExtra("cover2", R.drawable.cover_meong_meong);
        startActivity(i);
    }
    private void music3(View v) {
        Intent i = new Intent(this, Music3Activity.class);
        i.putExtra("cover3", R.drawable.cover_tresna_mejohan);
        startActivity(i);
    }
    private void music4(View v) {
        Intent i = new Intent(this, Music4Activity.class);
        i.putExtra("cover4", R.drawable.cover_putri_cening_ayu);
        startActivity(i);
    }
    private void music5(View v) {
        Intent i = new Intent(this, Music5Activity.class);
        i.putExtra("cover5", R.drawable.cover_ratu_anom);
        startActivity(i);
    }
    private void music6(View v) {
        Intent i = new Intent(this, Music6Activity.class);
        i.putExtra("cover6", R.drawable.cover_jangi_janger);
        startActivity(i);
    }

}

