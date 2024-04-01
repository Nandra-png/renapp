package com.example.renapp.bangunruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.renapp.R;

public class Kubus extends AppCompatActivity {

    private EditText inputSisi;
    private Button btnCalculate;
    private TextView hasilVolume;

    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        inputSisi = findViewById(R.id.input1);
        btnCalculate = findViewById(R.id.Calculate);
        hasilVolume = findViewById(R.id.hasiluas);
        backButton = findViewById(R.id.back_btn);
        backButton.setOnClickListener(view -> kembaliKeFragment2());

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeKubus();
            }
        });
    }

    private void kembaliKeFragment2() {
        finish();
    }

    private void hitungVolumeKubus() {
        // Mengambil nilai sisi dari EditText
        double sisi = Double.parseDouble(inputSisi.getText().toString());

        // Menghitung volume kubus
        double volume = Math.pow(sisi, 3);

        // Menampilkan hasil volume pada TextView
        hasilVolume.setText(String.valueOf(volume));
    }
}
