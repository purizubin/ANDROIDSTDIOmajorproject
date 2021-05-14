package com.example.majorproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class adminpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminpage);
    }

    public void adduser(View view) {
        Intent intent = new Intent(this, adduser.class);
        startActivity(intent);
        Toast.makeText(this, "add user", Toast.LENGTH_SHORT).show();
    }
}