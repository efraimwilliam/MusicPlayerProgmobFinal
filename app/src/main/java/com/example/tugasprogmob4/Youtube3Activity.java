package com.example.tugasprogmob4;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Youtube3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        //Tresna Mejohan
        WebView youtube = (WebView) findViewById(R.id.youtube);
        youtube.loadUrl("https://www.youtube.com/watch?v=AZ2Df8hWrPg");
    }
}
