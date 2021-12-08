package com.example.sangredeespartano;

import android.content.Context;
import android.media.MediaPlayer;

public class ControladorMusica {
    public static MediaPlayer mediaPlayer;
    static int posicion=0;
    static boolean estaEncendido=false;
    public ControladorMusica(){

    }

    public static void empezar(Context context){
        mediaPlayer = MediaPlayer.create(context, R.raw.musicagym);
        mediaPlayer.start();
        estaEncendido=true;
    }
    public static void parar(){
        if(mediaPlayer!=null) {
            posicion = mediaPlayer.getCurrentPosition();
            mediaPlayer.pause();
            estaEncendido=false;
        }

    }
    public void continuar() {
        if(mediaPlayer!=null && mediaPlayer.isPlaying() == false) {
            mediaPlayer.seekTo(posicion);
            mediaPlayer.start();
        estaEncendido=true;
    }
    }

}
