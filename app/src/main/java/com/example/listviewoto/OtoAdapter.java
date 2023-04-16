package com.example.listviewoto;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class OtoAdapter extends BaseAdapter {
    private final Context context;
    private final int layout;
    private final List<Oto> otoList;

    public OtoAdapter(Context context, int layout, List<Oto> list) {
        this.context = context;
        this.layout = layout;
        this.otoList = list;
    }

    @Override
    public int getCount() {
        return otoList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("ViewHolder")

    private class ViewHolder {
        ImageView imgoto;
        TextView txtname, txttinhnang;
        int a =0;
        String b = "Hell";

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();

            holder.txtname = view.findViewById(R.id.txtname);
            holder.txttinhnang = view.findViewById(R.id.txttinhnang);
            holder.imgoto = view.findViewById(R.id.imgoto);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        Oto oto = otoList.get(i);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        holder.txtname.setText(oto.getName());
        holder.txttinhnang.setText(oto.getTinhnang());
        holder.imgoto.setImageResource(oto.getHinh());

        return view;
    }
}
