package com.wicak.socile.ui.materi.kutai;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.wicak.socile.MainActivity;
import com.wicak.socile.R;

public class MateriSatuViewModel extends RecyclerView.ViewHolder {
    public TextView materi, materi_title;
    public ImageView img_thumbnail;
    public CardView cardView;
    Context context;
    private MutableLiveData<String> mText;

    public MateriSatuViewModel(View itemView) {
        super(itemView);
        context = itemView.getContext();

        materi_title = itemView.findViewById(R.id.cv_title);
        img_thumbnail = itemView.findViewById(R.id.cv_img);
        cardView = itemView.findViewById(R.id.cv_click);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                switch (com.wicak.socile.ui.materi.kutai.MateriSatuViewModel.this.getAdapterPosition()) {
                    case 0:
                        intent = new Intent(context, MainActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, MainActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, MainActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, MainActivity.class);
                        break;
                }
                context.startActivity(intent);
            }
        });
    }

}