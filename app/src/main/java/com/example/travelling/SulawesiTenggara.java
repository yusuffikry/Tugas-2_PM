package com.example.travelling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SulawesiTenggara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sulawesi_tenggara);
    }

    public void wakatobi(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/TcuAn3WHS9nDKKE59"));
        startActivity(map);
    }


    public void moramo(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/FRBWDTWC9t6mQSFJA"));
        startActivity(map);
    }

    public void kendari(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/2CHKi5tnhFJdn8x57"));
        startActivity(map);
    }

    public void instagram(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/visit_sultra?igsh=Y20yN2VlajRnejlt"));
        startActivity(map);
    }
}