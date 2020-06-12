package com.example.tugasprogmob4;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;

public class MenuActivity extends AppCompatActivity {
    private ImageView profile, music, info, logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        profile= (ImageView) findViewById(R.id.account);
        music= (ImageView) findViewById(R.id.musicplayer);
        info= (ImageView) findViewById(R.id.infoapps);
        logout= (ImageView) findViewById(R.id.logoutacc);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profilepage(v);
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicpage(v);
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infopage(v);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logoutpage(v);
            }
        });
    }
    private void profilepage(View v){
        Intent i= new Intent (this, ProfileActivity1.class);
        startActivity(i);
    }
    private void musicpage(View v){
        Intent i= new Intent (this, Menu2Activity.class);
        startActivity(i);
    }
    private void infopage(View v){
        Intent i= new Intent (this, InfoActivity.class);
        startActivity(i);
    }
    private void logoutpage(View v){
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),MainActivity.class));

        //Intent i= new Intent (this, MainActivity.class);
        //startActivity(i);
    }

}