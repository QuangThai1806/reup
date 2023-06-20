package com.example.ontap3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class SinhVienAdapter extends BaseAdapter {

    Context myContext;
    int myLayout;
    List<SinhVien> arraySinhVien;
    public SinhVienAdapter(Context context, int layout, List<SinhVien> sinhVienList){

        myContext = context;
        myLayout = layout;
        arraySinhVien = sinhVienList;
    }

    @Override
    public int getCount() {
        return arraySinhVien.size();
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

        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout, null);
        //anh xa va gan gia tri
        TextView txtHoten = (TextView) convertView.findViewById(R.id.txtHoten);
        txtHoten.setText(arraySinhVien.get(position).Hoten);
        TextView txtTuoi = (TextView)  convertView.findViewById(R.id.txtTuoi);
        txtTuoi.setText(arraySinhVien.get(position).Tuoi);

        return convertView;
    }
}
