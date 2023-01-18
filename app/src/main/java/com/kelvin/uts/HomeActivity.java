package com.kelvin.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {
    LinearLayout linear_mahasiswa1, linear_mahasiswa2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        linear_mahasiswa1 = findViewById(R.id.linear_mahasiswa1);
        linear_mahasiswa2 = findViewById(R.id.linear_mahasiswa2);

        linear_mahasiswa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(HomeActivity.this, Profile1.class);
                pindah.putExtra("name", getResources().getString(R.string.nama_mahasiswa1));
                startActivity(pindah);
            }
        });

        linear_mahasiswa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(HomeActivity.this, Profile2.class);
                pindah.putExtra("name", getResources().getString(R.string.nama_mahasiswa2));
                startActivity(pindah);
            }
        });

    }
}

