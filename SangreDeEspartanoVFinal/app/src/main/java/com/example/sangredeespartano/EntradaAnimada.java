package com.example.sangredeespartano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.Serializable;

public class EntradaAnimada extends AppCompatActivity {
    ImageView ImagenTitulo1,ImagenTitulo2,ImagenEspartanoGym;
    Handler handlerAparicion= new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(Color.BLACK);
        getWindow().setNavigationBarColor(Color.BLACK);
        setContentView(R.layout.entrada_animada);
        ImagenTitulo1=(ImageView)findViewById(R.id.imgTituloEntrada1);
        ImagenTitulo2=(ImageView)findViewById(R.id.imgTituloEntrada2);
        ImagenEspartanoGym=(ImageView)findViewById(R.id.imgBotonEspartanoGymEntrada);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        aparicion(ImagenEspartanoGym);




        SQLiteDatabase checkDB = null;
        String path="/data/data/com.example.sangredeespartano/databases/bd_abp";
        try {
            checkDB = SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READONLY);
            checkDB.close();

        } catch (SQLiteException e) {
            CreacionIncialDeLasBDs.crearBdAbP(this);
            CreacionIncialDeLasBDs.crearBdAbI(this);
            CreacionIncialDeLasBDs.crearBdAbA(this);
            CreacionIncialDeLasBDs.crearBdPeP(this);
            CreacionIncialDeLasBDs.crearBdPeI(this);
            CreacionIncialDeLasBDs.crearBdPeA(this);
            CreacionIncialDeLasBDs.crearBdPiP(this);
            CreacionIncialDeLasBDs.crearBdPiI(this);
            CreacionIncialDeLasBDs.crearBdPiA(this);
            CreacionIncialDeLasBDs.crearBdBrP(this);
            CreacionIncialDeLasBDs.crearBdBrI(this);
            CreacionIncialDeLasBDs.crearBdBrA(this);

        }




    }


    private void aparicion(View view){

        ControladorMusica controladorMusica=new ControladorMusica();
        controladorMusica.empezar(this);

        int tiempoTranscurrirAparicion = 10000;
        handlerAparicion.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent ir2=new Intent(getApplicationContext(),InterfazElegirEjercicio.class);

                startActivity(ir2);

                handlerAparicion.removeCallbacks(null);
            }
        }, tiempoTranscurrirAparicion);

        int tiempoTranscurrir1 = 1000;
        Handler handler1 = new Handler();
        handler1.postDelayed(new Runnable() {
            @Override
            public void run() {

                ImagenTitulo1.animate().alpha(1f).setDuration(0);
                handler1.removeCallbacks(null);
            }
        }, tiempoTranscurrir1);

        int tiempoTranscurrir1_2 = 1100;
        Handler handler1_2 = new Handler();
        handler1_2.postDelayed(new Runnable() {
            @Override
            public void run() {
                ImagenTitulo1.animate().alpha(0f).setDuration(0);
                handler1_2.removeCallbacks(null);
            }
        }, tiempoTranscurrir1_2);

        int tiempoTranscurrir1_3 = 1200;
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



    }
    private void esconder(View view){
        ImagenTitulo1.animate().alpha(0f).setDuration(0);
        ImagenTitulo2.animate().alpha(0f).setDuration(0);
        ImagenEspartanoGym.animate().alpha(0f).setDuration(0);


    }

    public void botonEmpezarParaLlegarInterfazEjercicios(View view){


        Intent ir1=new Intent(this,InterfazElegirEjercicio.class);

        startActivity(ir1);
    }

    public void onPause() {
        super.onPause();
        handlerAparicion.removeCallbacksAndMessages(null);
    }

}