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
        laundryModel.add(new LaundryModel("Washy washy",R.drawable.pyro));
        laundryModel.add(new LaundryModel("Laundry 2",R.drawable.pyro));
        laundryModel.add(new LaundryModel("Washy washy",R.drawable.pyro));
        laundryModel.add(new LaundryModel("Washy washy",R.drawable.pyro));
        laundryModel.add(new LaundryModel("Washy washy",R.drawable.pyro));
        laundryModel.add(new LaundryModel("Washy washy",R.drawable.pyro));
        laundryModel.add(new LaundryModel("Washy washy",R.drawable.pyro));
        laundryModel.add(new LaundryModel("Washy washy",R.drawable.pyro));
        laundryModel.add(new LaundryModel("Washy washy",R.drawable.pyro));
        laundryModel.add(new LaundryModel("Washy washy",R.drawable.pyro));
        laundryModel.add(new LaundryModel("Washy washy",R.drawable.pyro));
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