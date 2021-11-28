package com.example.sangredeespartano;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class CreacionIncialDeLasBDs {

    public static void crearBdAbP(Context context){
        ConexionSQLiteHelperAbP connAbP=new ConexionSQLiteHelperAbP(context,"bd_abp",null,1);
        SQLiteDatabase dbAbP=connAbP.getWritableDatabase();
        String[] nombreGif={"gifejercicio39","gifejercicio23","gifejercicio22","gifejercicio79","gifejercicio82","gifejercicio50","gifejercicio66","gifejercicio24","gifejercicio21"};
        String[] nombreEjercicio={"saltos de tijera","trote","elevaciones de pierna","elevaciones de pierna alternando","Cruch de bicicleta","cruch en V","estiramiento de cobra"};
        String[] numRepeticiones={" "," ","8","8","6","8"," "};
        int[] tiempos={20,20,30,30,30,30,40};
        ContentValues values=new ContentValues();

        for(int i=0;i< nombreGif.length;i++) {
            values.put(Utilidades.CAMPO_NOMBRE_GIF, nombreGif[i]);
            values.put(Utilidades.CAMPO_NOMBRE_EJERCICIO, nombreEjercicio[i]);
            values.put(Utilidades.CAMPO_NUM_REPETICIONES, numRepeticiones[i]);
            values.put(Utilidades.CAMPO_TIEMPOS, tiempos[i]);
            dbAbP.insert(Utilidades.TABLA_ABP, Utilidades.CAMPO_NOMBRE_GIF, values);
            values.clear();


        }
    }
// ---------------------------------------------------------------------------------------------------------------------------------------

    public static void crearBdAbI(Context context){
        ConexionSQLiteHelperAbI connAbI=new ConexionSQLiteHelperAbI(context,"bd_personas",null,1);
        SQLiteDatabase dbAbI=connAbI.getWritableDatabase();
        String[] nombreGif={"46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q"};
        String[] nombreEjercicio={"Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco"};
        String[] numRepeticiones={"Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez"};
        int[] tiempos={20,20,30,30,30,30,40};
        ContentValues values=new ContentValues();

        for(int i=0;i< nombreGif.length;i++) {
            values.put(Utilidades.CAMPO_NOMBRE_GIF, nombreGif[i]);
            values.put(Utilidades.CAMPO_NOMBRE_EJERCICIO, nombreEjercicio[i]);
            values.put(Utilidades.CAMPO_NUM_REPETICIONES, numRepeticiones[i]);
            values.put(Utilidades.CAMPO_TIEMPOS, tiempos[i]);
            dbAbI.insert(Utilidades.TABLA_ABI, Utilidades.CAMPO_NOMBRE_GIF, values);
            values.clear();


        }
    }
// ---------------------------------------------------------------------------------------------------------------------------------------





    public static void crearBdAbA(Context context){
        ConexionSQLiteHelperAbA connAbA=new ConexionSQLiteHelperAbA(context,"bd_personas",null,1);
        SQLiteDatabase dbAbA=connAbA.getWritableDatabase();
        String[] nombreGif={"46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q"};
        String[] nombreEjercicio={"Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco"};
        String[] numRepeticiones={"Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez"};
        int[] tiempos={20,20,30,30,30,30,40};
        ContentValues values=new ContentValues();

        for(int i=0;i< nombreGif.length;i++) {
            values.put(Utilidades.CAMPO_NOMBRE_GIF, nombreGif[i]);
            values.put(Utilidades.CAMPO_NOMBRE_EJERCICIO, nombreEjercicio[i]);
            values.put(Utilidades.CAMPO_NUM_REPETICIONES, numRepeticiones[i]);
            values.put(Utilidades.CAMPO_TIEMPOS, tiempos[i]);
            dbAbA.insert(Utilidades.TABLA_ABA, Utilidades.CAMPO_NOMBRE_GIF, values);
            values.clear();


        }
    }
// ---------------------------------------------------------------------------------------------------------------------------------------


    public static void crearBdPeP(Context context){
        ConexionSQLiteHelperPeP connPeP=new ConexionSQLiteHelperPeP(context,"bd_personas",null,1);
        SQLiteDatabase dbPeP=connPeP.getWritableDatabase();
        String[] nombreGif={"46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q"};
        String[] nombreEjercicio={"Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco"};
        String[] numRepeticiones={"Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez"};
        int[] tiempos={20,20,30,30,30,30,40};
        ContentValues values=new ContentValues();

        for(int i=0;i< nombreGif.length;i++) {
            values.put(Utilidades.CAMPO_NOMBRE_GIF, nombreGif[i]);
            values.put(Utilidades.CAMPO_NOMBRE_EJERCICIO, nombreEjercicio[i]);
            values.put(Utilidades.CAMPO_NUM_REPETICIONES, numRepeticiones[i]);
            values.put(Utilidades.CAMPO_TIEMPOS, tiempos[i]);
            dbPeP.insert(Utilidades.TABLA_PEP, Utilidades.CAMPO_NOMBRE_GIF, values);
            values.clear();


        }
    }
// ---------------------------------------------------------------------------------------------------------------------------------------


    public static void crearBdPeI(Context context){
        ConexionSQLiteHelperPeI connPeI=new ConexionSQLiteHelperPeI(context,"bd_personas",null,1);
        SQLiteDatabase dbPeI=connPeI.getWritableDatabase();
        String[] nombreGif={"46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q"};
        String[] nombreEjercicio={"Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco"};
        String[] numRepeticiones={"Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez"};
        int[] tiempos={20,20,30,30,30,30,40};
        ContentValues values=new ContentValues();

        for(int i=0;i< nombreGif.length;i++) {
            values.put(Utilidades.CAMPO_NOMBRE_GIF, nombreGif[i]);
            values.put(Utilidades.CAMPO_NOMBRE_EJERCICIO, nombreEjercicio[i]);
            values.put(Utilidades.CAMPO_NUM_REPETICIONES, numRepeticiones[i]);
            values.put(Utilidades.CAMPO_TIEMPOS, tiempos[i]);
            dbPeI.insert(Utilidades.TABLA_PEI, Utilidades.CAMPO_NOMBRE_GIF, values);
            values.clear();


        }
    }
// ---------------------------------------------------------------------------------------------------------------------------------------


    public static void crearBdPeA(Context context){
        ConexionSQLiteHelperPeA connPeA=new ConexionSQLiteHelperPeA(context,"bd_personas",null,1);
        SQLiteDatabase dbPeA=connPeA.getWritableDatabase();
        String[] nombreGif={"46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q"};
        String[] nombreEjercicio={"Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco"};
        String[] numRepeticiones={"Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez"};
        int[] tiempos={20,20,30,30,30,30,40};
        ContentValues values=new ContentValues();

        for(int i=0;i< nombreGif.length;i++) {
            values.put(Utilidades.CAMPO_NOMBRE_GIF, nombreGif[i]);
            values.put(Utilidades.CAMPO_NOMBRE_EJERCICIO, nombreEjercicio[i]);
            values.put(Utilidades.CAMPO_NUM_REPETICIONES, numRepeticiones[i]);
            values.put(Utilidades.CAMPO_TIEMPOS, tiempos[i]);
            dbPeA.insert(Utilidades.TABLA_PEA, Utilidades.CAMPO_NOMBRE_GIF, values);
            values.clear();


        }
    }
// ---------------------------------------------------------------------------------------------------------------------------------------



    public static void crearBdPiP(Context context){
        ConexionSQLiteHelperPiP connPiP=new ConexionSQLiteHelperPiP(context,"bd_personas",null,1);
        SQLiteDatabase dbPiP=connPiP.getWritableDatabase();
        String[] nombreGif={"46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q"};
        String[] nombreEjercicio={"Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco"};
        String[] numRepeticiones={"Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez"};
        int[] tiempos={20,20,30,30,30,30,40};
        ContentValues values=new ContentValues();

        for(int i=0;i< nombreGif.length;i++) {
            values.put(Utilidades.CAMPO_NOMBRE_GIF, nombreGif[i]);
            values.put(Utilidades.CAMPO_NOMBRE_EJERCICIO, nombreEjercicio[i]);
            values.put(Utilidades.CAMPO_NUM_REPETICIONES, numRepeticiones[i]);
            values.put(Utilidades.CAMPO_TIEMPOS, tiempos[i]);
            dbPiP.insert(Utilidades.TABLA_PIP, Utilidades.CAMPO_NOMBRE_GIF, values);
            values.clear();


        }
    }
// ---------------------------------------------------------------------------------------------------------------------------------------


    public static void crearBdPiI(Context context){
        ConexionSQLiteHelperPiI connPiI=new ConexionSQLiteHelperPiI(context,"bd_personas",null,1);
        SQLiteDatabase dbPiI=connPiI.getWritableDatabase();
        String[] nombreGif={"46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q"};
        String[] nombreEjercicio={"Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco"};
        String[] numRepeticiones={"Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez"};
        int[] tiempos={20,20,30,30,30,30,40};
        ContentValues values=new ContentValues();

        for(int i=0;i< nombreGif.length;i++) {
            values.put(Utilidades.CAMPO_NOMBRE_GIF, nombreGif[i]);
            values.put(Utilidades.CAMPO_NOMBRE_EJERCICIO, nombreEjercicio[i]);
            values.put(Utilidades.CAMPO_NUM_REPETICIONES, numRepeticiones[i]);
            values.put(Utilidades.CAMPO_TIEMPOS, tiempos[i]);
            dbPiI.insert(Utilidades.TABLA_PII, Utilidades.CAMPO_NOMBRE_GIF, values);
            values.clear();


        }
    }
// ---------------------------------------------------------------------------------------------------------------------------------------

    public static void crearBdPiA(Context context){
        ConexionSQLiteHelperPiA connPiA=new ConexionSQLiteHelperPiA(context,"bd_personas",null,1);
        SQLiteDatabase dbPiA=connPiA.getWritableDatabase();
        String[] nombreGif={"46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q"};
        String[] nombreEjercicio={"Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco"};
        String[] numRepeticiones={"Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez"};
        int[] tiempos={20,20,30,30,30,30,40};
        ContentValues values=new ContentValues();

        for(int i=0;i< nombreGif.length;i++) {
            values.put(Utilidades.CAMPO_NOMBRE_GIF, nombreGif[i]);
            values.put(Utilidades.CAMPO_NOMBRE_EJERCICIO, nombreEjercicio[i]);
            values.put(Utilidades.CAMPO_NUM_REPETICIONES, numRepeticiones[i]);
            values.put(Utilidades.CAMPO_TIEMPOS, tiempos[i]);
            dbPiA.insert(Utilidades.TABLA_PIA, Utilidades.CAMPO_NOMBRE_GIF, values);
            values.clear();


        }
    }
// ---------------------------------------------------------------------------------------------------------------------------------------

    public static void crearBdBrP(Context context){
        ConexionSQLiteHelperBrP connBrP=new ConexionSQLiteHelperBrP(context,"bd_personas",null,1);
        SQLiteDatabase dbBrP=connBrP.getWritableDatabase();
        String[] nombreGif={"46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q"};
        String[] nombreEjercicio={"Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco"};
        String[] numRepeticiones={"Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez"};
        int[] tiempos={20,20,30,30,30,30,40};
        ContentValues values=new ContentValues();

        for(int i=0;i< nombreGif.length;i++) {
            values.put(Utilidades.CAMPO_NOMBRE_GIF, nombreGif[i]);
            values.put(Utilidades.CAMPO_NOMBRE_EJERCICIO, nombreEjercicio[i]);
            values.put(Utilidades.CAMPO_NUM_REPETICIONES, numRepeticiones[i]);
            values.put(Utilidades.CAMPO_TIEMPOS, tiempos[i]);
            dbBrP.insert(Utilidades.TABLA_BRP, Utilidades.CAMPO_NOMBRE_GIF, values);
            values.clear();


        }
    }
// ---------------------------------------------------------------------------------------------------------------------------------------

    public static void crearBdBrI(Context context){
        ConexionSQLiteHelperBrI connBrI=new ConexionSQLiteHelperBrI(context,"bd_personas",null,1);
        SQLiteDatabase dbBrI=connBrI.getWritableDatabase();
        String[] nombreGif={"46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q"};
        String[] nombreEjercicio={"Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco"};
        String[] numRepeticiones={"Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez"};
        int[] tiempos={20,20,30,30,30,30,40};
        ContentValues values=new ContentValues();

        for(int i=0;i< nombreGif.length;i++) {
            values.put(Utilidades.CAMPO_NOMBRE_GIF, nombreGif[i]);
            values.put(Utilidades.CAMPO_NOMBRE_EJERCICIO, nombreEjercicio[i]);
            values.put(Utilidades.CAMPO_NUM_REPETICIONES, numRepeticiones[i]);
            values.put(Utilidades.CAMPO_TIEMPOS, tiempos[i]);
            dbBrI.insert(Utilidades.TABLA_BRI, Utilidades.CAMPO_NOMBRE_GIF, values);
            values.clear();


        }
    }
// ---------------------------------------------------------------------------------------------------------------------------------------


    public static void crearBdBrA(Context context){
    ConexionSQLiteHelperBrA connBrA=new ConexionSQLiteHelperBrA(context,"bd_personas",null,1);
    SQLiteDatabase dbBrA=connBrA.getWritableDatabase();
    String[] nombreGif={"46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q","46658874F","65789654U","967674644G","967856654W","12445654Q"};
    String[] nombreEjercicio={"Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco","Fran","Jorge","Ivan","Luisa","Paco"};
    String[] numRepeticiones={"Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez","Andujar","Cuenca","Volante","Garcia","Fernandez"};
    int[] tiempos={20,20,30,30,30,30,40};
    ContentValues values=new ContentValues();

    for(int i=0;i< nombreGif.length;i++) {
        values.put(Utilidades.CAMPO_NOMBRE_GIF, nombreGif[i]);
        values.put(Utilidades.CAMPO_NOMBRE_EJERCICIO, nombreEjercicio[i]);
        values.put(Utilidades.CAMPO_NUM_REPETICIONES, numRepeticiones[i]);
        values.put(Utilidades.CAMPO_TIEMPOS, tiempos[i]);
        dbBrA.insert(Utilidades.TABLA_BRA, Utilidades.CAMPO_NOMBRE_GIF, values);
        values.clear();


    }
}
// ---------------------------------------------------------------------------------------------------------------------------------------





}
