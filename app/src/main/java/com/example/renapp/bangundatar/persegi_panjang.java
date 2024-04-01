package com.example.renapp.bangundatar;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.renapp.R;

public class persegi_panjang extends AppCompatActivity {

    private EditText inputPanjang;
    private EditText inputLebar;
    private TextView hasilLuas;
    private Button calculateButton;
    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        // Inisialisasi view
        inputPanjang = findViewById(R.id.input1);
        inputLebar = findViewById(R.id.input2);
        hasilLuas = findViewById(R.id.hasiluas);
        calculateButton = findViewById(R.id.Calculate);
        backButton = findViewById(R.id.back_btn);

        // Menambahkan listener untuk input panjang dan lebar
        inputPanjang.addTextChangedListener(panjangTextWatcher);
        inputLebar.addTextChangedListener(lebarTextWatcher);

        // Menambahkan listener untuk tombol kalkulasi
        calculateButton.setOnClickListener(view -> hitungLuasPersegiPanjang());

        // Menambahkan listener untuk tombol kembali
        backButton.setOnClickListener(view -> kembaliKeFragment1());
    }

    private void hitungLuasPersegiPanjang() {
        // Mendapatkan nilai panjang dan lebar dari input
        String panjangStr = inputPanjang.getText().toString().trim();
        String lebarStr = inputLebar.getText().toString().trim();

        // Validasi apakah input kosong
        if (!panjangStr.isEmpty() && !lebarStr.isEmpty()) {
            // Parsing nilai panjang dan lebar ke dalam tipe data double
            double panjang = Double.parseDouble(panjangStr);
            double lebar = Double.parseDouble(lebarStr);

            // Menghitung luas persegi panjang
            double luas = panjang * lebar;

            // Menampilkan hasil luas pada TextView
            hasilLuas.setText(String.valueOf(luas));
        } else {
            // Jika salah satu input kosong, atur hasil luas menjadi 0
            hasilLuas.setText("");
        }
    }

    private void kembaliKeFragment1() {
        // Kembali ke Fragment1
        finish(); // Tutup aktivitas persegi_panjang
    }

    // TextWatcher untuk memantau perubahan pada input panjang
    private final TextWatcher panjangTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            // Tidak digunakan dalam kasus ini
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            // Tidak digunakan dalam kasus ini
        }

        @Override
        public void afterTextChanged(Editable editable) {
            // Reset hasil luas setiap kali input berubah
            hasilLuas.setText("");
        }
    };

    // TextWatcher untuk memantau perubahan pada input lebar
    private final TextWatcher lebarTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            // Tidak digunakan dalam kasus ini
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            // Tidak digunakan dalam kasus ini
        }

        @Override
        public void afterTextChanged(Editable editable) {
            // Reset hasil luas setiap kali input berubah
            hasilLuas.setText("");
        }
    };
}
