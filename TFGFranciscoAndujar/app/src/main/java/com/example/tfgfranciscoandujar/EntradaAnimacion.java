package com.example.tfgfranciscoandujar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class EntradaAnimacion extends AppCompatActivity {
    ImageView ImagenTitulo1,ImagenTitulo2,ImagenEspartanoGym,ImagenEspada1,ImagenEspada2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entradaanimacion);
        ImagenTitulo1=(ImageView)findViewById(R.id.imgTituloEntrada1);
        ImagenTitulo2=(ImageView)findViewById(R.id.imgTituloEntrada2);
        ImagenEspartanoGym=(ImageView)findViewById(R.id.imgEspartanoGymEntrada);
        ImagenEspada1=(ImageView)findViewById(R.id.imgEspadaEntrada1);
        ImagenEspada2=(ImageView)findViewById(R.id.imgEspadaEntrada2);
        rotarImagen(ImagenEspada1);
        rotarImagen(ImagenEspada2);
    }
    @Override
    protected void onResume(){
        super.onResume();
        aparicion(ImagenEspartanoGym);
    }

    @Override
    protected void onPause(){
        super.onPause();
        esconder(ImagenEspartanoGym);
    }


    private void rotarImagen(View view){
        RotateAnimation animation = new RotateAnimation(0, 360,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f);

        animation.setDuration(2000);
        animation.setRepeatCount(Animation.INFINITE);
        animation.setRepeatMode(Animation.REVERSE);
        view.startAnimation(animation);
    }

    private void aparicion(View view){
        ImagenTitulo1.animate().alpha(1f).setDuration(3000);
        ImagenTitulo2.animate().alpha(1f).setDuration(6000);
        ImagenEspartanoGym.animate().alpha(1f).setDuration(11000);
        ImagenEspada1.animate().alpha(1f).setDuration(11000);
        ImagenEspada2.animate().alpha(1f).setDuration(11000);

    }
    private void esconder(View view){
        ImagenTitulo1.animate().alpha(0f).setDuration(0);
        ImagenTitulo2.animate().alpha(0f).setDuration(0);
        ImagenEspartanoGym.animate().alpha(0f).setDuration(0);
        ImagenEspada1.animate().alpha(0f).setDuration(0);
        ImagenEspada2.animate().alpha(0f).setDuration(0);

    }

    public void botonEmpezarParaLlegarInterfazEjercicios(View view){
        Intent ir1=new Intent(this,InterfazElegirEjercicio.class);
        startActivity(ir1);
    }



}