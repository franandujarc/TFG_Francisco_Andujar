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
//   Es PeP por que es PEcho Intermedio 
    public void botonPopupPeP(View view){

        bolsa.putString("ejercicioElegido","PeP");
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
         ir1.putExtras(bolsa);
        startActivity(ir1);
    }
    public void botonPopupPeI(View view){

        bolsa.putString("ejercicioElegido","PeI");
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }
    public void botonPopupPeA(View view){

        bolsa.putString("ejercicioElegido","PeA");
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }

    public void botonPopupAbP(View view){

        bolsa.putString("ejercicioElegido","AbP");
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }
    public void botonPopupAbI(View view){

        bolsa.putString("ejercicioElegido","AbI");
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }

    public void botonPopupAbA(View view){

        bolsa.putString("ejercicioElegido","AbA");
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }
    public void botonPopupPiP(View view){

        bolsa.putString("ejercicioElegido","PiP");
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }
    public void botonPopupPiI(View view){

        bolsa.putString("ejercicioElegido","PiI");
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }
    public void botonPopupPiA(View view){

        bolsa.putString("ejercicioElegido","PiA");
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }

    public void botonPopupBrP(View view){

        bolsa.putString("ejercicioElegido","BrP");
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }
    public void botonPopupBrI(View view){

        bolsa.putString("ejercicioElegido","BrI");
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }
    public void botonPopupBrA(View view){

        bolsa.putString("ejercicioElegido","BrA");
        Intent ir1=new Intent(this,PopupPreComenzarEjercicio.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }



}