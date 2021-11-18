package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = 0;
        mostrarResultado();
    }

    public void incrementaContador (View vista) {
        contador++;
        mostrarResultado();
    }

    public void decrementaContador (View vista) {
        contador--;
        mostrarResultado();
    }

    public void reseteaContador (View vista) {
        contador = 0;
        mostrarResultado();
    }

    public void mostrarResultado () {
        TextView resultadoContador = (TextView) findViewById(R.id.tvContador);
        resultadoContador.setText("Contador: " + contador);
    }
}