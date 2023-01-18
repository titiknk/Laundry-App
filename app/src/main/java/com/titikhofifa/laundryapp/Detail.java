package com.titikhofifa.laundryapp;

import static java.time.LocalDateTime.now;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalDateTime;

@RequiresApi(api = Build.VERSION_CODES.O)
public class Detail extends AppCompatActivity {

    private LocalDateTime waktu = now();


    ImageView whatsappBTN, mapsBTN;
    ImageView img;
    TextView judulText, detailText;
    TextView waText;

    Context context;
    Toast toastWA, toastMap;
    String waToast, mapToast;
    int duration;


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

        duration = Toast.LENGTH_SHORT;
        waToast = "Buka Whatsapp";
        mapToast = "Buka Maps";
        context = getApplicationContext();
        toastWA = Toast.makeText(context,waToast,duration);
        toastMap = Toast.makeText(context,mapToast,duration);


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
                toastWA.show();

                //String url = "https://api.whatsapp.com/send?phone=" + waText.getText().toString();

                String url = "https://wa.me/" + waText.getText().toString() + "?text=Permisi,%20Apakah%20benar%20ini%20toko%20jasa%20Laundry?";
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
                toastMap.show();
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

    @SuppressLint("LongLogTag")
    @Override
    public void onStart(){
        super.onStart();
        Log.d("DetailActivity onStart: ", String.valueOf(waktu));
    }

    @SuppressLint("LongLogTag")
    @Override
    protected void onResume() {
        super.onResume();
        waktu = now();
        Log.d("DetailActivity onResume: ", String.valueOf(waktu));
    }

    @SuppressLint("LongLogTag")
    @Override
    protected void onPause() {
        super.onPause();
        waktu = now();
        Log.d("DetailActivity onPause: ", String.valueOf(waktu));
    }

    @SuppressLint("LongLogTag")
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("DetailActivity onDestroy: ", String.valueOf(waktu));
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d("DetailActivity onStop: ", String.valueOf(waktu));
    }

}