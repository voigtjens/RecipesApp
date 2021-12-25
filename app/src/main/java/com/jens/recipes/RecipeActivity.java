package com.jens.recipes;

import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import org.jetbrains.annotations.NotNull;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_recipe_viewpager2);

        ActionBar sab = getSupportActionBar();
        if (sab != null) {
            sab.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public void onBackPressed() {
        if (viewPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    protected void createTabSlider() {
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("Bild");
                            break;
                        case 1:
                            tab.setText("Zutaten");
                            break;
                        case 2:
                            tab.setText("Rezept");
                            break;
                    }
                }).attach();
    }

    protected class ScreenSlidePagerAdapter extends FragmentStateAdapter {
        public ScreenSlidePagerAdapter(FragmentActivity fa, int picture, String ingredients, String recipe) {
            super(fa);
            myPicture = picture;
            myIngredients = ingredients;
            myRecipe = recipe;
        }

        @Override
        public @NotNull Fragment createFragment(int position) {

            Fragment selectedFragment;
            Bundle bundle = new Bundle();

            switch (position) {
                case 0:
                    selectedFragment = new PictureFragment();
                    bundle.putInt("picture", myPicture);
                    selectedFragment.setArguments(bundle);
                    break;
                case 1:
                    selectedFragment = new WebViewFragment();
                    bundle.putString("fileName", myIngredients);
                    selectedFragment.setArguments(bundle);
                    break;
                default:
                    selectedFragment = new WebViewFragment();
                    bundle.putString("fileName", myRecipe);
                    selectedFragment.setArguments(bundle);
            }
            return selectedFragment;
        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }

        private final int myPicture;
        private final String myIngredients;
        private final String myRecipe;
    }

    protected static final int NUM_PAGES = 3;
    protected ViewPager2 viewPager;
}