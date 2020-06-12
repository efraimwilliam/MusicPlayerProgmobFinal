package com.example.tugasprogmob4;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Youtube2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        //Meong-meong
        WebView youtube1 = (WebView) findViewById(R.id.youtube);
        youtube1.loadUrl("https://www.youtube.com/watch?v=AZ2Df8hWrPg");
    }
}
