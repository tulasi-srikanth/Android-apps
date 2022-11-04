package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    /*Intent is a message that is passed bw components such as activities content providers
     * and broadcast receivers and services.There are 2 types of intents 1.Implicit 2.explicit */
    EditText e1,e2,e3,e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.edit1);
        e2 = findViewById(R.id.edit2);
        e3 = findViewById(R.id.edit3);
        e4 = findViewById(R.id.edit4);
    }

    public void submit(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    public void SendURL(View view) {
        String url = e1.getText().toString();
        Uri webpage = Uri.parse("https://www."+url);
        Intent intent = new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(intent);
    }

    public void passvalue(View view) {
        String name = e2.getText().toString();
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("KEY",name);
        startActivity(intent);

    }

    public void passvalue1(View view) {
        Uri uri = Uri.parse("tel:8005551234");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);

    }

    public void location(View view) {
        String loc = e4.getText().toString();
        Uri address = Uri.parse("geo:0,0?q="+loc);
        Intent intent =  new Intent(Intent.ACTION_VIEW,address);
        startActivity(intent);
    }
}