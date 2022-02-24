package com.example.fblaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void onCourseClick(View view){
        //create course selector intent
        Intent courseSelector = new Intent(this,MainActivity.class);
        startActivity(courseSelector);
    }

    public void onECClick(View view){
    }


}