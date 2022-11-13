package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        button4= findViewById(R.id.button4);
        button4.setOnClickListener(view -> {
            Intent i = (new Intent(MainActivity5.this, MainActivity6.class));
            startActivity(i);
        });
    }
}