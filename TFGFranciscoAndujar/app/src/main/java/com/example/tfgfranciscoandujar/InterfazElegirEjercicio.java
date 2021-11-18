package com.example.tfgfranciscoandujar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InterfazElegirEjercicio extends AppCompatActivity {
    Bundle bolsa=new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_elegir_ejercicio);
    }


    public void botonInterfazEjerciciosParaLlegarAtras(View view){

        Intent volver1=new Intent(this,EntradaAnimacion.class);
        startActivity(volver1);
    }
    public void botonPecho(View view){
        bolsa.putString("ejercicioElegido","pecho");
        Intent ir2=new Intent(this,InterfazElegirDificultad.class);
        ir2.putExtras(bolsa);
        startActivity(ir2);
    }
    public void botonAbdominales(View view){
        bolsa.putString("ejercicioElegido","abdominales");
        Intent ir2=new Intent(this,InterfazElegirDificultad.class);
        ir2.putExtras(bolsa);
        startActivity(ir2);
    }
    public void botonPiernas(View view){
        bolsa.putString("ejercicioElegido","piernas");
        Intent ir2=new Intent(this,InterfazElegirDificultad.class);
        ir2.putExtras(bolsa);
        startActivity(ir2);
    }
    public void botonBrazos(View view){
        bolsa.putString("ejercicioElegido","brazos");
        Intent ir2=new Intent(this,InterfazElegirDificultad.class);
        ir2.putExtras(bolsa);
        startActivity(ir2);
    }


    public void botonAyudaPecho(View view){
        Intent ir3=new Intent(this,PopupPecho.class);
        startActivity(ir3);
    }
    public void botonAyudaAbdominales(View view){
        Intent ir3=new Intent(this,PopupAbdominales.class);
        startActivity(ir3);
    }
    public void botonAyudaPiernas(View view){
        Intent ir3=new Intent(this,PopupPiernas.class);
        startActivity(ir3);
    }
    public void botonAyudaBrazos(View view){
        Intent ir3=new Intent(this,PopupBrazos.class);
        startActivity(ir3);
    }


}