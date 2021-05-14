package com.example.majorproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT =3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent homeIntent = new Intent(MainActivity.this, Home.class);
                startActivity(homeIntent);
                finish();
                Toast.makeText(MainActivity.this, "WELCOME TO DIGITAL LIBRARY", Toast.LENGTH_SHORT).show();
            }
        },SPLASH_TIME_OUT);
    }
}