package com.example.fblaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ExtraCurricular extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_curricular);
    }

    public void onFBLASignup(View view){
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{"mhsfbla@masonohioschools.com"});
        email.putExtra(Intent.EXTRA_SUBJECT, "FBLA Signup");
        email.putExtra(Intent.EXTRA_TEXT, "Hi I would like to join FBLA.");

        //need this to prompts email client only
        email.setType("message/rfc822");

        startActivity(Intent.createChooser(email, "Choose an Email client :"));
    }

    public void onSciolySignup(View v){
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{"mhsscioly@masonohioschools.com"});
        email.putExtra(Intent.EXTRA_SUBJECT, "SciOly Signup");
        email.putExtra(Intent.EXTRA_TEXT, "Hi I would like to join SciOly.");

        //need this to prompts email client only
        email.setType("message/rfc822");

        startActivity(Intent.createChooser(email, "Choose an Email client :"));
    }
}