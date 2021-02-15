package com.example.mywhatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private Chat[] chats = {new Chat("Johan", "Ayudame con Ingles", BitmapFactory.decodeFile("D:\\Ejercicios android\\MyWhatsApp2\\app\\src\\main\\java\\com\\example\\mywhatsapp\\Jonan.bmp"), "20/12/2020"),
    new Chat("David", "Dame tu Ps5", BitmapFactory.decodeFile("D:\\Ejercicios android\\MyWhatsApp2\\app\\src\\main\\java\\com\\example\\mywhatsapp\\Jonan.bmp"), "15/2/2021")
    };

    ListView lista ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.lista);
        Adaptadores adaptador = new Adaptadores(getApplicationContext(), chats);
        lista.setAdapter(adaptador);
    }
}