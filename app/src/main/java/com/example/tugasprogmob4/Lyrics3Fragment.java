package com.example.tugasprogmob4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Lyrics3Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lyrics3, container, false);
        TextView textView = v.findViewById(R.id.fragmentlyricmusic3);

        //Tresna Mejohan
        textView.setText("\nInget dugase ipidan\n" +
                "Beli menjanji teken Tiang\n" +
                "Sing lakar ninggalin tresna\n" +
                "Ulian iraga mejohan\n" +
                "\n" +
                "Nanging jani Beli metilar\n" +
                "Bli ngorahang kel sing ngidaang\n" +
                "Nyalanin ajak Tiang\n" +
                "Ulian karena iraga mejohan\n" +
                "\n" +
                "Sujatine Tiang nu sayang\n" +
                "Ape ke Beli masih nu sayang ken Tiang\n" +
                "\n" +
                "Tiang dini setate ngenehang\n" +
                "Janji-janji ane pidan gelahang\n" +
                "Sing kel palas ulian mejohan\n" +
                "\n" +
                "Nanging Beli tusing ngidaang\n" +
                "Ngantosang Tiang buin manian\n" +
                "Nanging Beli harus tahu\n" +
                "Tiang dini nu seken sayang\n" +
                "\n" +
                "Nu seken sayang\n" +
                "Sayang ken Beli\n" +
                "Tresna ken Beli\n" +
                "Kanti mati\n" +
                "Antosan Tiang Beli\n" +
                "\n" +
                "Sujatine Tiang nu sayang\n" +
                "Ape ke Beli masih nu sayang ken Tiang\n" +
                "\n" +
                "Tiang dini setate ngenehang\n" +
                "Janji-janji ane pidan gelahang\n" +
                "Sing kel palas ulian mejohan\n" +
                "\n" +
                "Nanging Beli tusing ngidaang\n" +
                "Ngantosang Tiang buin manian\n" +
                "Nanging Beli harus tahu\n" +
                "Tiang dini nu seken sayang\n" +
                "\n" +
                "Nu seken sayang\n" +
                "Sayang ken Beli\n" +
                "Tresna ken Beli\n" +
                "Kanti mati\n" +
                "Antosan Tiang Beli\n" +
                "Tresna kanti mati");
        return v;}
}
