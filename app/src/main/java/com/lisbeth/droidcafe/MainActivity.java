package com.lisbeth.droidcafe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showFoodOrder(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,OrderActivity.class);
        startActivity(intent);
    }



    public void showDonutOrder(View view) {
        showFoodOrder(getString(R.string.donut_order));
    }

    public void showIcecreamOrder(View view) {
        showFoodOrder(getString(R.string.icecream_order));
    }

    public void showFroyoOrder(View view) {
        showFoodOrder(getString(R.string.froyo_order));
    }
}