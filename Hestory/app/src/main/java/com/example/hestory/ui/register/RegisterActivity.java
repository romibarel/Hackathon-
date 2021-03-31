package com.example.hestory.ui.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hestory.R;
import com.example.hestory.ui.login.LoginActivity;

import java.util.Date;

public class RegisterActivity extends AppCompatActivity {
    private RegisterViewModel register;
    private EditText fname;
    private EditText password;
    private EditText lname;
    private TextView regi_error;
    private EditText username;
    private EditText phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        TextView already_has_account= findViewById(R.id.back_to_login);
        register=new RegisterViewModel();
        Button register_btn= findViewById(R.id.register_button);
        fname=findViewById(R.id.firstname_register);
        lname=findViewById(R.id.lastname_register);
        password=findViewById(R.id.editTextTextPassword);
        username=findViewById(R.id.username_register);
        phone=findViewById(R.id.phone_register);
        regi_error = findViewById(R.id.login_Error2);
        regi_error.setVisibility(View.INVISIBLE);
        already_has_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });

        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isSuccess= register.register(username.getText().toString(),password.getText().toString(), fname.getText().toString(),lname.getText().toString(), phone.getText().toString());
                if (isSuccess) {
                    startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                }
                else {
                    regi_error.setText("register failed- username is taken/ field is empty");
                    regi_error.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}