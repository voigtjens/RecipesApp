package com.jens.recipes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SaladsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salads);

        ActionBar sab = getSupportActionBar();
        if (sab != null) {
            sab.setDisplayHomeAsUpEnabled(true);
        }
    }
}