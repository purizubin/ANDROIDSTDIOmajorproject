package com.example.majorproject;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void sighinpage(View view) {
        Intent intent = new Intent(this, usersignin.class);
        startActivity(intent);
        Toast.makeText(this, "user signin page", Toast.LENGTH_SHORT).show();
    }

    public void adminsignin(View view) {
        Intent intent = new Intent(this, adminsignin.class);
        startActivity(intent);
        Toast.makeText(this, "admin signin page", Toast.LENGTH_SHORT).show();
    }

    public void feedbackform(View view) {
        Intent intent = new Intent(this, feedbackform.class);
        startActivity(intent);
        Toast.makeText(this, "feedback form page", Toast.LENGTH_SHORT).show();
    }
}