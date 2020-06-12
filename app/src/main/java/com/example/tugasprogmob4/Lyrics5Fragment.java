package com.example.tugasprogmob4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Lyrics5Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lyrics5, container, false);
        TextView textView = v.findViewById(R.id.fragmentlyricmusic5);

        //Putri Anom
        textView.setText("\nRatu anom metangi meilen-ilen\n" +
                "Ratu anom metangi meilen-ilen\n" +
                "Dong pirengang munyin sulinge di jaba\n" +
                "Dong pirengang munyin sulinge di jaba\n" +
                "\n" +
                "Nyen ento menyuling di jaba tengah\n" +
                "Nyen ento menyuling di jaba tengah\n" +
                "Gusti Ngurah Alit Jambe Pemecutan\n" +
                "Gusti Ngurah Alit Jambe Pemecutan");
        return v;
    }
}
