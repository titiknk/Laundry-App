package com.titikhofifa.laundryapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

public class Detail extends AppCompatActivity {

    ImageView whatsappBTN, mapsBTN;
    ImageView img;
    TextView judulText, detailText;
    TextView waText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar();
        img = findViewById(R.id.img);
        judulText = findViewById(R.id.judulText);
        detailText = findViewById(R.id.detailText);
        whatsappBTN = findViewById(R.id.wabtn);
        mapsBTN = findViewById(R.id.mapsbtn);
        waText = findViewById(R.id.watext);


        Intent intent = getIntent();
        int image = intent.getExtras().getInt("Logo");
        String judul = intent.getExtras().getString("Judul");

        img.setImageResource(image);
        judulText.setText(judul);

        getSupportActionBar().setTitle("Detail Laundry");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        whatsappBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://api.whatsapp.com/send?phone=" + waText.getText().toString();
                try {
                    PackageManager pm = getApplicationContext().getPackageManager();
                    pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                } catch (PackageManager.NameNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                }
            }
        });

        mapsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String loc = judulText.getText().toString();
                Uri locationUri = Uri.parse("geo:0,0?q=" + loc);
                Intent intent = new Intent(Intent.ACTION_VIEW, locationUri);
                startActivity(intent);

            }
        });


    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }




}