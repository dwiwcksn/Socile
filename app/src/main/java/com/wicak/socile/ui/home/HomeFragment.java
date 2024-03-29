package com.wicak.socile.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.wicak.socile.R;
import com.wicak.socile.ui.info.InfoFragment;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        RelativeLayout btnPetunjuk = (RelativeLayout) root.findViewById(R.id.petunjukbtn);
        btnPetunjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InfoFragment nextFrag= new InfoFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.hal_home, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        return root;
    }
}