package com.universidadcauca.movil.ciclovida;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ciclo","Entro a OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ciclo","Entro a OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ciclo","Entro al OnResume");
    }

    @Override
    protected void onPause() {
        Log.i("ciclo","Entro al OnPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("ciclo","Entro al OnStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("ciclo","Entro al onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ciclo","Entro al onRestart");
    }
}
