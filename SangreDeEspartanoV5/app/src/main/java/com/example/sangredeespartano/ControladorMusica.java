package com.example.sangredeespartano;

import android.content.Context;
import android.media.MediaPlayer;

public class ControladorMusica {
    public static MediaPlayer mediaPlayer;
    public ControladorMusica(){

    }

    public static void empezar(Context context){
        mediaPlayer = MediaPlayer.create(context, R.raw.musicagym);
        mediaPlayer.start();
    }
    public static void parar(){
        if(mediaPlayer!=null) {
            mediaPlayer.stop();
        }
    }
}
