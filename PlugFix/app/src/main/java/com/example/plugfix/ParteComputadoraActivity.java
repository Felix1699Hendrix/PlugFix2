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
        lstHerramientas.add("Mouse2");
        lstHerramientas.add("Mouse3");
        lstHerramientas.add("Mouse4");
        lstHerramientas.add("Mouse5");
        lstHerramientas.add("Mouse6");
        lstHerramientas.add("Mouse7");
        lstHerramientas.add("Mouse8");
        lstHerramientas.add("Mouse9");
        lstHerramientas.add("Mouse10");
        lstHerramientas.add("Mouse11");
        lstHerramientas.add("Mouse12");
        PartesAdapter partesAdapter = new PartesAdapter(lstHerramientas, this);
        rvItems.setHasFixedSize(true);
        rvItems.setAdapter(partesAdapter);
    }
}