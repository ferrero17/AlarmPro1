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
                Intent intent = new Intent(v.getContext(), ConfiguracionRepeticionAlarmaActivity.class);
                startActivityForResult(intent,0);
            }
        });

        Button button2 = (Button) findViewById(R.id.botonAjustesRingtone);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ConfiguracionRingtoneAlarmaActivity.class);
                startActivityForResult(intent,0);
            }
        });

        Button button3 = (Button) findViewById(R.id.botonAjustesPosponer);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ConfiguracionPosponerActivity.class);
                startActivityForResult(intent,0);
            }
        });

        Button button4 = (Button) findViewById(R.id.botonAjustesSkip);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ConfiguracionSkipActivity.class);
                startActivityForResult(intent,0);
            }
        });
        Button button5 = (Button) findViewById(R.id.botonAjustesIteracion);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ConfiguracionIteracionActivity.class);
                startActivityForResult(intent,0);
            }
        });


    }
}
