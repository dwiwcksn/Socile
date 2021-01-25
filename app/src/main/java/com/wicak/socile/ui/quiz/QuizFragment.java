package com.wicak.socile.ui.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.wicak.socile.R;

public class QuizFragment extends Fragment {

    private QuizViewModel notificationsViewModel;
    Button mulai;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(QuizViewModel.class);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();

        View root = inflater.inflate(R.layout.fragment_quiz, container, false);

        mulai = root.findViewById(R.id.mulaiKuisBtn);
        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backhome  = new Intent(getContext(), MulaiKuis.class);
                startActivity(backhome);
            }
        });


        return root;
    }
}