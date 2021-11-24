package com.example.sangredeespartano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    private String[]header={"Fecha","Num_Ejercicios","Kcal","Tiempo"};
    private ArrayList<String[]> rows=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial_ejercicios);

        tabla=findViewById(R.id.table);

        TableDynamic tableDynamic=new TableDynamic(tabla,getApplicationContext());
        tableDynamic.addHeader(header);
        tableDynamic.addData(getPersonas());
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
    /*

    private ArrayList<String[]> leerBdPersonas()  {

        ArrayList<String[]> frasesP = new ArrayList<String[]>();
        ConexionSQLiteHelperP connP=new ConexionSQLiteHelperP(this,"bd_personas",null,1);
        SQLiteDatabase dbP=connP.getReadableDatabase();
        String[] campos ={Utilidades.CAMPO_DNI,Utilidades.CAMPO_NOMBRE,Utilidades.CAMPO_APELLIDO,Utilidades.CAMPO_OFICIO};
        String[] parametros={dniRecuperado,nombreRecuperado,apellidoRecuperado,oficioRecuperado};
        Cursor cursorP;
        cursorP = dbP.rawQuery("SELECT * FROM personas WHERE dni=? OR nombre=? OR apellido=? OR oficio=?",parametros);


        if(comparadorRecuperado.equals("true")) {
            Toast.makeText(getApplicationContext(),"no se ingreso ningun dato",Toast.LENGTH_SHORT).show();
           cursorP = dbP.query(Utilidades.TABLA_PERSONAS, null, null, null, null, null, null);
       }else {

              cursorP = dbP.rawQuery("SELECT * FROM personas WHERE dni=? OR nombre=? OR apellido=? OR oficio=?",parametros);
       }
        cursorP.moveToFirst() ;
        while(cursorP.moveToNext()){
            frasesP.add(new String[]{cursorP.getString(0),cursorP.getString(1),cursorP.getString(2),cursorP.getString(3)});

        }
        //dbP.close();
        return frasesP;

    }

 */
    public void botonVolverAInterfazElegirEjercicio(View view){
        Intent ActivityResultado2=new Intent(this,InterfazElegirEjercicio.class);
        startActivity(ActivityResultado2);

    }
}