package com.example.tablex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView2);
    }

    public void playOrder(View view) {
        // Intent we used one activity to another activity

        Intent intent = new Intent(this, OrderActivity.class);
        startActivity(intent);

    }

}