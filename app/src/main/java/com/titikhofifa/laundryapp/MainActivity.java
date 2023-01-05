package com.titikhofifa.laundryapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

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





        ModelRecycleView modelRecycleView = new ModelRecycleView(this, arrayList);
        recyclerView.setAdapter(modelRecycleView);

    }
}