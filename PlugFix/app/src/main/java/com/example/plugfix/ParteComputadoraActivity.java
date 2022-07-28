package com.example.plugfix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.plugfix.adapters.PartesAdapter;

import java.util.ArrayList;
import java.util.List;

public class ParteComputadoraActivity extends AppCompatActivity {

    RecyclerView rvItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte_computadora);
        rvItems = findViewById(R.id.rvItems);
        llenarListado();
    }

    private void llenarListado() {
        List<String> lstHerramientas = new ArrayList<String>();
        lstHerramientas.add("Mouse1");
        lstHerramientas.add("Mouse1");
        lstHerramientas.add("Mouse1");
        lstHerramientas.add("Mouse1");
        lstHerramientas.add("Mouse1");
        lstHerramientas.add("Mouse1");
        lstHerramientas.add("Mouse1");
        lstHerramientas.add("Mouse1");
        lstHerramientas.add("Mouse1");
        lstHerramientas.add("Mouse1");
        lstHerramientas.add("Mouse1");
        PartesAdapter partesAdapter = new PartesAdapter(lstHerramientas, this);
        rvItems.setHasFixedSize(true);
        rvItems.setAdapter(partesAdapter);
    }
}