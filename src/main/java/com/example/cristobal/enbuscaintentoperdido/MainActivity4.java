package com.example.cristobal.enbuscaintentoperdido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {


    String nombre;
    TextView txBienv;
    Button btnCogeLLave;
    Button btnAbrirPuerta;
    boolean llave = false;
    int cod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        txBienv = (TextView) findViewById(R.id.textBienbenidoActv4);
        btnCogeLLave   = (Button) findViewById(R.id.btnCogeLLave);
        btnAbrirPuerta = (Button) findViewById(R.id.btnAbrePuerta);
        nombre = getIntent().getStringExtra("Nombre");
        txBienv.setText(String.format(getResources().getString(R.string.BienvMensaAct4), nombre));
        Toast toast = Toast.makeText(getApplicationContext(), getResources()
                .getString(R.string.toastMensaInicialLLave),Toast.LENGTH_SHORT);
        toast.show();
        llave = false;
    }




    public void cogerLlave(View v){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivityForResult(intent, cod);
    }


    public  void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            llave = true;
            Toast toast = Toast.makeText(getApplicationContext(), getResources()
                    .getString(R.string.toastLlaveOK),Toast.LENGTH_SHORT);
            toast.show();
        } else {
            llave = false;
            Toast toast = Toast.makeText(getApplicationContext(), getResources()
                    .getString(R.string.toastNOllave),Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    public void abrirPuerta(View v){
        if(llave == true){
            Intent intent = new Intent(this, MainActivity6.class);
            startActivity(intent);
            finish();
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), getResources()
                    .getString(R.string.toastNOllave),Toast.LENGTH_SHORT);
            toast.show();
        }
    }

}
