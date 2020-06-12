package com.example.tugasprogmob4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Youtube1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        //macepet-cepetan
        WebView youtube = (WebView) findViewById(R.id.youtube);
        youtube.loadUrl("https://www.youtube.com/watch?v=KZ1ryTpJtoc");
    }
}
