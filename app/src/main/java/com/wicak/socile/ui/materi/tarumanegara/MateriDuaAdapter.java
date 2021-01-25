package com.wicak.socile.ui.materi.tarumanegara;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wicak.socile.R;

import java.util.List;

public class MateriDuaAdapter extends RecyclerView.Adapter<MateriDuaViewModel> {

    //    private Context mContext;
    private MateriDua context;
    private List<com.wicak.socile.ui.materi.tarumanegara.MtrDua> mData;

    public MateriDuaAdapter(MateriDua context, List<com.wicak.socile.ui.materi.tarumanegara.MtrDua> mData) {
        this.context =  context;
        this.mData = mData;
    }


    @NonNull
    @Override
    public MateriDuaViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_materi, parent, false);
        return new MateriDuaViewModel(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MateriDuaViewModel holder, int position) {

        holder.materi_title.setText(mData.get(position).getTitle());
        holder.img_thumbnail.setImageResource(mData.get(position).getThumbnail());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


}
