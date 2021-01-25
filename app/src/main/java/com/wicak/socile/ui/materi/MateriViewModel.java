package com.wicak.socile.ui.materi;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.wicak.socile.R;
import com.wicak.socile.ui.materi.kediri.Tabskediri;
import com.wicak.socile.ui.materi.kutai.Tabskutai;
import com.wicak.socile.ui.materi.majapahit.Tabsmajapahit;
import com.wicak.socile.ui.materi.mataram.Tabsmataram;
import com.wicak.socile.ui.materi.singasari.Tabsingasari;
import com.wicak.socile.ui.materi.tarumanegara.Tabstarumanegara;

public class MateriViewModel extends RecyclerView.ViewHolder {
    public TextView materi, materi_title;
    public ImageView img_thumbnail;
    public LinearLayout linearLayout;
    public CardView cardView;
    Context context;
    private MutableLiveData<String> mText;

    public MateriViewModel(View itemView) {
        super(itemView);
        context = itemView.getContext();

        materi_title = itemView.findViewById(R.id.cv_title);
        img_thumbnail = itemView.findViewById(R.id.cv_img);
//        linearLayout = itemView.findViewById(R.id.linear_card);
        cardView = itemView.findViewById(R.id.cv_click);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                switch (MateriViewModel.this.getAdapterPosition()) {
                    case 0:
                        intent = new Intent(context, Tabskutai.class);
                        break;
                    case 1:
                        intent = new Intent(context, Tabstarumanegara.class);
                        break;
                    case 2:
                        intent = new Intent(context, Tabsmataram.class);
                        break;
                    case 3:
                        intent = new Intent(context, Tabskediri.class);
                        break;
                    case 4:
                        intent = new Intent(context, Tabsingasari.class);
                        break;
                    case 5:
                        intent = new Intent(context, Tabsmajapahit.class);
                        break;
                }
                context.startActivity(intent);
            }
        });
    }

}