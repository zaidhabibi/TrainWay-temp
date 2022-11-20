package com.example.trainway;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    CardView cardView;
    TextView textView_signup, textView_login;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        cardView = findViewById(R.id.cardView_login);

        Button login_button = findViewById(R.id.login_button);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do the login stuff such as validating login info and then go to the next activity
                Intent intent = new Intent(MainActivity.this, mainContent.class);
                startActivity(intent);
            }
        });
    }


    public void signupRedirect(View view) {
        setContentView(R.layout.activity_sign_up);
        Button sign_up_button = findViewById(R.id.signup_button);
        sign_up_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //do the signup stuff and then go to the login page after successfully sign up, save the user info in the database
            }
        });
    }

    public void loginRedirect(View view) {
        setContentView(R.layout.activity_login);
    }
}

