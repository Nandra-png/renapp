package com.example.renapp.bangundatar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.renapp.R;

public class ganjar extends AppCompatActivity {

    private EditText inputAlas;
    private EditText inputTinggi;
    private TextView hasilLuas;
    private Button calculateButton;

    private ImageView backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganjar);

        // Inisialisasi view
        inputAlas = findViewById(R.id.input1);
        inputTinggi = findViewById(R.id.input2);
        hasilLuas = findViewById(R.id.hasiluas);
        calculateButton = findViewById(R.id.Calculate);
        backButton = findViewById(R.id.back_btn);

        // Menambahkan listener untuk tombol kalkulasi
        calculateButton.setOnClickListener(view -> hitungLuasJajarGenjang());

        backButton.setOnClickListener(view -> kembaliKeFragment1());
    }

    private void kembaliKeFragment1() {
        finish();
    }

    private void hitungLuasJajarGenjang() {
        // Mendapatkan nilai alas dan tinggi dari input
        String alasStr = inputAlas.getText().toString().trim();
        String tinggiStr = inputTinggi.getText().toString().trim();

        // Validasi apakah input kosong
        if (!alasStr.isEmpty() && !tinggiStr.isEmpty()) {
            // Parsing nilai alas dan tinggi ke dalam tipe data double
            double alas = Double.parseDouble(alasStr);
            double tinggi = Double.parseDouble(tinggiStr);

            // Menghitung luas jajar genjang
            double luas = alas * tinggi;

            // Menampilkan hasil luas pada TextView
            hasilLuas.setText(String.valueOf(luas));
        } else {
            // Jika salah satu input kosong, atur hasil luas menjadi 0
            hasilLuas.setText("");
        }
    }
}
