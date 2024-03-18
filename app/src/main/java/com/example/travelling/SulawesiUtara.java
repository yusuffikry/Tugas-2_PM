package com.example.travelling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SulawesiUtara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sulawesi_utara);
    }

    public void bunaken(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/yCfjtSJwjHx9cXSKA"));
        startActivity(map);
    }


    public void lokon(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/Lv56HZhuHKFT89iq8"));
        startActivity(map);
    }

    public void instagram(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/amazingsulut?igsh=dzlobHkzOWk5ZnB2"));
        startActivity(map);
    }

    public void manado(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/KPjsBHiRJnNaJ6HX6"));
        startActivity(map);
    }
}