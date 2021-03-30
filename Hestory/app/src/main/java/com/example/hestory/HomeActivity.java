package com.example.hestory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Button addButton = (Button) findViewById(R.id.addButton);
        setContentView(R.layout.activity_home);
    }
}