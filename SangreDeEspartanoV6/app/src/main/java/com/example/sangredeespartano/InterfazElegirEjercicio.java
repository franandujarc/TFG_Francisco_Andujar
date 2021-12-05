package com.example.sangredeespartano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class InterfazElegirEjercicio extends AppCompatActivity {
    MediaPlayer mediaPlayer=null;
    Bundle bolsa=new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_elegir_ejercicio);

    }

    public void pararMusica(View view){
        ControladorMusica controladorMusica=new ControladorMusica();
        controladorMusica.parar();
    }
//   Es PeP por que es PEcho Principiante
    public void botonPopupPeP(View view){

        bolsa.putString("ejercicioElegido","PeP");
        bolsa.putInt("kcal",110);
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
         ir1.putExtras(bolsa);
        startActivity(ir1);
    }
    public void botonPopupPeI(View view){

        bolsa.putString("ejercicioElegido","PeI");
        bolsa.putInt("kcal",205);
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }
    public void botonPopupPeA(View view){

        bolsa.putString("ejercicioElegido","PeA");
        bolsa.putInt("kcal",315);
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }

    public void botonPopupAbP(View view){

        bolsa.putString("ejercicioElegido","AbP");
        bolsa.putInt("kcal",112);
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }
    public void botonPopupAbI(View view){

        bolsa.putString("ejercicioElegido","AbI");
        bolsa.putInt("kcal",207);
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }

    public void botonPopupAbA(View view){

        bolsa.putString("ejercicioElegido","AbA");
        bolsa.putInt("kcal",311);
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }
    public void botonPopupPiP(View view){

        bolsa.putString("ejercicioElegido","PiP");
        bolsa.putInt("kcal",116);
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }
    public void botonPopupPiI(View view){

        bolsa.putString("ejercicioElegido","PiI");
        bolsa.putInt("kcal",210);
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }
    public void botonPopupPiA(View view){

        bolsa.putString("ejercicioElegido","PiA");
        bolsa.putInt("kcal",311);
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }

    public void botonPopupBrP(View view){

        bolsa.putString("ejercicioElegido","BrP");
        bolsa.putInt("kcal",112);
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }
    public void botonPopupBrI(View view){

        bolsa.putString("ejercicioElegido","BrI");
        bolsa.putInt("kcal",231);
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }
    public void botonPopupBrA(View view){

        bolsa.putString("ejercicioElegido","BrA");
        bolsa.putInt("kcal",352);
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }
    public void botonIrAHistorialDesdeInterfaz(View view){


        Intent ir1=new Intent(this,HistorialEjercicios.class);
        startActivity(ir1);
    }



}