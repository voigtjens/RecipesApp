package com.jens.recipes;

import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.os.Bundle;
import android.widget.TextView;

public class FussiliWithSalmonActivity extends RecipeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            TextView titleView = findViewById(R.id.title);
            titleView.setText("Fussili mit Lachs, Spargel und dicken Bohnen");

            // Instantiate a ViewPager2 and a PagerAdapter.
            viewPager = findViewById(R.id.pager);
            FragmentStateAdapter pagerAdapter = new ScreenSlidePagerAdapter(this,
                    R.drawable.dorade111,
                    "fussiliWithSalmonIngredients.html",
                    "fussiliWithSalmonRecipe.html"
            );
            viewPager.setAdapter(pagerAdapter);
            //viewPager.setPageTransformer(new ZoomOutPageTransformer());
            // TabSlider can only be set after adapter is set to viewpager
            createTabSlider();
        }
}