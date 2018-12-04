package com.example.dani.alarmpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.ajustesBoton2); // Creo una varibale boton i la asigno el boton de ajustes.
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AjustesActivity.class);
                startActivityForResult(intent,0);
            }
        });

        Button btnAjustesAlarma = (Button) findViewById(R.id.configuracionAlarma);
        btnAjustesAlarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ConfiguracionAlarmaActivity.class);
                startActivityForResult(intent,0);

            }
        });

        Button btnAñadirAlarma =  (Button) findViewById(R.id.botonAñadirAlarma);
        btnAñadirAlarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),NewAlarmaActivity.class);
                startActivityForResult(intent,0);
            }
        });



        Button btnConfiguarlarma2 = (Button) findViewById(R.id.configuracionAlarma2);
        btnConfiguarlarma2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ConfiguracionAlarmaActivity.class);
                startActivityForResult(intent,0);
            }
        });


    }
}
