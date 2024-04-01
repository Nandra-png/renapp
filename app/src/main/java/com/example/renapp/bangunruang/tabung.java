package com.example.renapp.bangunruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.renapp.R;

public class tabung extends AppCompatActivity {

    private EditText inputJariJari, inputTinggi;
    private Button btnCalculate;
    private TextView hasilVolume;

    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        inputJariJari = findViewById(R.id.input1);
        inputTinggi = findViewById(R.id.input2);
        btnCalculate = findViewById(R.id.Calculate);
        hasilVolume = findViewById(R.id.hasiluas);

        backButton = findViewById(R.id.back_btn);
        backButton.setOnClickListener(view -> kembaliKeFragment2());
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeTabung();
            }
        });
    }


    private void kembaliKeFragment2() {
        finish();
    }
    private void hitungVolumeTabung() {
        // Mengambil nilai jari-jari dan tinggi dari EditText
        double jariJari = Double.parseDouble(inputJariJari.getText().toString());
        double tinggi = Double.parseDouble(inputTinggi.getText().toString());

        // Menghitung volume tabung
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;

        // Menampilkan hasil volume pada TextView
        hasilVolume.setText(String.valueOf(volume));
    }
}
