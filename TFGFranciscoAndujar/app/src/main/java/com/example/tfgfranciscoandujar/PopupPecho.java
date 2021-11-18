package com.example.tfgfranciscoandujar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class PopupPecho extends AppCompatActivity {

    ImageView gifPecho;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_pecho);

        DisplayMetrics medidasVentana=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidasVentana);

        int ancho=medidasVentana.widthPixels;
        int alto=medidasVentana.widthPixels;

        getWindow().setLayout((int)(ancho*0.85),(int)(alto*0.85));
        gifPecho = (ImageView) findViewById(R.id.imgGifAyudaPecho);
        Glide.with(this).load(R.drawable.ejercicios1).into(gifPecho);
    }
}