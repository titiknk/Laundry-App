package com.titikhofifa.laundryapp;

import java.util.ArrayList;

public class Model {

    int image;
    String judul,detil;


    public Model(int image, String judul){


        this.image = image;
        this.judul = judul;
        this.detil = detil;


    }

    public Model() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void filterList (ArrayList<Model> filteredList){

    }
}
