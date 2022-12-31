package com.titikhofifa.laundryapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

public class Detail extends AppCompatActivity {


    ImageView img;
    TextView judulText, detailText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar();
        img = findViewById(R.id.img);
        judulText = findViewById(R.id.judulText);
        detailText = findViewById(R.id.detailText);

        Intent intent = getIntent();
        int image = intent.getExtras().getInt("Logo");
        String judul = intent.getExtras().getString("Judul");

        img.setImageResource(image);
        judulText.setText(judul);

        getSupportActionBar().setTitle("Detail Laundry");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}