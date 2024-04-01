package com.example.renapp;

import static android.app.PendingIntent.getActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menudepan extends AppCompatActivity {

    private ImageView fragkecil;
    private ImageView btn_start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menudepan);
        btn_start = findViewById(R.id.btn_start);
        fragkecil = findViewById(R.id.pencets);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menudepan.this, MainActivity.class);
                startActivity(intent);
            }
        });

        fragkecil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Menudepan.this);
                View dialogView = LayoutInflater.from(Menudepan.this).inflate(R.layout.custom_dialog, null);
                builder.setView(dialogView);

                TextView messageTextView = dialogView.findViewById(R.id.dialog_message);
                messageTextView.setText("Apakah Anda ingin keluar?");

                Button buttonYes = dialogView.findViewById(R.id.button_yes);
                Button buttonNo = dialogView.findViewById(R.id.button_no);

                AlertDialog dialog = builder.create();

                buttonYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();

                        dialog.dismiss();
                    }
                });

                buttonNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}