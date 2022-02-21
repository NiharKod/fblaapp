package com.example.fblaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  TextView txtMessage = findViewById(R.id.txtMessage);



    }

    public void onBtnClick(View view){
        //Add some code;
        TextView txtMessage = findViewById(R.id.txtMessage);

        //English Course
        EditText txtboxEnglish = findViewById(R.id.txtboxEnglish);
        String englishClass = txtboxEnglish.getText().toString();

        //Math Course
        EditText txtboxMath = findViewById(R.id.txtboxMath);
        String mathClass = txtboxMath.getText().toString();

        //Science Course
        EditText txtboxScience = findViewById(R.id.txtboxScience);
        String scienceClass = txtboxScience.getText().toString();

        //Social
        EditText txtboxSocial = findViewById(R.id.txtboxSocial);
        String socialStudies = txtboxSocial.getText().toString();

        //Art
        EditText txtboxArt = findViewById(R.id.txtboxArt);
        String artClass = txtboxArt.getText().toString();

        //Elective 1
        EditText txtBoxElective1 = findViewById(R.id.txtBoxElective1);
        String elective1 = txtBoxElective1.getText().toString();

        //Elective2
        EditText txtBoxElective2 = findViewById(R.id.txtboxElective2);
        String elective2 = txtBoxElective2.getText().toString();

        




        String englishCourse = txtboxEnglish.getText().toString();

    }
}