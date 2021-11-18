package com.example.tfgfranciscoandujar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class PopupBrazos extends AppCompatActivity {
    ImageView gifBrazos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_brazos);

        DisplayMetrics medidasVentana=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidasVentana);

        int ancho=medidasVentana.widthPixels;
        int alto=medidasVentana.widthPixels;

        getWindow().setLayout((int)(ancho*0.85),(int)(alto*0.85));
        gifBrazos = (ImageView) findViewById(R.id.imgGifAyudaBrazos);
        Glide.with(this).load(R.drawable.ejercicios1).into(gifBrazos);
    }
}