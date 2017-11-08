package com.example.cristobal.enbuscaintentoperdido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity5 extends AppCompatActivity {

    EditText et;
    Button btnVOlverSinLLave;
    Button btnVolverConLLave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        btnVolverConLLave = (Button) findViewById(R.id.btnVolverLave);
        btnVOlverSinLLave = (Button) findViewById(R.id.btnSinLlave);
    }

    public void volverConLLave(View v){
        setResult(RESULT_OK);
        finish();
    }


    public void volverSinLLave(View v){
        setResult(RESULT_CANCELED);
        finish();
    }
}
