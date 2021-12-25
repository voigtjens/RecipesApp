package com.jens.recipes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DoradeActivity extends RecipeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView titleView = findViewById(R.id.title);
        titleView.setText("Dorade");

        // Instantiate a ViewPager2 and a PagerAdapter.
        viewPager = findViewById(R.id.pager);
        FragmentStateAdapter pagerAdapter = new ScreenSlidePagerAdapter(this,
                R.drawable.dorade111,
                "doradeIngredients.html",
                "doradeRecipe.html"
        );
        viewPager.setAdapter(pagerAdapter);
        //viewPager.setPageTransformer(new ZoomOutPageTransformer());
        // TabSlider can only be set after adapter is set to viewpager
        createTabSlider();
    }
}