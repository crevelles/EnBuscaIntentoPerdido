package com.example.cristobal.enbuscaintentoperdido;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    Button btnAbrirNavegador;
    Button btnReinicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        btnAbrirNavegador = (Button) findViewById(R.id.btnAbreNavegador);
        btnReinicio = (Button) findViewById(R.id.btnReinicio);
    }

    public void abreNavegador(View v){
        //Uri uriUrl = Uri.parse("http://developer.android.com/guide/components/intents-filters.html/");
        Uri uriUrl = Uri.parse("http://www.universidadeuropea.es/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(intent);
    }


    public void reinicioApp(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity1.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }
}
