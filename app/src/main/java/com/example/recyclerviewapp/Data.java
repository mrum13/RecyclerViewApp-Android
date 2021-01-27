package com.example.recyclerviewapp;

import java.util.ArrayList;

public class Data extends Model {
    private static String[] nama_wadah = {
            "Thinkpad",
            "ASUS ROG",
            "MACBOOK PRO"
    };

    private static int[] gambar_wadah = {
            R.drawable.thinkpad,
            R.drawable.rog,
            R.drawable.macbook
    };

    public static ArrayList<Model> getListData() {
        ArrayList<Model> list = new ArrayList<>();
        for (int position = 0; position < nama_wadah.length; position++) {
            Model list_data = new Model();
            list_data.setJudul(nama_wadah[position]);
            list_data.setGambar(gambar_wadah[position]);
            list.add(list_data);
        }
        return list;
    }
}
