package com.jens.recipes;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import android.os.Bundle;
import android.widget.TextView;

public class SauceHollandaiseActivity extends RecipeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView titleView = findViewById(R.id.title);
        titleView.setText("Sauce Hollandaise");

        // Instantiate a ViewPager2 and a PagerAdapter.
        viewPager = findViewById(R.id.pager);
        FragmentStateAdapter pagerAdapter = new ScreenSlidePagerAdapter(this,
                R.drawable.saucehollandaise,
                "sauceHollandaiseIngredients.html",
                "sauceHollandaiseRecipe.html"
                );
        viewPager.setAdapter(pagerAdapter);
        //viewPager.setPageTransformer(new ZoomOutPageTransformer());
        // TabSlider can only be set after adapter is set to viewpager
        createTabSlider();
    }
}