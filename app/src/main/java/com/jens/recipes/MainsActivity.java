package com.jens.recipes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mains);

        final Button sauceHollandaiseButton = findViewById(R.id.buttonSauceHollandaise);
        sauceHollandaiseButton.setOnClickListener(view -> {
            Intent gotoSecond = new Intent(MainsActivity.this, SauceHollandaiseActivity.class);
            startActivity(gotoSecond);
        });

        final Button maroccanChickenButton = findViewById(R.id.buttonMaroccanChicken);
        maroccanChickenButton.setOnClickListener(view -> {
            Intent gotoSecond = new Intent(MainsActivity.this, MorocconChickenActivity.class);
            startActivity(gotoSecond);
        });

        final Button doradeButton = findViewById(R.id.buttonDorade);
        doradeButton.setOnClickListener(view -> {
            Intent gotoSecond = new Intent(MainsActivity.this, DoradeActivity.class);
            startActivity(gotoSecond);
        });

        final Button orangeFennelChickenButton = findViewById(R.id.buttonOrangeFennelChicken);
        orangeFennelChickenButton.setOnClickListener(view -> {
            Intent gotoSecond = new Intent(MainsActivity.this, OrangeFennelChickenActivity.class);
            startActivity(gotoSecond);
        });

        final Button pizzaCalzoneButton = findViewById(R.id.buttonPizzaCalzone);
        pizzaCalzoneButton.setOnClickListener(view -> {
            Intent gotoSecond = new Intent(MainsActivity.this, PizzaCalzoneActivity.class);
            startActivity(gotoSecond);
        });

        final Button fussiliWithSalmonButton = findViewById(R.id.buttonFussiliWithSalmon);
        fussiliWithSalmonButton.setOnClickListener(view -> {
            Intent gotoSecond = new Intent(MainsActivity.this, FussiliWithSalmonActivity.class);
            startActivity(gotoSecond);
        });

        final Button spaghettiCarbonaraButton = findViewById(R.id.buttonSpaghettiCarbonara);
        spaghettiCarbonaraButton.setOnClickListener(view -> {
            Intent gotoSecond = new Intent(MainsActivity.this, SpaghettiCarbonaraActivity.class);
            startActivity(gotoSecond);
        });

        ActionBar sab = getSupportActionBar();
        if (sab != null) {
            sab.setDisplayHomeAsUpEnabled(true);
        }
    }
}