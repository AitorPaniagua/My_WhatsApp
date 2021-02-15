package com.example.mywhatsapp;

import android.graphics.Bitmap;

import java.util.Date;

public class Chat {

    private String titulo;
    private String cuerpo;
    private Bitmap imagen;
    private String fecha;

    public Chat(String titulo, String cuerpo, Bitmap imagen, String fecha) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.imagen = imagen;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public Bitmap getImagen() {
        return imagen;
    }

    public String getFecha() {
        return fecha;
    }
}
