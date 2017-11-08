package com.example.cristobal.enbuscaintentoperdido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {

    Button btnSiguiente;
    String nombre;
    EditText etx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        btnSiguiente = (Button) findViewById(R.id.btnPasaActividad2);
        etx = (EditText) findViewById(R.id.introNombre);
    }

    public void pasoActividad2(View v){
        String mensaToast = getResources().getString(R.string.toastNombreVacio);
        nombre = etx.getText().toString();
        if(nombre.length() == 0){
            Toast toast1 = Toast.makeText(getApplicationContext(), mensaToast, Toast.LENGTH_SHORT);
            toast1.show();
        } else {
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("Nombre", nombre);
            startActivity(intent);
            finish();
        }

    }
}
