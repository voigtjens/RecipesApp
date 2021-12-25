package com.jens.recipes;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import android.os.Bundle;
import android.widget.TextView;

public class MorocconChickenActivity extends RecipeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView titleView = findViewById(R.id.title);
        titleView.setText("Marokkanisches Hühnchen");

        // Instantiate a ViewPager2 and a PagerAdapter.
        viewPager = findViewById(R.id.pager);
        FragmentStateAdapter pagerAdapter = new ScreenSlidePagerAdapter(this,
                R.drawable.orangefennelchicken111,
                "morocconChickenIngredients.html",
                "morocconChickenRecipe.html"
        );
        viewPager.setAdapter(pagerAdapter);
        //viewPager.setPageTransformer(new ZoomOutPageTransformer());
        // TabSlider can only be set after adapter is set to viewpager
        createTabSlider();
    }
}