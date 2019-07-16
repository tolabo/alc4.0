package com.tolulopealuko.alc4phase1;
//author by Tolulope Aluko 14/07/2019

import android.content.Intent;
import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public void onclickabout(View v)
    {
        Intent intent = new Intent(this, AboutALCActivity.class);
        startActivity(intent);
    }
    public void onclick(View v)
    {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }


}
