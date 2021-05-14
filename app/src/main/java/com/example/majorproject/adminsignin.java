package com.example.majorproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class adminsignin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminsignin);
    }

    public void adminpage(View view) {
        Intent intent = new Intent(this, adminpage.class);
        startActivity(intent);
        Toast.makeText(this, "admin page", Toast.LENGTH_SHORT).show();
    }
}