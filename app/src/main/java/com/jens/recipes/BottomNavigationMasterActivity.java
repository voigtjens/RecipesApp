package com.jens.recipes;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationMasterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_recipe);
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        TextView titleView = findViewById(R.id.title);
        titleView.setText("Sauce Hollandaise");

        ActionBar sab = getSupportActionBar();
        if (sab != null) {
            sab.setDisplayHomeAsUpEnabled(true);
        }

        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new PictureFragment()).commit();
        }
    }
    private final BottomNavigationView.OnNavigationItemSelectedListener navListener =
            item -> {
                Fragment selectedFragment = null;
                String fileName;
                Bundle bundle = new Bundle();

                switch (item.getItemId()) {
                    case R.id.nav_home:
                        selectedFragment = new PictureFragment();
                        bundle.putInt("picture", R.drawable.saucehollandaise);
                        selectedFragment.setArguments(bundle);
                        break;
                    case R.id.nav_ingredients:
                        selectedFragment = new WebViewFragment();
                        fileName = "sauceHollandaiseIngredients.html";
                        bundle.putString("fileName", fileName);
                        selectedFragment.setArguments(bundle);
                        break;
                    case R.id.nav_recipe:
                        selectedFragment = new WebViewFragment();
                        fileName = "sauceHollandaiseRecipe.html";
                        bundle.putString("fileName", fileName);
                        selectedFragment.setArguments(bundle);
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        selectedFragment).commit();
                return true;
            };
}