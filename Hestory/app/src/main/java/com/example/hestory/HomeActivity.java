package com.example.hestory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import com.example.hestory.ui.add_story.AddStoryActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ProgressBar loadingProgressBar = findViewById(R.id.loading);
        final ImageButton addButton = (ImageButton) findViewById(R.id.addButton);
        setContentView(R.layout.activity_home);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingProgressBar.setVisibility(View.VISIBLE);
                openAddStoryActivity();
                Log.d("success", "opened reg");
            }
        });
    }

    private void openAddStoryActivity(){
        Intent intent = new Intent(this, AddStoryActivity.class);
        startActivity(intent);
    }
}