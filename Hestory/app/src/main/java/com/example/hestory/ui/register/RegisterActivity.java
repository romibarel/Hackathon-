package com.example.hestory.ui.register;

import android.app.Activity;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hestory.R;
import com.example.hestory.ui.login.LoginActivity;
public class RegisterActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText usernameEditText = findViewById(R.id.username_register);
        final EditText passwordEditText = findViewById(R.id.password_register);
        final EditText LastnameEditText = findViewById(R.id.lastName_register);
        final EditText FirstnameEditText = findViewById(R.id.firstName_register);
        final EditText phoneEditText = findViewById(R.id.editTextPhone_register);
        final EditText organiztionEditText = findViewById(R.id.organiztion_register);
        final Button registerButton = findViewById(R.id.login);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginPage();
            }
        });
    }
    public void openLoginPage(){
        Intent intent= new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}