package com.example.mywhatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptadores extends BaseAdapter {


    private Context contexto;
    private Chat [] array;

    @Override
    public int getCount() {
        return array.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Chat chat = array[position];

        if (convertView == null){
            LayoutInflater inflador = LayoutInflater.from(contexto);
            convertView = inflador.inflate(R.layout.mensaje, null);
        }

        ImageView imagen = convertView.findViewById(R.id.imagen);
        TextView nombre = convertView.findViewById(R.id.nombre);
        TextView mensaje = convertView.findViewById(R.id.mensaje);
        TextView fecha = convertView.findViewById(R.id.hora);

        imagen.setImageBitmap(chat.getImagen());
        nombre.setText(chat.getTitulo());
        mensaje.setText(chat.getCuerpo());

        return convertView;
    }

    public Adaptadores(Context contexto, Chat[] chats){
        this.contexto = contexto;
        this.array = chats;    }
}
