package com.example.sangredeespartano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
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

import java.util.ArrayList;

public class MostrarRutina extends AppCompatActivity {
    private static Context context;
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
    Handler handlerModificador = new Handler();
    Thread cronometro;
    boolean isOn=false;
    int segundos=0;
    int progresoCirculo=0;
    int divisonCirculo=0;
    Button botonComenzar,botonSiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_rutina);

        MostrarRutina.context = getApplicationContext();

        Bundle bolsaR=getIntent().getExtras();
        nombresDeGifs= bolsaR.getStringArrayList("nombresDeGifs");
        nombreDeEjercicios= bolsaR.getStringArrayList("nombreDeEjercicios");
        numeroRepeticiones= bolsaR.getStringArrayList("numeroRepeticiones");
        tiempos= bolsaR.getIntegerArrayList("tiempos");

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
        cronometro=new Thread(new Runnable (){

            @Override
            public void run() {

                while (true){
                    if(isOn){
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                textoTiempoRutina.setText(String.valueOf(segundos));

                                circulo.setProgress(progresoCirculo=progresoCirculo+divisonCirculo);
                                if(segundos<=0){
                                    textoTiempoRutina.setTextSize(30);
                                    textoTiempoRutina.setText("DESCANSA");
                                    textMostrarNombreEjercicio.setText("El tiempo que necesites");
                                    textMostrarRepeticiones.setText("Cuando estes listo da a siguiente y comenzar");
                                    circulo.setProgress(100);
                                    isOn=false;

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
        if(isOn==false) {
            segundos = tiempos.get(siguienteEjercicio);
            divisonCirculo=100/segundos;
            progresoCirculo=0;
            isOn = true;
            botonComenzar.setText("Repetir");
        }  else{
            segundos = tiempos.get(siguienteEjercicio);
            textoTiempoRutina.setText(String.valueOf(segundos));
            botonComenzar.setText("Comenzar");
            isOn = false;


        }

    }
    public static Context getAppContext() {
        return MostrarRutina.context;
    }
    public void botonSiguienteRutina(View v){
        if(numeroEjerciciosHecho<nombresDeGifs.size()) {
            textoTiempoRutina.setTextSize(60);
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
        }    else{
            Toast.makeText(getApplicationContext(),"Enorabuena Ejercicio Realizado con exito, Calorias Quemadas:500", Toast.LENGTH_LONG).show();
            Intent ir1=new Intent(this,InterfazElegirEjercicio.class);
            startActivity(ir1);
        }

    }




}