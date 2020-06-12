package com.example.tugasprogmob4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Lyrics4Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_lyrics4, container, false);
        TextView textView = v.findViewById(R.id.fragmentlyricmusic4);

        //Putri Cening Ayu
        textView.setText("\nCening putri ayu Ngijeng Cening jumah\nMemeluas malu Ke peken meb'lanje\nApang ade daharan nasi\n" +
                "Memetiang ngiring Nongos ngijeng jumah\nSambilan mekumpul Ajak titiang dadue\nDitekani nyenggap gapin\n" +
                "Pelalian Cening Kotak wadah gerip\nJaje megenepan Ane luwung luwung\nBunge melah melah Ambunane sarwe miyik");
        return v;
    }
}
