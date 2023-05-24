package br.ufmg.coltec.e02_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class DebugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("DEBUG - onCreate", "Criação do app");
        setContentView(R.layout.activity_debug);
    }

    protected void onStart() {
        super.onStart();
        Log.d("DEBUG - onStart", "Exibição da tela");
    }

    protected void onResume(){
        super.onResume();
        Log.d("DEBUG - onResume", "Novo foco no app");
    }

    protected void onPause(){
        super.onPause();
        Log.d("DEBUG - onPause", "Aplicativo fechado");
    }

    protected void onStop(){
        super.onStop();
        Log.d("DEBUG - onStop", "Aplicativo encerrado");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("DEBUG - onRestart", "Aplicativo reiniciado");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("DEBUG - onDestroy", "Aplicativo finalizado");
    }
}