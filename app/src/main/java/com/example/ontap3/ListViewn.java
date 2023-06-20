package com.example.ontap3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewn extends AppCompatActivity {
    ListView lv_sinhvien;
    ArrayList<SinhVien> mangSinhVien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_viewn);
           lv_sinhvien = (ListView) findViewById(R.id.lv_sinhvien);
           mangSinhVien = new ArrayList<>();

           mangSinhVien.add( new SinhVien("Thai",18));
        mangSinhVien.add( new SinhVien("Tu",19));
        mangSinhVien.add( new SinhVien("Dong",17));

        SinhVienAdapter adapter = new SinhVienAdapter(ListViewn.this,R.layout.item_sv, mangSinhVien);
        lv_sinhvien.setAdapter(adapter);
    }
}