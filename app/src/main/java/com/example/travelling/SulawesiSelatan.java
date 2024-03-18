package com.example.travelling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SulawesiSelatan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sulawesi_selatan);
    }

    public void toraja(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/ZJgZzj4pUtEea2Ap6"));
        startActivity(map);
    }

    public void bulukumba(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/MHwRuoN2v3y3ohvk8"));
        startActivity(map);
    }

    public void maros(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/9jzx4NahKUTQgfCd7"));
        startActivity(map);
    }

    public void instagram(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/visit_sulsel?igsh=MW52c3lmaHBpa3p0cg=="));
        startActivity(map);
    }
}