package com.example.renapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.renapp.R;
import com.example.renapp.bangundatar.ganjar;
import com.example.renapp.bangundatar.lingkaran;
import com.example.renapp.bangundatar.persegi_panjang;
import com.example.renapp.bangundatar.persegi_sc;
import com.example.renapp.bangundatar.segitiga;


public class Fragment1 extends Fragment {


    private ImageView persegibtn;
    private ImageView ppanjangbtn;
    private ImageView segitigabtn;
    private ImageView lingkaranbtn;
    private ImageView ganjarbtn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment1, container, false);

        persegibtn = view.findViewById(R.id.btn_persegi);
        ppanjangbtn = view.findViewById(R.id.btn_persegipanjang);
        segitigabtn = view.findViewById(R.id.btn_segitiga);
        lingkaranbtn = view.findViewById(R.id.btn_lingkaran);
        ganjarbtn = view.findViewById(R.id.btn_jajargenjang);

        persegibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kepersegi = new Intent(getActivity(), persegi_sc.class);
                startActivity(kepersegi);
            }
        });

        ppanjangbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keppanjang = new Intent(getActivity(), persegi_panjang.class);
                startActivity(keppanjang);
            }
        });
        segitigabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kesegitiga = new Intent(getActivity(), segitiga.class);
                startActivity(kesegitiga);
            }
        });
        lingkaranbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kelingkaran = new Intent(getActivity(), lingkaran.class);
                startActivity(kelingkaran);
            }
        });
        ganjarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keganjar = new Intent(getActivity(), ganjar.class);
                startActivity(keganjar);
            }
        });

        return view;


    }


}