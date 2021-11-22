package com.example.sangredeespartano;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MostrarRutina extends AppCompatActivity {
    ArrayList<String> nombresDeGifs=new ArrayList<>();
    ArrayList<String> nombreDeEjercicios=new ArrayList<>();
    ArrayList<String> numeroRepeticiones=new ArrayList<>();
    ArrayList<Integer> tiempos=new ArrayList<>();
    ImageView imagenActualRutinaElegida;
    TextView textMostrarNombreEjercicio,textMostrarRepeticiones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_rutina);

        Bundle bolsaR=getIntent().getExtras();
        nombresDeGifs= bolsaR.getStringArrayList("nombresDeGifs");
        nombreDeEjercicios= bolsaR.getStringArrayList("nombreDeEjercicios");
        numeroRepeticiones= bolsaR.getStringArrayList("numeroRepeticiones");
        tiempos= bolsaR.getIntegerArrayList("tiempos");

        imagenActualRutinaElegida=(ImageView) findViewById(R.id.imagenActualRutinaElegida);
        textMostrarNombreEjercicio=(TextView)  findViewById(R.id.textMostrarNombreEjercicio);
        textMostrarRepeticiones=(TextView)  findViewById(R.id.textMostrarRepeticiones);


        Drawable drawable = getResources().getDrawable(getResources().getIdentifier(nombresDeGifs.get(0), "drawable",
                getPackageName()));
        Glide.with(this).load(drawable).into(imagenActualRutinaElegida);
        textMostrarNombreEjercicio.setText(nombreDeEjercicios.get(0));
        textMostrarRepeticiones.setText(numeroRepeticiones.get(0));


    }


}