package com.example.interfaz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GestionarAdapter extends BaseAdapter {

    String [] Resultado;
    String [] CantidadResultado;
    String [] PrecioResultado;
    int [] imgid;
    Context contexto;
    private static LayoutInflater inflater=null;
    // constructor que recibe los parametros!
    public GestionarAdapter(MainActivity mainActivity, String [] Resultado1, int [] imgid1, String [] cant1, String [] Prec1 ){
        Resultado = Resultado1;
        imgid = imgid1;
        CantidadResultado = cant1;
        PrecioResultado = Prec1;
        contexto = mainActivity;
        inflater = (LayoutInflater)contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return Resultado.length;
    }

    @Override
    public Object getItem(int position)
    {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder{
        // Referencias de las plantillas.
        TextView tv1;
        TextView tv2;
        TextView tv3;
        ImageView img;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder HOLDER  = new Holder();
        View fila;
        fila = inflater.inflate(R.layout.listafrutas,null);
        HOLDER.tv1=(TextView) fila.findViewById(R.id.tvFrutas);
        HOLDER.tv2=(TextView) fila.findViewById(R.id.tvCantidadChange);
        HOLDER.tv3=(TextView) fila.findViewById(R.id.tvFechaChange);
        HOLDER.img=(ImageView) fila.findViewById(R.id.imgFruta);
        HOLDER.tv1.setText(Resultado[position]);
        HOLDER.img.setImageResource(imgid[position]);
        HOLDER.tv2.setText(CantidadResultado[position]);
        HOLDER.tv3.setText(PrecioResultado[position]);
        return fila;
    }
}
