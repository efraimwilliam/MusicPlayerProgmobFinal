package com.example.tugasprogmob4;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Youtube5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        //Ratu Anom
        WebView youtube = (WebView) findViewById(R.id.youtube);
        youtube.loadUrl("https://www.youtube.com/watch?v=I18J9-0Jx7c");
    }
}