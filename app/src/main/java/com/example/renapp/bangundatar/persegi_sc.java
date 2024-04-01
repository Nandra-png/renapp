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

public class persegi_sc extends AppCompatActivity {

    private EditText inputSisi;
    private TextView hasilLuas;
    private Button calculateButton;
    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_sc);


        inputSisi = findViewById(R.id.input1);
        hasilLuas = findViewById(R.id.hasiluas);
        calculateButton = findViewById(R.id.Calculate);
        backButton = findViewById(R.id.back_btn);


        inputSisi.addTextChangedListener(sisiTextWatcher);


        calculateButton.setOnClickListener(view -> hitungLuasPersegi());

        backButton.setOnClickListener(view -> kembaliKeFragment1());
    }

    private void hitungLuasPersegi() {
        String sisiStr = inputSisi.getText().toString().trim();

        if (!sisiStr.isEmpty()) {

            double sisi = Double.parseDouble(sisiStr);


            double luas = sisi * sisi;


            hasilLuas.setText(String.valueOf(luas));
        } else {

            hasilLuas.setText("");
        }
    }

    private void kembaliKeFragment1() {
        finish();
    }

    private final TextWatcher sisiTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        @Override
        public void afterTextChanged(Editable editable) {
            hasilLuas.setText("");
        }
    };
}
