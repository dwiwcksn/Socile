package com.wicak.socile.ui.materi.kutai;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.wicak.socile.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class Kutai extends Fragment {
    public Kutai() {
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



       // button_nipel.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View view) {
             //   Intent selesai = new Intent(getActivity(), VideoKunciKombi.class);
               // startActivity(selesai);
            //}
        //});

        //button_ring.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View view) {
              //  Intent selesai = new Intent(getActivity(), VideoKunciRing.class);
                //startActivity(selesai);
            //}
        //});
        //button.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  Pas.this.video();
            //}
        //});
        
        return root;
    }

    public void video() {
        //Intent selesai = new Intent(getActivity(), VideoKunciPas.class);
        //startActivity(selesai);
    }


}