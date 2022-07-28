package com.example.plugfix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cvServicioTecnico;
    CardView cvPartesComputador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        cvServicioTecnico = findViewById(R.id.cv_servicio_tecnico);
        cvPartesComputador = findViewById(R.id.cv_partes_computador);
        cvServicioTecnico.setOnClickListener(this);
        cvPartesComputador.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cv_servicio_tecnico:
                Intent intent = new Intent(MenuActivity.this, TecnicoActivity.class);
                startActivity(intent);
                break;
            case R.id.cv_partes_computador:
                Intent intent1 = new Intent(MenuActivity.this, ParteComputadoraActivity.class);
                startActivity(intent1);
                break;
        }
    }
}