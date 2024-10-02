package com.pezloja.mevoydeviaje;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroupDestino, radioGroupTransporte;
    RadioButton btnParis, btnLondres, btnRoma, btnCoche, btnTren, btnAvion;
    Button btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupDestino = findViewById(R.id.rdgDestino);
        radioGroupTransporte = findViewById(R.id.rdgTransporte);

         btnParis = findViewById(R.id.btnParis);
         btnLondres = findViewById(R.id.btnLondres);
         btnRoma = findViewById(R.id.btnRoma);
         btnCoche = findViewById(R.id.btnCoche);
         btnTren = findViewById(R.id.btnTren);
         btnAvion = findViewById(R.id.btnAvion);

         btnInfo = findViewById(R.id.btnInfo);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String destino = "";
                if (btnParis.isChecked()) {
                    destino = "París";
                } else if (btnLondres.isChecked()) {
                    destino = "Londres";
                } else if (btnRoma.isChecked()) {
                    destino = "Roma";
                }

                String transporte = "";
                if (btnCoche.isChecked()) {
                    transporte = "Coche";
                } else if (btnTren.isChecked()) {
                    transporte = "Tren";
                } else if (btnAvion.isChecked()) {
                    transporte = "Avión";
                }

                String mensaje = "Me voy a " + destino + " en " + transporte;
                Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_LONG).show();
            }
        });

    }
}