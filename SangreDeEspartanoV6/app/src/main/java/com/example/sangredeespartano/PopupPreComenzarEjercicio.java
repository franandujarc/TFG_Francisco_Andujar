package com.example.sangredeespartano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
    int kcaloriasRecuperadas;
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
        kcaloriasRecuperadas= bolsaR.getInt("kcal");

        switch (datosQueCargar){
            case "AbP":
                imagenEjercicioElegido.setImageResource(R.drawable.imgabdominalesprincipiante);
                ConexionSQLiteHelperAbP connAbP=new ConexionSQLiteHelperAbP(this,"bd_abp",null,1);
                SQLiteDatabase dbAbP=connAbP.getReadableDatabase();
                Cursor cursorAbP;
                cursorAbP = dbAbP.query(Utilidades.TABLA_ABP, null, null, null, null, null, null);

                while(cursorAbP.moveToNext()){
                nombresDeGifs.add(cursorAbP.getString(0));
                nombreDeEjercicios.add(cursorAbP.getString(1));
                numeroRepeticiones.add(cursorAbP.getString(2));
                tiempos.add(cursorAbP.getInt(3));
                }

               break;

            case "AbI":
                imagenEjercicioElegido.setImageResource(R.drawable.imgabdominalesintermedio);
                ConexionSQLiteHelperAbI connAbI=new ConexionSQLiteHelperAbI(this,"bd_abi",null,1);
                SQLiteDatabase dbAbI=connAbI.getReadableDatabase();
                Cursor cursorAbI;
                cursorAbI = dbAbI.query(Utilidades.TABLA_ABI, null, null, null, null, null, null);

                while(cursorAbI.moveToNext()){
                    nombresDeGifs.add(cursorAbI.getString(0));
                    nombreDeEjercicios.add(cursorAbI.getString(1));
                    numeroRepeticiones.add(cursorAbI.getString(2));
                    tiempos.add(cursorAbI.getInt(3));
                }
                break;
            case "AbA":
                imagenEjercicioElegido.setImageResource(R.drawable.imgabdominalesavanzado);
                ConexionSQLiteHelperAbA connAbA=new ConexionSQLiteHelperAbA(this,"bd_aba",null,1);
                SQLiteDatabase dbAbA=connAbA.getReadableDatabase();
                Cursor cursorAbA;
                cursorAbA = dbAbA.query(Utilidades.TABLA_ABA, null, null, null, null, null, null);

                while(cursorAbA.moveToNext()){
                    nombresDeGifs.add(cursorAbA.getString(0));
                    nombreDeEjercicios.add(cursorAbA.getString(1));
                    numeroRepeticiones.add(cursorAbA.getString(2));
                    tiempos.add(cursorAbA.getInt(3));
                }
                break;

            case "PeP":
                imagenEjercicioElegido.setImageResource(R.drawable.imgpechoprincipiante);
                ConexionSQLiteHelperPeP connPeP=new ConexionSQLiteHelperPeP(this,"bd_pep",null,1);
                SQLiteDatabase dbPeP=connPeP.getReadableDatabase();
                Cursor cursorPeP;
                cursorPeP = dbPeP.query(Utilidades.TABLA_PEP, null, null, null, null, null, null);

                while(cursorPeP.moveToNext()){
                    nombresDeGifs.add(cursorPeP.getString(0));
                    nombreDeEjercicios.add(cursorPeP.getString(1));
                    numeroRepeticiones.add(cursorPeP.getString(2));
                    tiempos.add(cursorPeP.getInt(3));
                }
                break;
            case "PeI":
                imagenEjercicioElegido.setImageResource(R.drawable.imgpechointermedio);
                ConexionSQLiteHelperPeI connPeI=new ConexionSQLiteHelperPeI(this,"bd_pei",null,1);
                SQLiteDatabase dbPeI=connPeI.getReadableDatabase();
                Cursor cursorPeI;
                cursorPeI = dbPeI.query(Utilidades.TABLA_PEI, null, null, null, null, null, null);

                while(cursorPeI.moveToNext()){
                    nombresDeGifs.add(cursorPeI.getString(0));
                    nombreDeEjercicios.add(cursorPeI.getString(1));
                    numeroRepeticiones.add(cursorPeI.getString(2));
                    tiempos.add(cursorPeI.getInt(3));
                }
                break;
            case "PeA":
                imagenEjercicioElegido.setImageResource(R.drawable.imgpechoavanzado);
                ConexionSQLiteHelperPeA connPeA=new ConexionSQLiteHelperPeA(this,"bd_pea",null,1);
                SQLiteDatabase dbPeA=connPeA.getReadableDatabase();
                Cursor cursorPeA;
                cursorPeA = dbPeA.query(Utilidades.TABLA_PEA, null, null, null, null, null, null);

                while(cursorPeA.moveToNext()){
                    nombresDeGifs.add(cursorPeA.getString(0));
                    nombreDeEjercicios.add(cursorPeA.getString(1));
                    numeroRepeticiones.add(cursorPeA.getString(2));
                    tiempos.add(cursorPeA.getInt(3));
                }
                break;

            case "PiP":
                imagenEjercicioElegido.setImageResource(R.drawable.imgpiernasprincipiante);
                ConexionSQLiteHelperPiP connPiP=new ConexionSQLiteHelperPiP(this,"bd_pip",null,1);
                SQLiteDatabase dbPiP=connPiP.getReadableDatabase();
                Cursor cursorPiP;
                cursorPiP = dbPiP.query(Utilidades.TABLA_PIP, null, null, null, null, null, null);

                while(cursorPiP.moveToNext()){
                    nombresDeGifs.add(cursorPiP.getString(0));
                    nombreDeEjercicios.add(cursorPiP.getString(1));
                    numeroRepeticiones.add(cursorPiP.getString(2));
                    tiempos.add(cursorPiP.getInt(3));
                }
                break;
            case "PiI":
                imagenEjercicioElegido.setImageResource(R.drawable.imgpiernasintermedio);
                ConexionSQLiteHelperPiI connPiI=new ConexionSQLiteHelperPiI(this,"bd_pii",null,1);
                SQLiteDatabase dbPiI=connPiI.getReadableDatabase();
                Cursor cursorPiI;
                cursorPiI = dbPiI.query(Utilidades.TABLA_PII, null, null, null, null, null, null);

                while(cursorPiI.moveToNext()){
                    nombresDeGifs.add(cursorPiI.getString(0));
                    nombreDeEjercicios.add(cursorPiI.getString(1));
                    numeroRepeticiones.add(cursorPiI.getString(2));
                    tiempos.add(cursorPiI.getInt(3));
                }
                break;
            case "PiA":
                imagenEjercicioElegido.setImageResource(R.drawable.imgpiernasavanzado);
                ConexionSQLiteHelperPiA connPiA=new ConexionSQLiteHelperPiA(this,"bd_pia",null,1);
                SQLiteDatabase dbPiA=connPiA.getReadableDatabase();
                Cursor cursorPiA;
                cursorPiA = dbPiA.query(Utilidades.TABLA_PIA, null, null, null, null, null, null);

                while(cursorPiA.moveToNext()){
                    nombresDeGifs.add(cursorPiA.getString(0));
                    nombreDeEjercicios.add(cursorPiA.getString(1));
                    numeroRepeticiones.add(cursorPiA.getString(2));
                    tiempos.add(cursorPiA.getInt(3));
                }
                break;

            case "BrP":
                imagenEjercicioElegido.setImageResource(R.drawable.imgbrazosprincipiante);
                ConexionSQLiteHelperBrP connBrP=new ConexionSQLiteHelperBrP(this,"bd_brp",null,1);
                SQLiteDatabase dbBrP=connBrP.getReadableDatabase();
                Cursor cursorBrP;
                cursorBrP = dbBrP.query(Utilidades.TABLA_BRP, null, null, null, null, null, null);

                while(cursorBrP.moveToNext()){
                    nombresDeGifs.add(cursorBrP.getString(0));
                    nombreDeEjercicios.add(cursorBrP.getString(1));
                    numeroRepeticiones.add(cursorBrP.getString(2));
                    tiempos.add(cursorBrP.getInt(3));
                }
                break;
            case "BrI":
                imagenEjercicioElegido.setImageResource(R.drawable.imgbrazosintermedio);
                ConexionSQLiteHelperBrI connBrI=new ConexionSQLiteHelperBrI(this,"bd_bri",null,1);
                SQLiteDatabase dbBrI=connBrI.getReadableDatabase();
                Cursor cursorBrI;
                cursorBrI = dbBrI.query(Utilidades.TABLA_BRI, null, null, null, null, null, null);

                while(cursorBrI.moveToNext()){
                    nombresDeGifs.add(cursorBrI.getString(0));
                    nombreDeEjercicios.add(cursorBrI.getString(1));
                    numeroRepeticiones.add(cursorBrI.getString(2));
                    tiempos.add(cursorBrI.getInt(3));
                }
                break;
            case "BrA":
                imagenEjercicioElegido.setImageResource(R.drawable.imgbrazosavanzado);
                ConexionSQLiteHelperBrA connBrA=new ConexionSQLiteHelperBrA(this,"bd_bra",null,1);
                SQLiteDatabase dbBrA=connBrA.getReadableDatabase();
                Cursor cursorBrA;
                cursorBrA = dbBrA.query(Utilidades.TABLA_BRA, null, null, null, null, null, null);

                while(cursorBrA.moveToNext()){
                    nombresDeGifs.add(cursorBrA.getString(0));
                    nombreDeEjercicios.add(cursorBrA.getString(1));
                    numeroRepeticiones.add(cursorBrA.getString(2));
                    tiempos.add(cursorBrA.getInt(3));
                }
                break;

        }



        if(nombresDeGifs.size()!=0){
            boronRutina.animate().alpha(1f).setDuration(0);
        }

        for(int i=0;i<nombresDeGifs.size();i++){

            Drawable drawable = getResources().getDrawable(getResources().getIdentifier(nombresDeGifs.get(i), "drawable",
                    getPackageName()));

            Glide.with(this).load(drawable).into(idImagenes.get(i));
            idTexto.get(i).setText(nombreDeEjercicios.get(i)+" "+numeroRepeticiones.get(i));



        }


    }
    public void botonEmpezarRutinaParaLlegarMostrarRutina(View view){
        bolsa.putStringArrayList("nombresDeGifs",nombresDeGifs);
        bolsa.putStringArrayList("nombreDeEjercicios",nombreDeEjercicios);
        bolsa.putStringArrayList("numeroRepeticiones",numeroRepeticiones);
        bolsa.putIntegerArrayList("tiempos",tiempos);
        bolsa.putInt("kcal",kcaloriasRecuperadas);
        Intent ir1=new Intent(this,MostrarRutina.class);
        ir1.putExtras(bolsa);
        startActivity(ir1);
    }

}