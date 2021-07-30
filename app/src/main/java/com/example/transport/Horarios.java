package com.example.transport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Horarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horarios);
    }
    public void cambiar_paradas(View view){
        Intent obj = new Intent(this,Horarios.class);
        this.startActivity(obj);
    }
}