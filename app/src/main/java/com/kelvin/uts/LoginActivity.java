package com.kelvin.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    EditText edittext_nohp;
    Button btn_masuk;
    TextView textview_regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        edittext_nohp = findViewById(R.id.edittext_nohp);
        btn_masuk = findViewById(R.id.btn_masuk);
        textview_regis = findViewById(R.id.textview_regis);

        btn_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pindah = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(pindah);
            }
        });
    }
}
