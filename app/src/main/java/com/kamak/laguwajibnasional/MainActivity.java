package com.kamak.laguwajibnasional;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv)
    RecyclerView rv;
    private ArrayList<Model_Lagu>list;
    public static final String judul="JUDUL";
    public static final String pencipta="PENCIPTA";
    public static final String video="VIDEO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        rv.setHasFixedSize(true);
        list=new ArrayList<Model_Lagu>();
        list.addAll(Data_Lagu.getListData());

        rv.setLayoutManager(new LinearLayoutManager(this));
        Adapter_Lagu adapter_lagu=new Adapter_Lagu(this);
        adapter_lagu.setData_lagu(list);
        rv.setAdapter(adapter_lagu);




    }
}
