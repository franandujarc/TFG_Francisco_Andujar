package com.example.tfgfranciscoandujar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InterfazElegirDificultad extends AppCompatActivity {

    String ejercicioElegido;
    Bundle bolsa2=new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_elegir_dificultad);
        Bundle bolsaR=getIntent().getExtras();
        ejercicioElegido=bolsaR.getString("ejercicioElegido");
    }

    public void botonInterfazDificultadParaLlegarAtras(View view){
        Intent volver2=new Intent(this,InterfazElegirEjercicio.class);
        startActivity(volver2);
    }
    public void botonInterfazDificultadParaLlegarVisualizadorDeLosEjerciciosFacil(View view){
        Intent ir4=new Intent(this,VisualizadorDeLosEjercicios.class);
        bolsa2.putString("ejercicioElegido",ejercicioElegido);
        bolsa2.putString("dificultadElegida","facil");
        ir4.putExtras(bolsa2);
        startActivity(ir4);
    }
    public void botonInterfazDificultadParaLlegarVisualizadorDeLosEjerciciosNormal(View view){
        Intent ir4=new Intent(this,VisualizadorDeLosEjercicios.class);
        bolsa2.putString("ejercicioElegido",ejercicioElegido);
        bolsa2.putString("dificultadElegida","normal");
        ir4.putExtras(bolsa2);
        startActivity(ir4);
    }
    public void botonInterfazDificultadParaLlegarVisualizadorDeLosEjerciciosDificil(View view){
        Intent ir4=new Intent(this,VisualizadorDeLosEjercicios.class);
        bolsa2.putString("ejercicioElegido",ejercicioElegido);
        bolsa2.putString("dificultadElegida","dificil");
        ir4.putExtras(bolsa2);
        startActivity(ir4);
    }
}