package com.example.cristobal.enbuscaintentoperdido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    String nombre;
    Button btnCorto;
    Button btnLargo;
    TextView mensaBienvAct2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnCorto = (Button) findViewById(R.id.btnCorto);
        btnLargo = (Button) findViewById(R.id.btnLargo);
        nombre = getIntent().getStringExtra("Nombre");
        mensaBienvAct2 = (TextView) findViewById(R.id.textBienvenidaAct2);
        mensaBienvAct2.setText(String.format(getResources().getString(R.string.MensaNombreAct2), nombre));
    }


    public void atajoCorto(View v){
        Intent intent = new Intent(this, MainActivity4.class);
        intent.putExtra("Nombre", nombre);
        startActivity(intent);
        finish();
    }

    public void atajoLargo(View v){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}
