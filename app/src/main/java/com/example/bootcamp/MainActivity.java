package com.example.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.mainButton);
        button.setOnClickListener(v -> {
            EditText text = findViewById(R.id.mainName);
            String name = text.getText().toString();
            Intent myIntent = new Intent(MainActivity.this, Greeting.class);
            myIntent.putExtra("name", name);
            MainActivity.this.startActivity(myIntent);
        });
    }
}