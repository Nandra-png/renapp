package com.example.renapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.renapp.R;
import com.example.renapp.bangunruang.Balok;
import com.example.renapp.bangunruang.Kubus;
import com.example.renapp.bangunruang.bola;
import com.example.renapp.bangunruang.krucut;
import com.example.renapp.bangunruang.tabung;


public class Fragment2 extends Fragment {

    private ImageView kubus;
    private ImageView balok;
    private ImageView krucut;
    private ImageView bola;
    private ImageView tabung;
    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment2, container, false);
        kubus = view.findViewById(R.id.btn_kubus);
        balok = view.findViewById(R.id.btn_balok);
        krucut = view.findViewById(R.id.btn_krucut);
        bola = view.findViewById(R.id.btn_bola);
        tabung = view.findViewById(R.id.btn_tabung);

        kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kekubus = new Intent(getActivity(), Kubus.class);
                startActivity(kekubus);
            }
        });
        balok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kebalok = new Intent(getActivity(), Balok.class);
                startActivity(kebalok);

            }
        });
        krucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kekrucut = new Intent(getActivity(), com.example.renapp.bangunruang.krucut.class);
                startActivity(kekrucut);
            }
        });
        bola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kebola = new Intent(getActivity(), com.example.renapp.bangunruang.bola.class);
                startActivity(kebola);
            }
        });
        tabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ketabung = new Intent(getActivity(), com.example.renapp.bangunruang.tabung.class);
                startActivity(ketabung);
            }
        });

        return view;
    }
}
