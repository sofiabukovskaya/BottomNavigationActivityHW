package com.example.bottomnavigationactivityapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    String tag = "LifeCycleEvents";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new FavoriteFragment()).commit();
        }

    }

    public void onStart() {
        super.onStart();
        Log.d(tag, "In the onStart() event");
    }

    public void onRestart() {
        super.onRestart();
        Log.d(tag, "In the onRestart() event");
    }

    public void onResume() {
        super.onResume();
        Log.d(tag, "In the onResume() event");
    }

    public void onPause() {
        super.onPause();
        Log.d(tag, "In the onPause() event");
    }

    public void onStop() {
        super.onStop();
        Log.d(tag, "In the onStop() event");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_favorite:
                            selectedFragment = new FavoriteFragment();
                            break;
                        case R.id.nav_color:
                            selectedFragment = new ColorFragment();
                            break;
                        case R.id.nav_emoji:
                            selectedFragment = new EmojiFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();
                    return true;
                }
            };
}