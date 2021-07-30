package com.example.transport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class paradas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paradas);
    }
    public void cambiar_ruta(View view){
        Intent obj = new Intent(this,Rutas.class);
        this.startActivity(obj);
    }
}