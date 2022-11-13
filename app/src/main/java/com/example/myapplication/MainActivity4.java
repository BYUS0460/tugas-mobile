package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button3= findViewById(R.id.button3);
        button3.setOnClickListener(view -> {
            Intent i = (new Intent(MainActivity4.this, MainActivity5.class));
            startActivity(i);
        });
    }
}