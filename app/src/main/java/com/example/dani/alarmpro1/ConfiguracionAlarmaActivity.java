package com.example.dani.alarmpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfiguracionAlarmaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion_alarma);

        Button button = (Button) findViewById(R.id.botonAjustesRepeticion);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SwipeActivity.class);
                startActivityForResult(intent,0);
            }
        });





    }
}
