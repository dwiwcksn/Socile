package com.wicak.socile.ui.materi.kutai;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.wicak.socile.R;
import com.wicak.socile.ui.materi.kutai.video.videokutai;
//import com.wicak.sociallearning.ui.materi.kunci.video.VideoAllen;
//import com.wicak.plito.ui.materi.tang.video.VideoPotong;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class Sejarahkutai extends Fragment {
    public Sejarahkutai() {
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


        View root = inflater.inflate(R.layout.fragment_kutaisejarah, container, false);

        ImageButton button = root.findViewById(R.id.button_vid);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent selesai = new Intent(getActivity(), videokutai.class);
                startActivity(selesai);
            }
        });
        return root;
    }


}