package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
Button buttoncari;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttoncari = findViewById(R.id.buttoncari);
        buttoncari.setOnClickListener(view -> {
            Intent i = (new Intent(MainActivity2.this,MainActivity3.class));
            startActivity(i);
        });
    }
}