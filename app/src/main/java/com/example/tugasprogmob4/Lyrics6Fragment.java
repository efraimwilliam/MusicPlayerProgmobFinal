package com.example.tugasprogmob4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Lyrics6Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lyrics6, container, false);
        TextView textView = v.findViewById(R.id.fragmentlyricmusic6);

        //Jangi Janger
        textView.setText("\nJangi Janger,  sengsenge sengseng janger,\n" +
                "\n" +
                "Sengsenge sengseng janger.\n" +
                "\n" +
                "Serere nyomane nyore.\n" +
                "\n" +
                "Kelap kelap ngalap bunga\n" +
                "\n" +
                "Langsing lanjar pamulune nyandat gading\n" +
                "\n" +
                "Jalan jani mejangeran\n" +
                "\n" +
                "Seledet enyorina tiyang\n" +
                "\n" +
                "Arasijang krangi janger, arasijang krangi janger\n" +
                "\n" +
                "Arasijang krangi janger, arasijang krngi janger.\n" +
                "\n" +
                "Jangi Janger,  Sengsenge sengseng janger,\n" +
                "\n" +
                "Sengsenge sengseng janger.\n" +
                "\n" +
                "Serere nyomane nyore.\n" +
                "\n" +
                "Kelap kelap ngalap bunga\n" +
                "\n" +
                "Langsing lanjar pamulune nyandat gading\n" +
                "\n" +
                "Jalan jani mejangeran\n" +
                "\n" +
                "Seriang ngentur rora roti.");
        return v;
 }
}
