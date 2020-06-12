package com.example.tugasprogmob4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class InfoActivity extends AppCompatActivity {
    private Button back;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView judul = (TextView) findViewById(R.id.textView2);
        TextView info = (TextView) findViewById(R.id.textView3);

        judul.setText("Bali Cilik");
        info.setText("Ini adalah aplikasi Media Music Player yang bertujuan untuk mengajak para masyarakat khususnya anak-anak kecil untuk mendengarkan lagu-lagu daerah di Bali. Aplikasi ini adalah aplikasi yang gratis dan di khsuskan untuk kepentingan edukasi beserta dengan hiburan");

    }
}

