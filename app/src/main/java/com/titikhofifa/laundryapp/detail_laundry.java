package com.titikhofifa.laundryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class detail_laundry extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item extra";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_laundry);

        TextView ciluk = findViewById(R.id.ciluk);

    LaundryModel laundryModel = getIntent().getParcelableExtra(ITEM_EXTRA);
    if (getSupportActionBar() !=null){
        getSupportActionBar().setTitle("Detail Laundry");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}