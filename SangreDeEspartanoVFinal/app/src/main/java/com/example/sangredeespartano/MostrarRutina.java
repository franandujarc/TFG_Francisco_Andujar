package com.example.sangredeespartano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class MostrarRutina extends AppCompatActivity {
    private static Context context;
    MediaPlayer mediaPlayerSilbato=null;
    ProgressBar circulo;
    ArrayList<String> nombresDeGifs=new ArrayList<>();
    ArrayList<String> nombreDeEjercicios=new ArrayList<>();
    ArrayList<String> numeroRepeticiones=new ArrayList<>();
    ArrayList<Integer> tiempos=new ArrayList<>();
    ImageView imagenActualRutinaElegida;
    TextView textMostrarNombreEjercicio,textMostrarRepeticiones,textoTiempoRutina;
    int siguienteEjercicio=0;
    int numeroEjerciciosHecho=1;
    Handler handler = new Handler();
    Thread cronometro;
    Thread tiempoTranscuridoHilo;
    boolean isOn=false;
    int segundos=0;
    int segundosArreglarProgressBar=0;
    int progresoCirculo=0;
    Button botonComenzar,botonSiguiente;
    int kcalRecuperadas=0;
    int tiempoTranscurrido=0;
    int numEjerciciosHistorial=0;
    int numKcalHistorial=0;
    int numTiempoHistorial=0;
    boolean descanso=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_rutina);
        getWindow().setStatusBarColor(Color.parseColor("#ED1C24"));
        getWindow().setNavigationBarColor(Color.parseColor("#ED1C24"));
        MostrarRutina.context = getApplicationContext();
        mediaPlayerSilbato=MediaPlayer.create(this,R.raw.silbato);
        Bundle bolsaR=getIntent().getExtras();
        nombresDeGifs= bolsaR.getStringArrayList("nombresDeGifs");
        nombreDeEjercicios= bolsaR.getStringArrayList("nombreDeEjercicios");
        numeroRepeticiones= bolsaR.getStringArrayList("numeroRepeticiones");
        tiempos= bolsaR.getIntegerArrayList("tiempos");
        kcalRecuperadas=bolsaR.getInt("kcal");

        circulo=(ProgressBar) findViewById(R.id.progressBar);
        botonComenzar=(Button) findViewById(R.id.botonCronometroComenzar);
        botonSiguiente=(Button) findViewById(R.id.botonCronometroSiguiente);
        imagenActualRutinaElegida=(ImageView) findViewById(R.id.imagenActualRutinaElegida);
        textMostrarNombreEjercicio=(TextView)  findViewById(R.id.textMostrarNombreEjercicio);
        textMostrarRepeticiones=(TextView)  findViewById(R.id.textMostrarRepeticiones);
        textoTiempoRutina=(TextView)  findViewById(R.id.textoTiempoRutina);

        Drawable drawable = getResources().getDrawable(getResources().getIdentifier(nombresDeGifs.get(siguienteEjercicio), "drawable",
                getPackageName()));
        Glide.with(this).load(drawable).into(imagenActualRutinaElegida);
        textMostrarNombreEjercicio.setText(nombreDeEjercicios.get(siguienteEjercicio));
        textMostrarRepeticiones.setText(numeroRepeticiones.get(siguienteEjercicio));
        textoTiempoRutina.setText(String.valueOf(tiempos.get(siguienteEjercicio)));
        circulo.setProgress(0);
        tiempoTranscuridoHilo=new Thread(new Runnable (){

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(60000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    tiempoTranscurrido++;
                }
            }
        });
        tiempoTranscuridoHilo.start();
        cronometro=new Thread(new Runnable (){

            @Override
            public void run() {

                while (true){
                    if(isOn){
                        handler.post(new Runnable() {
                            @Override
                            public void run() {

                                if(segundos>=0&&segundos!=segundosArreglarProgressBar) {
                                    textoTiempoRutina.setText(String.valueOf(segundos));
                                    circulo.setProgress(progresoCirculo = progresoCirculo + 1);
                                }
                                if(segundos==0&&descanso==false){
                                    mediaPlayerSilbato.start();
                                    segundos=30;
                                    textoTiempoRutina.setText(String.valueOf(segundos));
                                    circulo.setMax(segundos);
                                    imagenActualRutinaElegida.setImageResource(R.drawable.descanso);
                                    segundosArreglarProgressBar=segundos;
                                    textMostrarNombreEjercicio.setText("DESCANSA");
                                    textMostrarRepeticiones.setText("30s");
                                    progresoCirculo=0;
                                    circulo.setProgress(0);
                                    descanso=true;
                                }
                                if(segundos==0&&descanso==true){
                                    if(numeroEjerciciosHecho<nombresDeGifs.size()) {
                                        mediaPlayerSilbato.start();
                                        circulo.setProgress(0);
                                        isOn = false;
                                        siguienteEjercicio++;
                                        numeroEjerciciosHecho++;
                                        botonComenzar.setText("Comenzar");
                                        segundos = tiempos.get(siguienteEjercicio);
                                        textoTiempoRutina.setText(String.valueOf(segundos));
                                        Drawable drawable = getResources().getDrawable(getResources().getIdentifier(nombresDeGifs.get(siguienteEjercicio), "drawable",
                                                getPackageName()));
                                        Glide.with(MostrarRutina.getAppContext()).load(drawable).into(imagenActualRutinaElegida);
                                        textMostrarNombreEjercicio.setText(nombreDeEjercicios.get(siguienteEjercicio));
                                        textMostrarRepeticiones.setText(numeroRepeticiones.get(siguienteEjercicio));
                                    }else{
                                        isOn = false;
                                        botonSiguiente.setText("Finalizar");
                                    }
                                    descanso=false;
                                }


                            }
                        });

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if(segundos>0) {
                            segundos--;
                        }

                    }
                }
            }
        });
        cronometro.start();




    }
    public void botoneEmpezarRutina(View view){
        if(botonComenzar.getText().equals("Comenzar")) {
            segundos = tiempos.get(siguienteEjercicio);
            segundosArreglarProgressBar=segundos;
            circulo.setMax(segundos);
            progresoCirculo=0;
            descanso=false;
            botonComenzar.setText("Reiniciar");
            isOn = true;
            mediaPlayerSilbato.start();
        }  else{
            isOn = false;
            descanso=false;
            segundos = tiempos.get(siguienteEjercicio);
            segundosArreglarProgressBar=segundos;
            circulo.setMax(segundos);
            segundosArreglarProgressBar=segundos;
            Drawable drawable = getResources().getDrawable(getResources().getIdentifier(nombresDeGifs.get(siguienteEjercicio), "drawable",
                    getPackageName()));
            Glide.with(MostrarRutina.getAppContext()).load(drawable).into(imagenActualRutinaElegida);
            textoTiempoRutina.setText(String.valueOf(segundos));
            botonComenzar.setText("Comenzar");
            textMostrarNombreEjercicio.setText(nombreDeEjercicios.get(siguienteEjercicio));
            textMostrarRepeticiones.setText(numeroRepeticiones.get(siguienteEjercicio));
            circulo.setProgress(0);



        }

    }
    public static Context getAppContext() {
        return MostrarRutina.context;
    }
    public void botonSiguienteRutina(View v){
        if(numeroEjerciciosHecho<nombresDeGifs.size()) {
            if(numeroEjerciciosHecho==nombresDeGifs.size()-1) {
            botonSiguiente.setText("Finalizar");}
            circulo.setProgress(0);
            isOn = false;
            siguienteEjercicio++;
            numeroEjerciciosHecho++;
            botonComenzar.setText("Comenzar");
            segundos = tiempos.get(siguienteEjercicio);
            textoTiempoRutina.setText(String.valueOf(segundos));
            Drawable drawable = getResources().getDrawable(getResources().getIdentifier(nombresDeGifs.get(siguienteEjercicio), "drawable",
                    getPackageName()));
            Glide.with(MostrarRutina.getAppContext()).load(drawable).into(imagenActualRutinaElegida);
            textMostrarNombreEjercicio.setText(nombreDeEjercicios.get(siguienteEjercicio));
            textMostrarRepeticiones.setText(numeroRepeticiones.get(siguienteEjercicio));
        }
        else{

            String fechaActual = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
            boolean existe=false;


            ConexionSQLiteHelperHistorial connHistorialR=new ConexionSQLiteHelperHistorial(this,"bd_historial",null,1);
            SQLiteDatabase dbHistorialR=connHistorialR.getReadableDatabase();
            Cursor cursorHistorialR;
            cursorHistorialR = dbHistorialR.query(Utilidades.TABLA_HISTORIAL, null, null, null, null, null, null);
            while(cursorHistorialR.moveToNext()){
                if(cursorHistorialR.getString(0).equals(fechaActual)){
                     numEjerciciosHistorial=Integer.parseInt(cursorHistorialR.getString(1));
                     numKcalHistorial=Integer.parseInt(cursorHistorialR.getString(2));
                     numTiempoHistorial=Integer.parseInt(cursorHistorialR.getString(3));
                    existe=true;
                }
            }

            if(existe){
                ConexionSQLiteHelperHistorial connHistorialW = new ConexionSQLiteHelperHistorial(this, "bd_historial", null, 1);
                SQLiteDatabase dbHistorialW = connHistorialW.getWritableDatabase();
                String[]parametros={fechaActual};
                ContentValues valuesW = new ContentValues();
                valuesW.put(Utilidades.CAMPO_FECHA, fechaActual);
                valuesW.put(Utilidades.CAMPO_NUM_EJERCICIOS, String.valueOf((numEjerciciosHistorial+=1)));
                valuesW.put(Utilidades.CAMPO_KCAL, String.valueOf((numKcalHistorial += kcalRecuperadas)));
                valuesW.put(Utilidades.CAMPO_TIEMPO,String.valueOf( numTiempoHistorial += tiempoTranscurrido));
                dbHistorialW.update(Utilidades.TABLA_HISTORIAL,valuesW,Utilidades.CAMPO_FECHA+"=?",parametros);
            }else {

                ConexionSQLiteHelperHistorial connHistorialW = new ConexionSQLiteHelperHistorial(this, "bd_historial", null, 1);
                SQLiteDatabase dbHistorialW = connHistorialW.getWritableDatabase();
                ContentValues valuesW = new ContentValues();
                valuesW.put(Utilidades.CAMPO_FECHA, fechaActual);
                valuesW.put(Utilidades.CAMPO_NUM_EJERCICIOS, String.valueOf((numEjerciciosHistorial+=1)));
                valuesW.put(Utilidades.CAMPO_KCAL, String.valueOf((numKcalHistorial += kcalRecuperadas)));
                valuesW.put(Utilidades.CAMPO_TIEMPO, String.valueOf(numTiempoHistorial += tiempoTranscurrido));
                dbHistorialW.insert(Utilidades.TABLA_HISTORIAL, Utilidades.CAMPO_FECHA, valuesW);
            }


            Toast.makeText(getApplicationContext(),"Enorabuena Ejercicio Realizado con exito, Calorias Quemadas:"+kcalRecuperadas, Toast.LENGTH_LONG).show();
            Intent ir1=new Intent(this,InterfazElegirEjercicio.class);
            startActivity(ir1);
        }

    }

    public void onPause() {
        super.onPause();
        isOn = false;
    }


}