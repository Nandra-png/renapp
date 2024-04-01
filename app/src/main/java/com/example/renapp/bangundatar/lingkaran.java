package com.example.renapp.bangundatar;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.renapp.R;

public class lingkaran extends AppCompatActivity {

    private EditText inputJariJari;
    private TextView hasilLuas;
    private Button calculateButton;
    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        inputJariJari = findViewById(R.id.input1);
        hasilLuas = findViewById(R.id.hasiluas);
        calculateButton = findViewById(R.id.Calculate);
        backButton = findViewById(R.id.back_btn);

        inputJariJari.addTextChangedListener(jariJariTextWatcher);

        calculateButton.setOnClickListener(view -> hitungLuasLingkaran());

        backButton.setOnClickListener(view -> kembaliKeFragment1());
    }

    private void hitungLuasLingkaran() {
        String jariJariStr = inputJariJari.getText().toString().trim();
        if (!jariJariStr.isEmpty()) {
            double jariJari = Double.parseDouble(jariJariStr);
            double luas = Math.PI * jariJari * jariJari;
            String formattedLuas = String.format("%.2f", luas);
            hasilLuas.setText(formattedLuas);
        } else {
            hasilLuas.setText("");
        }
    }


    private void kembaliKeFragment1() {
        finish();
    }

    private final TextWatcher jariJariTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

        @Override
        public void afterTextChanged(Editable editable) {
            hasilLuas.setText("");
        }
    };
}
