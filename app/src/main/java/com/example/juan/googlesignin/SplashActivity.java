package com.example.juan.googlesignin;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    static final private long SPLASH_DELAY=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE); //quitar Action Bar

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//Quitar Barra de Notificaciones

        setContentView(R.layout.activity_splash); //TIENE QUE ESTR DESUES DE CONFIGURAR LAS VENTANAS

        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                Intent a= new Intent().setClass(SplashActivity.this,SignInActivity.class);
                startActivity(a);
                finish();
            }
        };
        Timer timer=new Timer();
        timer.schedule(task, SPLASH_DELAY);
        ;
    }
    }

