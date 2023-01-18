package com.kelvin.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linear_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear_login = findViewById(R.id.linear_login);

        linear_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pindah = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(pindah);
            }
        });
    }
}