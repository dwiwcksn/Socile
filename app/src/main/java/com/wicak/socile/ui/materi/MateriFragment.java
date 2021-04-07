package com.wicak.socile.ui.materi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wicak.socile.R;

import java.util.ArrayList;
import java.util.List;

public class MateriFragment extends Fragment {

    private MateriViewModel materiViewModel;
    private RecyclerView rv;
    private MateriAdapter adapter;
    private List<Materi> lstMateri;

    public MateriFragment newInstance(){
        return new MateriFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState){super.onCreate(savedInstanceState);}

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();

        View root = inflater.inflate(R.layout.fragment_materi, container, false);

        lstMateri = new ArrayList<>();
        adapter = new MateriAdapter(this, lstMateri);
        rv = (RecyclerView) root.findViewById(R.id.rv_idmateri);
//        rv.setHasFixedSize(false);
        rv.setLayoutManager(new GridLayoutManager(getContext(),2));

        MateriAdapter adapter = new MateriAdapter(this, lstMateri);

        rv.setAdapter(adapter);
        lstMateri.add(new Materi("Kutai", "Categories 1", "Description", R.drawable.i1));
        lstMateri.add(new Materi("Tarumanegara", "Categories 2", "Description", R.drawable.i2));
        lstMateri.add(new Materi("Mataram", "Categories 3", "Description", R.drawable.i3));
        lstMateri.add(new Materi("Kediri", "Categories 4", "Description", R.drawable.i4));
        lstMateri.add(new Materi("Singosari", "Categories 5", "Description", R.drawable.i5));
        lstMateri.add(new Materi("Majapahit", "Categories 6", "Description", R.drawable.i6));
        return root;

    }
}
