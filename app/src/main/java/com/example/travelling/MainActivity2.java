package com.example.travelling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void telusuri1(View view) {
        Intent intent = new Intent(MainActivity2.this, SulawesiSelatan.class);
        startActivity(intent);
    }

    public void sultra(View view) {
        Intent intent = new Intent(MainActivity2.this, SulawesiTenggara.class);
        startActivity(intent);
    }

    public void sulut(View view) {
        Intent intent = new Intent(MainActivity2.this, SulawesiUtara.class);
        startActivity(intent);
    }

    public void instagram(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/fikhi_12?igsh=azJtenRyYW50YmFh"));
        startActivity(map);
    }


    public void github(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/yusuffikry"));
        startActivity(map);
    }
}