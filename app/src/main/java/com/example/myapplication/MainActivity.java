package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button buttonlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonlogin = findViewById(R.id.buttonlogin);
        buttonlogin.setOnClickListener(view -> {
            Intent i = (new Intent(MainActivity.this,MainActivity2.class));
            startActivity(i);
        });
    }
}