package com.titikhofifa.laundryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements LaundryRecycleViewInterface {

    private RecyclerView recyclerView;
    private ArrayList<LaundryModel> laundryModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        LaundryAdapter laundryAdapter = new LaundryAdapter(laundryModel);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(laundryAdapter);
    }

    private void getData() {
        laundryModel = new ArrayList<>();
        laundryModel.add(new LaundryModel("Washy Washy One Stop Professional Laundry Pandaan",R.drawable.washy_laundry));
        laundryModel.add(new LaundryModel("Cuci Express",R.drawable.bg_cuci));
        laundryModel.add(new LaundryModel("Lana Laundry Pandaan",R.drawable.lana_laundry));
        laundryModel.add(new LaundryModel("Daffa Laundry Pandaan",R.drawable.bg_daffa));
        laundryModel.add(new LaundryModel("Ardefa Laundry",R.drawable.bg_ardefa));
        laundryModel.add(new LaundryModel("Eka Laundry",R.drawable.bg_eka));
        laundryModel.add(new LaundryModel("Wati Laundry 1",R.drawable.bg_wati));
        laundryModel.add(new LaundryModel("Halo Laundry",R.drawable.bg_halo));
        laundryModel.add(new LaundryModel("Pinguin Laundry",R.drawable.bg_pinguin));
        laundryModel.add(new LaundryModel("Di@ Laundry",R.drawable.bg_dia));
        laundryModel.add(new LaundryModel("Cuci Karpet Mega Laundry 2",R.drawable.bg_mega));
        laundryModel.add(new LaundryModel("Barokah Laundry Bu Iklima",R.drawable.bg_barokah));
        laundryModel.add(new LaundryModel("Bintang Laundry",R.drawable.bg_bintang));
        laundryModel.add(new LaundryModel("AA Laundry & Cuci Karpet",R.drawable.bg_aa));
        laundryModel.add(new LaundryModel("Puji Laundry",R.drawable.bg_puji));
        laundryModel.add(new LaundryModel("Kirei Express Laundry",R.drawable.bg_kirei));
        laundryModel.add(new LaundryModel("Sari Laundry",R.drawable.bg_sari));
        laundryModel.add(new LaundryModel("Panji Laundry",R.drawable.bg_panji));
        laundryModel.add(new LaundryModel("Lingga Laundry",R.drawable.bg_lingga));


    }

    @Override
    public void onItemClick(int position) {

    }

    @Override
    public void onItemClick(LaundryModel laundryModel) {
        Intent moveintent = new Intent(MainActivity.this, detail_laundry.class);
        moveintent.putExtra(detail_laundry.ITEM_EXTRA, (CharSequence) laundryModel);
        startActivity(moveintent);
    }
//        ListView listView = findViewById(R.id.recycleview);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                if (i==0){
//                    //click pertama laundry
//
//                    startActivity(new Intent(MainActivity.this,detail_laundry.class));
//
//                }else if (i==1){
//
//                    startActivity(new Intent(MainActivity.this,detail_laundry.class));
//
//                }else{
//
//                }
//            }
//        });
}