package com.example.renapp.bangunruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.renapp.R;

public class Balok extends AppCompatActivity {

    private EditText inputPanjang, inputLebar, inputTinggi;
    private Button btnCalculate;
    private TextView hasilVolume;

    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        inputPanjang = findViewById(R.id.input1);
        inputLebar = findViewById(R.id.input2);
        inputTinggi = findViewById(R.id.input3);
        btnCalculate = findViewById(R.id.Calculate);
        hasilVolume = findViewById(R.id.hasiluas);
        backButton = findViewById(R.id.back_btn);
        backButton.setOnClickListener(view -> kembaliKeFragment2());

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeBalok();
            }
        });
    }

    private void kembaliKeFragment2() {
        finish();
    }
    private void hitungVolumeBalok() {
        // Mengambil nilai panjang, lebar, dan tinggi dari EditText
        double panjang = Double.parseDouble(inputPanjang.getText().toString());
        double lebar = Double.parseDouble(inputLebar.getText().toString());
        double tinggi = Double.parseDouble(inputTinggi.getText().toString());

        // Menghitung volume balok
        double volume = panjang * lebar * tinggi;

        // Menampilkan hasil volume pada TextView
        hasilVolume.setText(String.valueOf(volume));
    }
}
