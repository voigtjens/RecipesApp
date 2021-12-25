package com.jens.recipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button soupsButton = findViewById(R.id.buttonSoups);
        soupsButton.setOnClickListener(view -> {
            Intent gotoSecond = new Intent(MainActivity.this, SoupsActivity.class);
            startActivity(gotoSecond);
        });

        final Button saladsButton = findViewById(R.id.buttonSalads);
            saladsButton.setOnClickListener(view -> {
            Intent gotoSecond = new Intent(MainActivity.this, SaladsActivity.class);
            startActivity(gotoSecond);
        });

        final Button mainsButton = findViewById(R.id.buttonMains);
            mainsButton.setOnClickListener(view -> {
            Intent gotoSecond = new Intent(MainActivity.this, MainsActivity.class);
            startActivity(gotoSecond);
        });

        final Button dessertsButton = findViewById(R.id.buttonDesserts);
            dessertsButton.setOnClickListener(view -> {
            Intent gotoSecond = new Intent(MainActivity.this, DessertsActivity.class);
            startActivity(gotoSecond);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()) {

            case R.id.version:
                Toast.makeText(this, "version 0.1", Toast.LENGTH_LONG).show();
                return(true);
            case R.id.about:
                Toast.makeText(this, "Copyright: Lenja and Jens Voigt, 2021", Toast.LENGTH_LONG).show();
                return(true);
            case R.id.exit:
                finish();
                return(true);

        }
        return(super.onOptionsItemSelected(item));
    }
}