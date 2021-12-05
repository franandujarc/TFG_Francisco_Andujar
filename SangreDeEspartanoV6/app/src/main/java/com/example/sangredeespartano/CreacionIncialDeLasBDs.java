package com.example.sangredeespartano;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class CreacionIncialDeLasBDs {

    public static void crearBdAbP(Context context){
        ConexionSQLiteHelperAbP connAbP=new ConexionSQLiteHelperAbP(context,"bd_abp",null,1);
        SQLiteDatabase dbAbP=connAbP.getWritableDatabase();
        String[] nombreGif={"gifejercicio39","gifejercicio23","gifejercicio22","gifejercicio79","gifejercicio82","gifejercicio50","gifejercicio21"};
        String[] nombreEjercicio={"saltos de tijera","trote","elevaciones de pierna","elevaciones alternando","Cruch de bicicleta","cruch en V","estiramiento de cobra"};
        String[] numRepeticiones={"20s","20s","X8","X8","X6","X8","40s"};
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
        ConexionSQLiteHelperAbI connAbI=new ConexionSQLiteHelperAbI(context,"bd_abi",null,1);
        SQLiteDatabase dbAbI=connAbI.getWritableDatabase();
        String[] nombreGif={"gifejercicio39","gifejercicio23","gifejercicio22","gifejercicio79","gifejercicio82","gifejercicio50","gifejercicio66","gifejercicio24","gifejercicio21"};
        String[] nombreEjercicio={"saltos de tijera","trote","elevaciones de pierna","elevaciones alternando","Cruch de bicicleta","cruch en V","Rotacion sin Flexion","tablon","estiramiento de cobra"};
        String[] numRepeticiones={"20s","20s","X15","X15","X12","X15","X8","60s","40s"};
        int[] tiempos={20,20,40,40,40,40,40,60,40};
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
        ConexionSQLiteHelperAbA connAbA=new ConexionSQLiteHelperAbA(context,"bd_aba",null,1);
        SQLiteDatabase dbAbA=connAbA.getWritableDatabase();
        String[] nombreGif={"gifejercicio39","gifejercicio23","gifejercicio22","gifejercicio79","gifejercicio82","gifejercicio50","gifejercicio66","gifejercicio24","gifejercicio21"};
        String[] nombreEjercicio={"saltos de tijera","trote","elevaciones de pierna","elevaciones alternando","Cruch de bicicleta","cruch en V","Rotacion sin Flexion","tablon","estiramiento de cobra"};
        String[] numRepeticiones={"20s","20s","X24","X24","X24","X20","X13","90s","40s"};
        int[] tiempos={20,20,50,50,50,50,50,90,40};
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
        ConexionSQLiteHelperPeP connPeP=new ConexionSQLiteHelperPeP(context,"bd_pep",null,1);
        SQLiteDatabase dbPeP=connPeP.getWritableDatabase();
        String[] nombreGif={"gifejercicio39","gifejercicio23","gifejercicio68","gifejercicio34","gifejercicio47","gifejercicio68","gifejercicio47","gifejercicio21"};
        String[] nombreEjercicio={"saltos de tijera","trote","flexiones media altura","flexiones","Press Banca","flexiones media altura","Press Banca","estiramiento de cobra"};
        String[] numRepeticiones={"20s","20s","X10","X8","X8","X8","X6","40s"};
        int[] tiempos={20,20,30,30,30,30,30,40};
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
        ConexionSQLiteHelperPeI connPeI=new ConexionSQLiteHelperPeI(context,"bd_pei",null,1);
        SQLiteDatabase dbPeI=connPeI.getWritableDatabase();
        String[] nombreGif={"gifejercicio39","gifejercicio23","gifejercicio68","gifejercicio34","gifejercicio47","gifejercicio68","gifejercicio47","gifejercicio21"};
        String[] nombreEjercicio={"saltos de tijera","trote","flexiones media altura","flexiones","Press Banca","flexiones media altura","Press Banca","estiramiento de cobra"};
        String[] numRepeticiones={"20s","20s","X15","X2","X12","X12","X10","40s"};
        int[] tiempos={20,20,40,40,40,40,40,40};
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
        ConexionSQLiteHelperPeA connPeA=new ConexionSQLiteHelperPeA(context,"bd_pea",null,1);
        SQLiteDatabase dbPeA=connPeA.getWritableDatabase();
        String[] nombreGif={"gifejercicio39","gifejercicio23","gifejercicio34","gifejercicio47","gifejercicio15","gifejercicio34","gifejercicio47","gifejercicio21"};
        String[] nombreEjercicio={"saltos de tijera","trote","flexiones","Press Banca","aperturas con mancuerna","flexiones","Press Banca","estiramiento de cobra"};
        String[] numRepeticiones={"20s","20s","X15","X15","X15","X15","X12","40s"};
        int[] tiempos={20,20,35,35,35,35,35,40};
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
        ConexionSQLiteHelperPiP connPiP=new ConexionSQLiteHelperPiP(context,"bd_pip",null,1);
        SQLiteDatabase dbPiP=connPiP.getWritableDatabase();
        String[] nombreGif={"gifejercicio39","gifejercicio23","gifejercicio41","gifejercicio42","gifejercicio11","gifejercicio10","gifejercicio60","gifejercicio60","gifejercicio21"};
        String[] nombreEjercicio={"saltos de tijera","trote","sentadillas con apoyo","subir el escalon","sentadilla","sentadilla con elevacion","levantamiento lateral Der","levantamiento lateral Izq","estiramiento de cobra"};
        String[] numRepeticiones={"20s","20s","X12","X12","X15","X10","X12","X12","40s"};
        int[] tiempos={20,20,30,30,30,30,30,30,40};
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
        ConexionSQLiteHelperPiI connPiI=new ConexionSQLiteHelperPiI(context,"bd_pii",null,1);
        SQLiteDatabase dbPiI=connPiI.getWritableDatabase();
        String[] nombreGif={"gifejercicio39","gifejercicio23","gifejercicio11","gifejercicio10","gifejercicio60","gifejercicio60","gifejercicio45","gifejercicio45","gifejercicio21"};
        String[] nombreEjercicio={"saltos de tijera","trote","sentadilla","sentadilla con elevacion","levantamiento lateral Der","levantamiento lateral Izq","estocada pierna Der","estocada piernal Izq","estiramiento de cobra"};
        String[] numRepeticiones={"20s","20s","X15","X10","X12","X12","X12","X12","40s"};
        int[] tiempos={20,20,35,35,35,35,35,35,40};
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
        ConexionSQLiteHelperPiA connPiA=new ConexionSQLiteHelperPiA(context,"bd_pia",null,1);
        SQLiteDatabase dbPiA=connPiA.getWritableDatabase();
        String[] nombreGif={"gifejercicio39","gifejercicio23","gifejercicio25","gifejercicio10","gifejercicio60","gifejercicio60","gifejercicio44","gifejercicio44","gifejercicio81","gifejercicio81","gifejercicio21"};
        String[] nombreEjercicio={"saltos de tijera","trote","sentadilla con peso","sentadilla con elevacion","levantamiento lateral Der","levantamiento lateral Izq","estocada pierna Der +patada","estocada piernal Izq +patada","Donkey kick Der ","Donkey kick Izq ","estiramiento de cobra"};
        String[] numRepeticiones={"20s","20s","X12","X12","X15","X15","X15","X15","X15","X15","40s"};
        int[] tiempos={20,20,40,40,40,40,40,40,40,40,40};
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
        ConexionSQLiteHelperBrP connBrP=new ConexionSQLiteHelperBrP(context,"bd_brp",null,1);
        SQLiteDatabase dbBrP=connBrP.getWritableDatabase();
        String[] nombreGif={"gifejercicio39","gifejercicio40","gifejercicio68","gifejercicio17","gifejercicio33","gifejercicio48","gifejercicio12","gifejercicio15","gifejercicio21"};
        String[] nombreEjercicio={"saltos de tijera","saltos alterando piernas","flexiones media altura","polea con cuerda lateral","polea con cuerda frontal","polea con cuerda posterior","movimiento circulas con peso","aperturas con mancuerna","estiramiento de cobra"};
        String[] numRepeticiones={"20s","20s","X10","X10","X10","X10","30s","X5","40s"};
        int[] tiempos={20,20,30,30,30,30,30,30,40};
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
        ConexionSQLiteHelperBrI connBrI=new ConexionSQLiteHelperBrI(context,"bd_bri",null,1);
        SQLiteDatabase dbBrI=connBrI.getWritableDatabase();
        String[] nombreGif={"gifejercicio39","gifejercicio40","gifejercicio68","gifejercicio17","gifejercicio33","gifejercicio48","gifejercicio12","gifejercicio15","gifejercicio21"};
        String[] nombreEjercicio={"saltos de tijera","saltos alterando piernas","flexiones media altura","polea con cuerda lateral","polea con cuerda frontal","polea con cuerda posterior","movimiento circulas con peso","aperturas con mancuerna","estiramiento de cobra"};
        String[] numRepeticiones={"20s","20s","X20","X15","X15","X15","30s","X8","40s"};
        int[] tiempos={20,20,35,35,35,35,50,35,40};
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
    ConexionSQLiteHelperBrA connBrA=new ConexionSQLiteHelperBrA(context,"bd_bra",null,1);
    SQLiteDatabase dbBrA=connBrA.getWritableDatabase();
        String[] nombreGif={"gifejercicio39","gifejercicio40","gifejercicio37","gifejercicio38","gifejercicio17","gifejercicio33","gifejercicio48","gifejercicio12","gifejercicio15","gifejercicio21"};
        String[] nombreEjercicio={"saltos de tijera","saltos alterando piernas","flexion inversa","dominadas","polea con cuerda lateral","polea con cuerda frontal","polea con cuerda posterior","movimiento circulas con peso","aperturas con mancuerna","estiramiento de cobra"};
        String[] numRepeticiones={"20s","20s","X15","X10","X20","X20","X20","70s","X10","40s"};
        int[] tiempos={20,20,40,40,40,40,40,70,40,40};
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
