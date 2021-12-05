package com.example.sangredeespartano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

import java.util.ArrayList;

public class HistorialEjercicios extends AppCompatActivity {
    String fecha;
    String numeroEjerciciosRealizados;
    String kcaloriasQuemadas;
    String tiempoTotalDelDia;


    TableLayout tabla;
    private String[]header={"Fecha","Num_Ejer","Kcal","Tiempo(min)"};
    private ArrayList<String[]> rows=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial_ejercicios);

        tabla=findViewById(R.id.table);

        TableDynamic tableDynamic=new TableDynamic(tabla,getApplicationContext());
        tableDynamic.addHeader(header);
        tableDynamic.addData(leerBdHistorial());
    }

    private ArrayList<String[]>getPersonas(){

        rows.add(new String[]{"46658874F","Fran","Andujar","informatico"});
        rows.add(new String[]{"65789654U","Jorge","Cuenca","Imprenta"});
        rows.add(new String[]{"967674644G","Ivan","Volante","Repartidor"});
        rows.add(new String[]{"967856654W","Luisa","Garcia","Enfermera"});
        rows.add(new String[]{"12445654Q","Paco","Fernandez","Taxista"});

        //datos repetidos
        rows.add(new String[]{"46658874F","Fran","Andujar","informatico"});
        rows.add(new String[]{"65789654U","Jorge","Cuenca","Imprenta"});
        rows.add(new String[]{"967674644G","Ivan","Volante","Repartidor"});
        rows.add(new String[]{"967856654W","Luisa","Garcia","Enfermera"});
        rows.add(new String[]{"12445654Q","Paco","Fernandez","Taxista"});
        rows.add(new String[]{"46658874F","Fran","Andujar","informatico"});
        rows.add(new String[]{"65789654U","Jorge","Cuenca","Imprenta"});
        rows.add(new String[]{"967674644G","Ivan","Volante","Repartidor"});
        rows.add(new String[]{"967856654W","Luisa","Garcia","Enfermera"});
        rows.add(new String[]{"12445654Q","Paco","Fernandez","Taxista"});
        rows.add(new String[]{"46658874F","Fran","Andujar","informatico"});
        rows.add(new String[]{"65789654U","Jorge","Cuenca","Imprenta"});
        rows.add(new String[]{"967674644G","Ivan","Volante","Repartidor"});
        rows.add(new String[]{"967856654W","Luisa","Garcia","Enfermera"});
        rows.add(new String[]{"12445654Q","Paco","Fernandez","Taxista"});
        rows.add(new String[]{"46658874F","Fran","Andujar","informatico"});
        rows.add(new String[]{"65789654U","Jorge","Cuenca","Imprenta"});
        rows.add(new String[]{"967674644G","Ivan","Volante","Repartidor"});
        rows.add(new String[]{"967856654W","Luisa","Garcia","Enfermera"});
        rows.add(new String[]{"12445654Q","Paco","Fernandez","Taxista"});
        rows.add(new String[]{"46658874F","Fran","Andujar","informatico"});
        rows.add(new String[]{"65789654U","Jorge","Cuenca","Imprenta"});
        rows.add(new String[]{"967674644G","Ivan","Volante","Repartidor"});
        rows.add(new String[]{"967856654W","Luisa","Garcia","Enfermera"});
        rows.add(new String[]{"12445654Q","Paco","Fernandez","Taxista"});

        return rows;
    }


    private ArrayList<String[]> leerBdHistorial()  {

        ArrayList<String[]> frases = new ArrayList<String[]>();
        ConexionSQLiteHelperHistorial connHistorial=new ConexionSQLiteHelperHistorial(this,"bd_historial",null,1);
        SQLiteDatabase dbHistorial=connHistorial.getReadableDatabase();
        Cursor cursor;
           cursor = dbHistorial.query(Utilidades.TABLA_HISTORIAL, null, null, null, null, null, null);

        while(cursor.moveToNext()){
            frases.add(0,new String[]{cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3)});

        }
        return frases;

    }


    public void botonVolverAInterfazElegirEjercicio(View view){
        Intent ActivityResultado2=new Intent(this,InterfazElegirEjercicio.class);
        startActivity(ActivityResultado2);

    }
}