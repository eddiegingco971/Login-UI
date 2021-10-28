package com.example.loginui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    public TextInputLayout usr,psw;
    public MaterialButton signin;
    public TextView forgotpsw, signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tools.setSystemBarLight(this);
        Tools.setSystemBarColor(this, R.color.white);

        signin = (MaterialButton) findViewById(R.id.signin);
        usr =  findViewById(R.id.usr);
        psw = findViewById(R.id.psw);
        forgotpsw = (TextView) findViewById(R.id.forgotpsw);
        signup = (TextView) findViewById(R.id.signup);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextInputLayout usr = (TextInputLayout) findViewById(R.id.usr);
                TextInputLayout psw = (TextInputLayout) findViewById(R.id.psw);

                openSignIN();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openSignUP();
            }
        });

        forgotpsw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openForgotPassword();
            }
        });
    }
    public void openSignIN() {
        Intent intent = new Intent(this, SignIN.class);
        startActivity(intent);
    }
    public void openSignUP() {
        Intent intent = new Intent(this, SignUP.class);
        startActivity(intent);
    }
    public void openForgotPassword() {
        Intent intent = new Intent(this, ForgotPassword.class);
        startActivity(intent);
    }
}