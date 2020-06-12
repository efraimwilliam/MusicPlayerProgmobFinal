package com.example.tugasprogmob4;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Youtube6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        //Jangi Janger
        WebView youtube = (WebView) findViewById(R.id.youtube);
        youtube.loadUrl("https://www.youtube.com/watch?v=k3S-lkCkr8A");
    }
}
