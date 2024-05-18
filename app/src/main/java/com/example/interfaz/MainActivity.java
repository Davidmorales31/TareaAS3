package com.example.interfaz;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    Context contexto;
    int [] imgFrutas = {
            R.drawable.banana,
            R.drawable.coco,
            R.drawable.manzana,
            R.drawable.pera,
            R.drawable.sandia
    };

    String [] namesFrutas = {
            "BANANA",
            "COCO",
            "MANZANA",
            "PERA",
            "SANDIA",
    };

    String [] Cantidad = {
            "3",
            "2",
            "1",
            "5",
            "6",
    };

    String [] Precios = {
            "700",
            "2500",
            "1500",
            "1200",
            "2300",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        contexto = this;
        lista = (ListView) findViewById(R.id.LiVista);
        lista.setAdapter(new GestionarAdapter(this, namesFrutas, imgFrutas, Cantidad, Precios));

    }
}