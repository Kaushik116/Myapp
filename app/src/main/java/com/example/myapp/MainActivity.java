package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mylib.Demo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Demo.simpleDemo(this, "Hello world!!");
    }
}