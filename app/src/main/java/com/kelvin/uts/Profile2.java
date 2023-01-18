package com.kelvin.uts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

public class Profile2 extends AppCompatActivity {
    String namaMahasiswa = "NamaMahasiswa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile2);

        String nameExtra = getIntent().getStringExtra("name");

        if (nameExtra != null) {
            namaMahasiswa = nameExtra;
        }

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(namaMahasiswa);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
