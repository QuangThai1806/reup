package com.example.ontap3;

public class SinhVien {
    public String Hoten;
    public Integer Tuoi;


    public SinhVien(String hoten, Integer tuoi) {
        Hoten = hoten;
        Tuoi = tuoi;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public Integer getTuoi() {
        return Tuoi;
    }

    public void setTuoi(Integer tuoi) {
        Tuoi = tuoi;
    }
}
