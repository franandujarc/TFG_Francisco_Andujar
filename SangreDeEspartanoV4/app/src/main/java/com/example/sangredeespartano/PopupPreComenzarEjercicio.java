package com.example.sangredeespartano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PopupPreComenzarEjercicio extends AppCompatActivity {

    ImageView imagenEjercicioElegido;

    Button boronRutina;
    ArrayList<String> nombresDeGifs=new ArrayList<>();
    ArrayList<ImageView> idImagenes=new ArrayList<>();
    ArrayList<TextView> idTexto=new ArrayList<>();
    ArrayList<String> nombreDeEjercicios=new ArrayList<>();
    ArrayList<String> numeroRepeticiones=new ArrayList<>();
    ArrayList<Integer> tiempos=new ArrayList<>();
    String datosQueCargar;
    Bundle bolsa=new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_pre_comenzar_ejercicio);

        DisplayMetrics medidasVentana=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidasVentana);

        int ancho=medidasVentana.widthPixels;
        int alto=medidasVentana.widthPixels;

        getWindow().setLayout((int)(ancho*0.85),(int)(alto*1.25));
        boronRutina=(Button)  findViewById(R.id.botonEmpezarRutina);
        imagenEjercicioElegido=(ImageView) findViewById(R.id.imgEjercicioElegido);



        idImagenes.add((ImageView)findViewById(R.id.imgVaciaEjercicio1));
        idImagenes.add((ImageView)findViewById(R.id.imgVaciaEjercicio2));
        idImagenes.add((ImageView)findViewById(R.id.imgVaciaEjercicio3));
        idImagenes.add((ImageView)findViewById(R.id.imgVaciaEjercicio4));;
        idImagenes.add((ImageView)findViewById(R.id.imgVaciaEjercicio5));
        idImagenes.add((ImageView)findViewById(R.id.imgVaciaEjercicio6));
        idImagenes.add((ImageView)findViewById(R.id.imgVaciaEjercicio7));
        idImagenes.add((ImageView)findViewById(R.id.imgVaciaEjercicio8));
        idImagenes.add((ImageView)findViewById(R.id.imgVaciaEjercicio9));
        idImagenes.add((ImageView)findViewById(R.id.imgVaciaEjercicio10));
        idImagenes.add((ImageView)findViewById(R.id.imgVaciaEjercicio11));
        idImagenes.add((ImageView)findViewById(R.id.imgVaciaEjercicio12));
        idImagenes.add((ImageView)findViewById(R.id.imgVaciaEjercicio13));
        idImagenes.add((ImageView)findViewById(R.id.imgVaciaEjercicio14));
        idImagenes.add((ImageView)findViewById(R.id.imgVaciaEjercicio15));

        idTexto.add((TextView) findViewById(R.id.textVacioEjercicio1));
        idTexto.add((TextView)  findViewById(R.id.textVacioEjercicio2));
        idTexto.add((TextView)  findViewById(R.id.textVacioEjercicio3));
        idTexto.add((TextView)  findViewById(R.id.textVacioEjercicio4));
        idTexto.add((TextView)  findViewById(R.id.textVacioEjercicio5));
        idTexto.add((TextView)  findViewById(R.id.textVacioEjercicio6));
        idTexto.add((TextView)  findViewById(R.id.textVacioEjercicio7));
        idTexto.add((TextView)  findViewById(R.id.textVacioEjercicio8));
        idTexto.add((TextView)  findViewById(R.id.textVacioEjercicio9));
        idTexto.add((TextView)  findViewById(R.id.textVacioEjercicio10));
        idTexto.add((TextView)  findViewById(R.id.textVacioEjercicio11));
        idTexto.add((TextView)  findViewById(R.id.textVacioEjercicio12));
        idTexto.add((TextView)  findViewById(R.id.textVacioEjercicio13));
        idTexto.add((TextView)  findViewById(R.id.textVacioEjercicio14));
        idTexto.add((TextView)  findViewById(R.id.textVacioEjercicio15));


        Bundle bolsaR=getIntent().getExtras();
        datosQueCargar= bolsaR.getString("ejercicioElegido");


        switch (datosQueCargar){
            case "AbP":
                imagenEjercicioElegido.setImageResource(R.drawable.imgabdominalesprincipiante);
                break;
            case "AbI":
                imagenEjercicioElegido.setImageResource(R.drawable.imgabdominalesintermedio);
                break;
            case "AbA":
                imagenEjercicioElegido.setImageResource(R.drawable.imgabdominalesavanzado);
                break;

            case "PeP":
                imagenEjercicioElegido.setImageResource(R.drawable.imgpechoprincipiante);
                break;
            case "PeI":
                imagenEjercicioElegido.setImageResource(R.drawable.imgpechointermedio);
                break;
            case "PeA":
                imagenEjercicioElegido.setImageResource(R.drawable.imgpechoavanzado);
                break;

            case "PiP":
                imagenEjercicioElegido.setImageResource(R.drawable.imgpiernasprincipiante);
                break;
            case "PiI":
                imagenEjercicioElegido.setImageResource(R.drawable.imgpiernasintermedio);
                break;
            case "PiA":
                imagenEjercicioElegido.setImageResource(R.drawable.imgpiernasavanzado);
                break;

            case "BrP":
                imagenEjercicioElegido.setImageResource(R.drawable.imgbrazosprincipiante);
                break;
            case "BrI":
                imagenEjercicioElegido.setImageResource(R.drawable.imgbrazosintermedio);
                break;
            case "BrA":
                imagenEjercicioElegido.setImageResource(R.drawable.imgbrazosavanzado);
                break;

        }

        nombresDeGifs.add("gifejercicio1");
        nombresDeGifs.add("gifejercicio1");
        nombresDeGifs.add("gifejercicio1");
        nombresDeGifs.add("gifejercicio1");
        nombresDeGifs.add("gifejercicio1");
        nombreDeEjercicios.add("giro de careditas1");
        nombreDeEjercicios.add("giro de careditas2");
        nombreDeEjercicios.add("giro de careditas3");
        nombreDeEjercicios.add("giro de careditas4");
        nombreDeEjercicios.add("giro de careditas5");
        numeroRepeticiones.add("7");
        numeroRepeticiones.add("13");
        numeroRepeticiones.add("16");
        numeroRepeticiones.add("19");
        numeroRepeticiones.add("22");
        tiempos.add(10);
        tiempos.add(7);
        tiempos.add(15);
        tiempos.add(12);
        tiempos.add(11);

        if(nombresDeGifs.size()!=0){
            boronRutina.animate().alpha(1f).setDuration(0);
        }

        for(int i=0;i<nombresDeGifs.size();i++){

            Drawable drawable = getResources().getDrawable(getResources().getIdentifier(nombresDeGifs.get(i), "drawable",
                    getPackageName()));

            Glide.with(this).load(drawable).into(idImagenes.get(i));
            idTexto.get(i).setText(nombreDeEjercicios.get(i)+" X"+numeroRepeticiones.get(i));



        }


    }
    public void botonEmpezarRutinaParaLlegarMostrarRutina(View view){
        bolsa.putStringArrayList("nombresDeGifs",nombresDeGifs);
        bolsa.putStringArrayList("nombreDeEjercicios",nombreDeEjercicios);
        bolsa.putStringArrayList("numeroRepeticiones",numeroRepeticiones);
        bolsa.putIntegerArrayList("tiempos",tiempos);
        Intent ir1=new Intent(this,MostrarRutina.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }

}