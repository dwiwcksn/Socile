package com.wicak.socile.ui.materi.mataram;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.wicak.socile.R;
import com.wicak.socile.ui.materi.kediri.video.VideoSejarah;
import com.wicak.socile.ui.materi.majapahit.video.videomajapahit;
import com.wicak.socile.ui.materi.mataram.video.videomataram;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class sejarahmataram extends Fragment {
    public sejarahmataram() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View root = inflater.inflate(R.layout.fragment_mataramsejarah, container, false);

        ImageButton button = root.findViewById(R.id.button_vid);

        button.setOnClickListener(view -> {
            Intent selesai = new Intent(getActivity(), videomataram.class);
            startActivity(selesai);
        });
        return root;
    }


}