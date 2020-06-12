package com.example.tugasprogmob4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Lyrics1Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lyrics, container, false);
        TextView textView = v.findViewById(R.id.fragmentlyricmusic);

        //macepet-cepetan
        textView.setText("\nJani m'lati macepet-cepetan\nNanging limane tusing dadi matiang\nSejaba ento mekajang dadi\nNyenje kalah lakar gedhing");
        return v;
    }
}
