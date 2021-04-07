package com.wicak.socile.ui.quiz;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.wicak.socile.BottomActivity;
import com.wicak.socile.R;

public class MulaiKuis extends AppCompatActivity {

    TextView pertanyaan, judul;
    RadioGroup rg;
    RadioButton PilA, PilB, PilC, PilD;
    ImageView imgKuis;
    ImageButton nxt;
    int nomor = 0;

    private long backPressedTime;

    public static int hasil, benar, salah;

    String[] nomor_urut = new String[]{
            "1","2","3","4","5","6","7","8","9","10"

    };
    String[] pertanyaan_kuis = new String[]{
            "1.Kerajaan Hindu tertua di Indonesia adalah…  ",
            "2.Prasasti peninggalan Kerajaan Tarumanegara yang terdapat pahatan telapak kaki Raja Purnawarman adalah…",
            "3.Raja Jayabaya terkenal dengan ramalannya yang disebut…",
            "4.Candi Hindu terbesar peninggalan Kerajaan Mataram Kuno yaitu…",
            "5.Kerajaan Singosari pertama kali didirikan oleh…",
            "6.Isi sumpah Palapa yang diucapkan Patih Gajah Mada adalah…",
            "7.Letak Kerajaan Kutai berdasarkan gambar di atas, ditunjukkan dengan abjad… ",
            "8.Peninggalan Kerajaan Singosari yang digunakan sebagai pemujaan terhadap Ken Dedes istri Ken Arok yaitu…",
            "9.Letak Kerajaan Kediri berdasarkan gambar di atas, ditunjukkan dengan nomor…",
            "10.Raja terakhir dan menjadi masa kejayaan Kerajaan Singosari yaitu…"

    };

    String[] pilihan_jawaban = new String[]{
            "Kutai","Tarumanegara","Majapahit","Singosari",
            "Prasasti Jambu","Prasasti Kebon Kopi","Prasasti Ciaruteun","Prasasti Lebak",
            "Palapa","Jangka Jayabaya","Prasasti Ngantang","Kitab Kakawin Bharatayuda",
            "Candi Penataran","Candi Prambanan","Candi Jago","Candi Kidal",
            "Raden Wijaya","Kudungga","Ken Arok","Jaysingawarman",
            "Cita-cita untuk membuat kehidupan rakyat Majapahit menjadi damai dan sejahtera","Cita-cita Gajah Mada mempersatukan nusantara dibawah kekuasaan Majapahit","Keinginan untuk mengalahkan seluruh kerajaan yang ada di nusantara.","Keinginan menjadi patih yang setia mendampingi Raja Hayam Wuruk",
            "A","B","C","D",
            "Candi Singosari","Prasasti Padelegan","Prasasti Tugu","Arca Prajnaparamita",
            "1","2","3","4",
            "Kertanegara","Ken Arok","Anusapati","Tohjaya"
    };

    String[] jawaban_benar = new String[]{
            "Kutai",
            "Prasasti Ciaruteun",
            "Jangka Jayabaya",
            "Candi Prambanan",
            "Ken Arok",
            "Cita-cita Gajah Mada mempersatukan nusantara dibawah kekuasaan Majapahit",
            "D",
            "Arca Prajnaparamita",
            "4",
            "Kertanegara"
    };

    private static final Integer[] img ={
            R.drawable.rb_a_checked,
            R.drawable.rb_a_checked,
            R.drawable.rb_a_checked,
            R.drawable.rb_a_checked,
            R.drawable.rb_a_checked,
            R.drawable.rb_a_checked,
            R.drawable.letakkutai,
            R.drawable.rb_a_checked,
            R.drawable.letakkediri,
            R.drawable.rb_a_checked
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai_kuis);
        judul = findViewById(R.id.jud);
        pertanyaan = findViewById(R.id.pertanyaan);
        nxt = findViewById(R.id.nxtbutton);
        nxt.setVisibility(View.GONE);
        rg = findViewById(R.id.radio_group);
        PilA = findViewById(R.id.pilihanA);
        PilB = findViewById(R.id.pilihanB);
        PilC = findViewById(R.id.pilihanC);
        PilD = findViewById(R.id.pilihanD);
        imgKuis = findViewById(R.id.imageView2);

        judul.setText(nomor_urut[nomor]+"/10");
        pertanyaan.setText(pertanyaan_kuis[nomor]);
        PilA.setText(pilihan_jawaban[0]);
        PilB.setText(pilihan_jawaban[1]);
        PilC.setText(pilihan_jawaban[2]);
        PilD.setText(pilihan_jawaban[3]);


        rg.check(0);
        benar = 0;
        salah = 0;
        nxt.setVisibility(View.GONE);
        nxt.animate().translationY(nxt.getHeight());



    }

    @SuppressLint("NonConstantResourceId")
    public void onRBClicked (View view){
        boolean isSelected = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.pilihanA:
            case R.id.pilihanD:
            case R.id.pilihanB:
            case R.id.pilihanC:
                if (isSelected) {
                    nxt.setVisibility(View.VISIBLE);
                    nxt.animate().translationY(0);
                }else{
                    nxt.setVisibility(View.GONE);
                    nxt.animate().translationY(nxt.getHeight());
                }
                break;
        }
    }
    public void onBackPressed() {
        if(backPressedTime +2000 > System.currentTimeMillis()){
            finish();
            Intent backhome  = new Intent(getApplicationContext(), BottomActivity.class);
            startActivity(backhome);
        }else {
            Toast backToast = Toast.makeText(getBaseContext(), "Press back again to Main Menu", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime =System.currentTimeMillis();

    }

    @SuppressLint("SetTextI18n")
    public void next(View view){

        if (PilA.isChecked() || PilB.isChecked() || PilC.isChecked() || PilD.isChecked()) {
            RadioButton jawaban_user = findViewById(rg.getCheckedRadioButtonId());
            String ambil_jawaban_user = jawaban_user.getText().toString();
            rg.check(0);
            nxt.setVisibility(View.GONE);
            nxt.animate().translationY(nxt.getHeight());
            if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor]))
            {
                benar++;
                AlertDialog.Builder dial = new AlertDialog.Builder(this);
                dial.setMessage("Jawaban Kamu Benar")
                        .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                dial.create();
                dial.show();

            }
            else{
                salah++;
                AlertDialog.Builder dial = new AlertDialog.Builder(this);
                dial.setMessage("Jawaban Kamu Salah")
                        .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                dial.create();
                dial.show();

            }
            nomor++;

            if (nomor < pertanyaan_kuis.length) {
                judul.setText(nomor_urut[nomor] +"/10" );
                pertanyaan.setText(pertanyaan_kuis[nomor]);
                imgKuis.setImageResource(img[nomor]);
                PilA.setText(pilihan_jawaban[nomor * 4]);
                PilB.setText(pilihan_jawaban[(nomor * 4) + 1]);
                PilC.setText(pilihan_jawaban[(nomor * 4) + 2]);
                PilD.setText(pilihan_jawaban[(nomor * 4) + 3]);
            } else {
                hasil = benar * 10;
                Intent selesai = new Intent(getApplicationContext(), HasilKuis.class);
                startActivity(selesai);
            }
        }
        else {
            Toast.makeText(this, "Pilih Terlebih dahulu", Toast.LENGTH_SHORT).show();
        }
    }

}