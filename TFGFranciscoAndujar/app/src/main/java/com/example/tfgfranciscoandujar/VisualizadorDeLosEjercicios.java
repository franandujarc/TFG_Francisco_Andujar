package com.example.tfgfranciscoandujar;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.ViewTarget;

import java.util.ArrayList;

public class VisualizadorDeLosEjercicios extends AppCompatActivity {
    String ejercicioElegido,dificultadElegida;
    ImageView gifQueCambia;
    String gifEjercicioActual;
    String ejercicioActual;
    int tiempoEjercicio;
    int repeticionesEjercicio;
    ArrayList<String> ArrayGifs;
    ArrayList<String> ArrayEjercicios;
    ArrayList<Integer> ArrayTiempos;
    ArrayList<Integer> ArrayRepeticiones;
    TextView cronometro,nombreEjercicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizador_de_los_ejercicios);

        cronometro=(TextView) findViewById(R.id.textoTiempo);
        nombreEjercicio=(TextView) findViewById(R.id.textoNombreEjercicio);

        Bundle bolsaR=getIntent().getExtras();
        ejercicioElegido=bolsaR.getString("ejercicioElegido");
        dificultadElegida=bolsaR.getString("dificultadElegida");

        for(int i =0 ;i<ArrayEjercicios.size();i++) {
            ejercicioActual=ArrayEjercicios.get(i);
            repeticionesEjercicio=ArrayRepeticiones.get(i);

            nombreEjercicio.setText(ejercicioActual+" X"+String.valueOf(repeticionesEjercicio));

            tiempoEjercicio=ArrayTiempos.get(i);
            gifEjercicioActual = ArrayGifs.get(i);

            Drawable drawable = getResources().getDrawable(getResources().getIdentifier(gifEjercicioActual, "drawable",
                    getPackageName()));
            gifQueCambia = (ImageView) findViewById(R.id.imgGifCambiador);
            Glide.with(this).load(drawable).into(gifQueCambia);

                new CountDownTimer(tiempoEjercicio, 1000) {

                    public void onTick(long millisUntilFinished) {
                        cronometro.setText("" + millisUntilFinished / 1000);
                    }
                    public void onFinish() {

                    }
                }.start();

            nombreEjercicio.setText("Descanso de 15 segundos");

                new CountDownTimer(15000, 1000) {

                public void onTick(long millisUntilFinished) {
                    cronometro.setText("" + millisUntilFinished / 1000);
                }
                public void onFinish() {

                }
            }.start();
        }


    }


    private void rellenarArraysDesdeLaBaseDeDatos(){

        if(ejercicioElegido.equalsIgnoreCase("pecho")){
            if(dificultadElegida.equalsIgnoreCase("facil")){

            }
            if(dificultadElegida.equalsIgnoreCase("normal")){

            }
            if(dificultadElegida.equalsIgnoreCase("dificil")){

            }
        }



        if(ejercicioElegido.equalsIgnoreCase("abdominales")){
            if(dificultadElegida.equalsIgnoreCase("facil")){

            }
            if(dificultadElegida.equalsIgnoreCase("normal")){

            }
            if(dificultadElegida.equalsIgnoreCase("dificil")){

            }
        }


        if(ejercicioElegido.equalsIgnoreCase("piernas")){
            if(dificultadElegida.equalsIgnoreCase("facil")){

            }
            if(dificultadElegida.equalsIgnoreCase("normal")){

            }
            if(dificultadElegida.equalsIgnoreCase("dificil")){

            }
        }


        if(ejercicioElegido.equalsIgnoreCase("brazos")){
            if(dificultadElegida.equalsIgnoreCase("facil")){

            }
            if(dificultadElegida.equalsIgnoreCase("normal")){

            }
            if(dificultadElegida.equalsIgnoreCase("dificil")){

            }
        }
    }


}