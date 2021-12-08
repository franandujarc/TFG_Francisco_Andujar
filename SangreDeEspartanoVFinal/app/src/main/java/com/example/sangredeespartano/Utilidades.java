package com.example.sangredeespartano;

public class Utilidades {
    // -------------------------------------------tabla historial-------------------------------------------------------------
    public static final String TABLA_HISTORIAL="historial";
    public static final String CAMPO_FECHA="fecha";
    public static final String CAMPO_NUM_EJERCICIOS="numejercicios";
    public static final String CAMPO_KCAL="kcal";
    public static final String CAMPO_TIEMPO="tiempo";
    public static final String CREAR_TABLA_HISTORIAL="CREATE TABLE "+TABLA_HISTORIAL+" ("+CAMPO_FECHA+" TEXT ,"+CAMPO_NUM_EJERCICIOS+" TEXT ,"+CAMPO_KCAL+" TEXT ,"+CAMPO_TIEMPO+" TEXT)";
    //------------------------------------------campos comunes-------------------------------------------------------------

    public static final String CAMPO_NOMBRE_GIF="nombregif";
    public static final String CAMPO_NOMBRE_EJERCICIO="nombreejercicio";
    public static final String CAMPO_NUM_REPETICIONES="numrepeticiones";
    public static final String CAMPO_TIEMPOS="tiempos";
    //--------------------------------------------las tablas de los abdominales---------------------------------------------

    public static final String TABLA_ABP="abdominalesprincipiante";
    public static final String CREAR_TABLA_ABP="CREATE TABLE "+TABLA_ABP+" ("+CAMPO_NOMBRE_GIF+" TEXT ,"+CAMPO_NOMBRE_EJERCICIO+" TEXT ,"+CAMPO_NUM_REPETICIONES+" TEXT ,"+CAMPO_TIEMPOS+" INTEGER)";
    public static final String TABLA_ABI="abdominalesintermedio";
    public static final String CREAR_TABLA_ABI="CREATE TABLE "+TABLA_ABI+" ("+CAMPO_NOMBRE_GIF+" TEXT ,"+CAMPO_NOMBRE_EJERCICIO+" TEXT ,"+CAMPO_NUM_REPETICIONES+" TEXT ,"+CAMPO_TIEMPOS+" INTEGER)";
    public static final String TABLA_ABA="abdominalesavanzado";
    public static final String CREAR_TABLA_ABA="CREATE TABLE "+TABLA_ABA+" ("+CAMPO_NOMBRE_GIF+" TEXT ,"+CAMPO_NOMBRE_EJERCICIO+" TEXT ,"+CAMPO_NUM_REPETICIONES+" TEXT ,"+CAMPO_TIEMPOS+" INTEGER)";
    //------------------------------------------ las tablas de pecho----------------------------------------------------------

    public static final String TABLA_PEP="pechoprincipiante";
    public static final String CREAR_TABLA_PEP="CREATE TABLE "+TABLA_PEP+" ("+CAMPO_NOMBRE_GIF+" TEXT ,"+CAMPO_NOMBRE_EJERCICIO+" TEXT ,"+CAMPO_NUM_REPETICIONES+" TEXT ,"+CAMPO_TIEMPOS+" INTEGER)";
    public static final String TABLA_PEI="pechointermedio";
    public static final String CREAR_TABLA_PEI="CREATE TABLE "+TABLA_PEI+" ("+CAMPO_NOMBRE_GIF+" TEXT ,"+CAMPO_NOMBRE_EJERCICIO+" TEXT ,"+CAMPO_NUM_REPETICIONES+" TEXT ,"+CAMPO_TIEMPOS+" INTEGER)";
    public static final String TABLA_PEA="pechoavanzado";
    public static final String CREAR_TABLA_PEA="CREATE TABLE "+TABLA_PEA+" ("+CAMPO_NOMBRE_GIF+" TEXT ,"+CAMPO_NOMBRE_EJERCICIO+" TEXT ,"+CAMPO_NUM_REPETICIONES+" TEXT ,"+CAMPO_TIEMPOS+" INTEGER)";
    //------------------------------------------ las tablas de piernas----------------------------------------------------------
    public static final String TABLA_PIP="piernasprincipiante";
    public static final String CREAR_TABLA_PIP="CREATE TABLE "+TABLA_PIP+" ("+CAMPO_NOMBRE_GIF+" TEXT ,"+CAMPO_NOMBRE_EJERCICIO+" TEXT ,"+CAMPO_NUM_REPETICIONES+" TEXT ,"+CAMPO_TIEMPOS+" INTEGER)";
    public static final String TABLA_PII="piernasintermedio";
    public static final String CREAR_TABLA_PII="CREATE TABLE "+TABLA_PII+" ("+CAMPO_NOMBRE_GIF+" TEXT ,"+CAMPO_NOMBRE_EJERCICIO+" TEXT ,"+CAMPO_NUM_REPETICIONES+" TEXT ,"+CAMPO_TIEMPOS+" INTEGER)";
    public static final String TABLA_PIA="piernasavanzado";
    public static final String CREAR_TABLA_PIA="CREATE TABLE "+TABLA_PIA+" ("+CAMPO_NOMBRE_GIF+" TEXT ,"+CAMPO_NOMBRE_EJERCICIO+" TEXT ,"+CAMPO_NUM_REPETICIONES+" TEXT ,"+CAMPO_TIEMPOS+" INTEGER)";
    //------------------------------------------ las tablas de brazo---------------------------------------------

    public static final String TABLA_BRP="brazosprincipiante";
    public static final String CREAR_TABLA_BRP="CREATE TABLE "+TABLA_BRP+" ("+CAMPO_NOMBRE_GIF+" TEXT ,"+CAMPO_NOMBRE_EJERCICIO+" TEXT ,"+CAMPO_NUM_REPETICIONES+" TEXT ,"+CAMPO_TIEMPOS+" INTEGER)";
    public static final String TABLA_BRI="brazosintermedio";
    public static final String CREAR_TABLA_BRI="CREATE TABLE "+TABLA_BRI+" ("+CAMPO_NOMBRE_GIF+" TEXT ,"+CAMPO_NOMBRE_EJERCICIO+" TEXT ,"+CAMPO_NUM_REPETICIONES+" TEXT ,"+CAMPO_TIEMPOS+" INTEGER)";
    public static final String TABLA_BRA="brazosavanzado";
    public static final String CREAR_TABLA_BRA="CREATE TABLE "+TABLA_BRA+" ("+CAMPO_NOMBRE_GIF+" TEXT ,"+CAMPO_NOMBRE_EJERCICIO+" TEXT ,"+CAMPO_NUM_REPETICIONES+" TEXT ,"+CAMPO_TIEMPOS+" INTEGER)";
}
