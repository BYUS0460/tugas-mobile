package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button2= findViewById(R.id.button2);
        button2.setOnClickListener(view -> {
            Intent i = (new Intent(MainActivity3.this,MainActivity4.class));
            startActivity(i);
        });
    }
}