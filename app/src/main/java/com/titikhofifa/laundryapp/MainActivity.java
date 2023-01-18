package com.titikhofifa.laundryapp;

import static java.time.LocalDateTime.now;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.time.LocalDateTime;
import java.util.ArrayList;

@RequiresApi(api = Build.VERSION_CODES.O)
public class MainActivity extends AppCompatActivity {

    private LocalDateTime waktu = now();

    ModelRecycleView modelRecycleView;

    RecyclerView recyclerView;
    ArrayList<Model> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrayList.add(new Model(R.drawable.washy_laundry,"Washy Washy One Stop Professional Laundry Pandaan"));
        arrayList.add(new Model(R.drawable.bg_cuci,"Cuci Express"));
        arrayList.add(new Model(R.drawable.lana_laundry,"Lana Laundry Pandaan"));
        arrayList.add(new Model(R.drawable.bg_daffa,"Daffa Laundry Pandaan"));
        arrayList.add(new Model(R.drawable.bg_ardefa,"Ardefa Laundry"));
        arrayList.add(new Model(R.drawable.bg_eka,"Eka Laundry"));
        arrayList.add(new Model(R.drawable.bg_wati,"Wati Laundry"));
        arrayList.add(new Model(R.drawable.bg_halo,"Halo Laundry"));
        arrayList.add(new Model(R.drawable.bg_pinguin,"Pinguin Laundry"));
        arrayList.add(new Model(R.drawable.bg_dia,"Di@ Laundry"));
        arrayList.add(new Model(R.drawable.bg_mega,"Cuci Karpet Mega Laundry"));
        arrayList.add(new Model(R.drawable.bg_barokah,"Barokah Laundry Bu Iklima"));
        arrayList.add(new Model(R.drawable.bg_bintang,"Bintang Laundry"));
        arrayList.add(new Model(R.drawable.bg_aa,"AA Laundry & Cuci Karpet"));
        arrayList.add(new Model(R.drawable.bg_puji,"Puji Laundry"));
        arrayList.add(new Model(R.drawable.bg_kirei,"Kirei Express Laundry"));
        arrayList.add(new Model(R.drawable.bg_sari,"Sari Laundry"));
        arrayList.add(new Model(R.drawable.bg_panji,"Panji Laundry"));
        arrayList.add(new Model(R.drawable.bg_lingga,"Lingga Laundry"));
        arrayList.add(new Model(R.drawable.bg_orange,"Orange Laundry"));
        arrayList.add(new Model(R.drawable.bg_purple,"Purple Laundry"));
        arrayList.add(new Model(R.drawable.bg_imel,"IMEL Laundry"));
        arrayList.add(new Model(R.drawable.bg_mamamia,"Mamamia Laundry"));
        arrayList.add(new Model(R.drawable.bg_nandyto,"Nandyto Laundry"));
        arrayList.add(new Model(R.drawable.bg_indri,"Indri Laundry"));
        arrayList.add(new Model(R.drawable.bg_qisya,"Qisya Laundry"));
        arrayList.add(new Model(R.drawable.bg_pink,"Pink Laundry"));
        arrayList.add(new Model(R.drawable.bg_naela,"Naela Laundry"));
        arrayList.add(new Model(R.drawable.bg_alvi,"ALVI Laundry"));
        arrayList.add(new Model(R.drawable.bg_jasika,"Jasika Laundry"));
        arrayList.add(new Model(R.drawable.bg_takidy,"Laundry Takidy"));
        arrayList.add(new Model(R.drawable.bg_berkah,"Berkah Laundry"));
        arrayList.add(new Model(R.drawable.bg_vino,"Vino Laundry"));
        arrayList.add(new Model(R.drawable.bg_putri,"Putri Laundry"));
        arrayList.add(new Model(R.drawable.bg_helen,"Helen Laundry"));
        arrayList.add(new Model(R.drawable.bg_naufal,"Naufal Laundry 2"));
        arrayList.add(new Model(R.drawable.bg_fidi,"FIDI Laundry"));
        arrayList.add(new Model(R.drawable.bg_birawidha,"Birawidha Laundry"));
        arrayList.add(new Model(R.drawable.bg_rcl,"Rumah Cuci Laundry"));
        arrayList.add(new Model(R.drawable.bg_lail,"Lail Laundry"));
        arrayList.add(new Model(R.drawable.bg_omah,"Omah Laundry"));
        arrayList.add(new Model(R.drawable.bg_dj,"DJ Laundry"));
        arrayList.add(new Model(R.drawable.bg_dn,"DN Laundry"));
        arrayList.add(new Model(R.drawable.bg_afi,"Afi Laundry"));
        arrayList.add(new Model(R.drawable.bg_pis,"Pis Laundry"));
        arrayList.add(new Model(R.drawable.bg_koko,"Koko Laundry"));
        arrayList.add(new Model(R.drawable.bg_l9,"L9 Laundry"));
        arrayList.add(new Model(R.drawable.bg_rama,"Rama Laundry"));
        arrayList.add(new Model(R.drawable.bg_nailah,"Nailah Laundry"));
        arrayList.add(new Model(R.drawable.bg_luna,"Luna Laundry"));
        arrayList.add(new Model(R.drawable.bg_desi,"Desi Laundry"));
        arrayList.add(new Model(R.drawable.bg_lish,"Lish Laundry"));
        arrayList.add(new Model(R.drawable.bg_artha,"Artha Mas Laundry"));
        arrayList.add(new Model(R.drawable.bg_iis,"Iis Laundry"));
        arrayList.add(new Model(R.drawable.bg_indah,"Indah Laundry"));
        arrayList.add(new Model(R.drawable.bg_papa,"Laundry Papa Yoyon"));
        arrayList.add(new Model(R.drawable.bg_nice,"D'nice Laundry"));
        arrayList.add(new Model(R.drawable.bg_chacha,"Chacha Laundry"));
        arrayList.add(new Model(R.drawable.bg_anugrah,"Anugrah Laundry"));
        arrayList.add(new Model(R.drawable.bg_amin,"Amin Laundry"));
        arrayList.add(new Model(R.drawable.bg_qloan,"Q-Loan Laundry"));
        arrayList.add(new Model(R.drawable.bg_hartatik,"Hartatik Laundry"));
        arrayList.add(new Model(R.drawable.bg_pratama,"Pratama Laundry"));
        arrayList.add(new Model(R.drawable.bg_kilang,"Kilang Laundry"));
        arrayList.add(new Model(R.drawable.bg_rizky,"Rizky Laundry"));
        arrayList.add(new Model(R.drawable.bg_rytha,"Rytha Laundry"));
        arrayList.add(new Model(R.drawable.bg_monggo,"Monggo Laundry"));
        arrayList.add(new Model(R.drawable.bg_jumaiyah,"Jumaiyah Laundry"));


        ModelRecycleView modelRecycleView = new ModelRecycleView(this, arrayList);
        recyclerView.setAdapter(modelRecycleView);

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setIcon(R.drawable.ic_baseline_exit_to_app_24);
        alertDialog.setTitle("Keluar dari Aplikasi Laundry");
        alertDialog.setMessage("Apakah kamu ingin keluar dari Aplikasi Laundry?");
        alertDialog.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
            }
        });
        alertDialog.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.show();
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d("MainActivity onStart: ", String.valueOf(waktu));
    }

    @SuppressLint("LongLogTag")
    @Override
    protected void onResume() {
        super.onResume();
        waktu = now();
        Log.d("MainActivity onResume: ", String.valueOf(waktu));
    }

    @Override
    protected void onPause() {
        super.onPause();
        waktu = now();
        Log.d("MainActivity onPause: ", String.valueOf(waktu));
    }

    @SuppressLint("LongLogTag")
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("MainActivity onDestroy: ", String.valueOf(waktu));
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d("MainActivity onStop: ", String.valueOf(waktu));
    }
}