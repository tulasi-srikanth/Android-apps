package com.example.countapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.text1);
    }

    public void incCount(View view) {
        count++;
        t1.setText(""+count);
    }

    public void message(View view) {
        /*Toast is a notification message that popup for a specific duration*/
        Toast.makeText(MainActivity.this, "HOW YOU DOIN'?", Toast.LENGTH_LONG).show();
    }
}