package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {
Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        button5= findViewById(R.id.button5);
        button5.setOnClickListener(view -> {
            Intent i = (new Intent(MainActivity6.this, MainActivity7.class));
            startActivity(i);
        });
    }
}