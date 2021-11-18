package com.example.sangredeespartano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class EntradaAnimada extends AppCompatActivity {
    ImageView ImagenTitulo1,ImagenTitulo2,ImagenEspartanoGym;
    MediaPlayer mediaPlayer=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrada_animada);
        ImagenTitulo1=(ImageView)findViewById(R.id.imgTituloEntrada1);
        ImagenTitulo2=(ImageView)findViewById(R.id.imgTituloEntrada2);
        ImagenEspartanoGym=(ImageView)findViewById(R.id.imgBotonEspartanoGymEntrada);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        aparicion(ImagenEspartanoGym);
    }

    @Override
    protected void onResume(){
        super.onResume();

        int tiempoTranscurrir = 10000;
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {


                Intent intent = new Intent(getApplicationContext(), InterfazElegirEjercicio.class);
                startActivity(intent);

                handler.removeCallbacks(null);
            }
        }, tiempoTranscurrir);


    }

    @Override
    protected void onPause(){
        super.onPause();

    }

    private void aparicion(View view){

        mediaPlayer = MediaPlayer.create(this, R.raw.musicagymesttik);
        mediaPlayer.start();

        int tiempoTranscurrir1 = 2000;
        Handler handler1 = new Handler();
        handler1.postDelayed(new Runnable() {
            @Override
            public void run() {
                ImagenTitulo1.animate().alpha(1f).setDuration(0);
                handler1.removeCallbacks(null);
            }
        }, tiempoTranscurrir1);

        int tiempoTranscurrir1_2 = 2100;
        Handler handler1_2 = new Handler();
        handler1_2.postDelayed(new Runnable() {
            @Override
            public void run() {
                ImagenTitulo1.animate().alpha(0f).setDuration(0);
                handler1_2.removeCallbacks(null);
            }
        }, tiempoTranscurrir1_2);

        int tiempoTranscurrir1_3 = 2200;
        Handler handler1_3 = new Handler();
        handler1_3.postDelayed(new Runnable() {
            @Override
            public void run() {
                ImagenTitulo1.animate().alpha(1f).setDuration(0);
                handler1_3.removeCallbacks(null);
            }
        }, tiempoTranscurrir1_3);

//-------------------------------------------------------------imagen 2-------------------------------------------------------------
        int tiempoTranscurrir2 = 4000;
        Handler handler2 = new Handler();
        handler2.postDelayed(new Runnable() {
            @Override
            public void run() {

                ImagenTitulo2.animate().alpha(1f).setDuration(0);
                handler2.removeCallbacks(null);
            }
        }, tiempoTranscurrir2);

        int tiempoTranscurrir2_2 = 4100;
        Handler handler2_2 = new Handler();
        handler2_2.postDelayed(new Runnable() {
            @Override
            public void run() {

                ImagenTitulo2.animate().alpha(0f).setDuration(0);
                handler2_2.removeCallbacks(null);
            }
        }, tiempoTranscurrir2_2);


        int tiempoTranscurrir2_3 = 4200;
        Handler handler2_3 = new Handler();
        handler2_3.postDelayed(new Runnable() {
            @Override
            public void run() {

                ImagenTitulo2.animate().alpha(1f).setDuration(0);
                handler2_3.removeCallbacks(null);
            }
        }, tiempoTranscurrir2_3);

//-------------------------------------------------------------------------------imagen3---------------------------------------------
        int tiempoTranscurrir3 = 7000;
        Handler handler3 = new Handler();
        handler3.postDelayed(new Runnable() {
            @Override
            public void run() {

                ImagenEspartanoGym.animate().alpha(1f).setDuration(0);

                handler3.removeCallbacks(null);
            }
        }, tiempoTranscurrir3);


        //ImagenTitulo1.animate().alpha(1f).setDuration(0);
        //ImagenTitulo2.animate().alpha(1f).setDuration(0);
        //ImagenEspartanoGym.animate().alpha(1f).setDuration(0);


    }
    private void esconder(View view){
        ImagenTitulo1.animate().alpha(0f).setDuration(0);
        ImagenTitulo2.animate().alpha(0f).setDuration(0);
        ImagenEspartanoGym.animate().alpha(0f).setDuration(0);


    }
  /*  public void botonEmpezarParaLlegarInterfazEjerciciosTiempo(){
        new CountDownTimer(15000, 1000) {

            public void onTick(long millisUntilFinished) {

            }
            public void onFinish() {
        Intent ir1=new Intent(this,InterfazElegirEjercicio.class);
        startActivity(ir1);
            }
        }.start();
    }*/
    public void botonEmpezarParaLlegarInterfazEjercicios(View view){
        Intent ir1=new Intent(this,InterfazElegirEjercicio.class);
        startActivity(ir1);
    }
}