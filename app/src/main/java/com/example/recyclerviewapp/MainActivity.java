package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Model> listModel = new ArrayList<Model>();
    private LinearLayoutManager linearLayoutPembuat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);

        listModel.addAll(Data.getListData());

        linearLayoutPembuat = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(linearLayoutPembuat);
        Adapter itemsAdapter = new Adapter(listModel);
        recyclerView.setAdapter(itemsAdapter);
    }
}