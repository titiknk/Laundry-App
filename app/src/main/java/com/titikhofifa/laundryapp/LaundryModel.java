package com.titikhofifa.laundryapp;

public class LaundryModel {
    private String namaL1;
    private int logoL1;

    public LaundryModel(String namaLaundry, int logoLaundry) {
        this.namaL1 = namaLaundry;
        this.logoL1 = logoLaundry;
    }

    public static int get(int position) {
        return position;
    }



    public String getnamaL1() {
        return namaL1;
    }

    public void setNamaL1(String namaL1) {
        this.namaL1 = namaL1;
    }

    public int getLogoL1() {
        return logoL1;
    }

    public void setLogoL1(int logoL1) {
        this.logoL1 = logoL1;
    }
}
