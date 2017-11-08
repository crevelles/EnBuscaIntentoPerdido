package com.example.cristobal.enbuscaintentoperdido;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button btnAct3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnAct3 = (Button) findViewById(R.id.btnActvi3);
    }


    public void realizarLLamada(View v){
        Uri telf = Uri.parse("tel:917407272");
        Intent llamada = new Intent(Intent.ACTION_DIAL, telf);
        if (llamada.resolveActivity(getPackageManager()) != null) {
            startActivity(llamada);
        }

    }
}
