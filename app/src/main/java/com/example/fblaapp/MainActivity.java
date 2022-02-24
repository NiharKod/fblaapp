package com.example.fblaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onShareClick(View view){
        TextView txtMessage = findViewById(R.id.txtMessage);
        //SSID
        TextView txtboxSSID = findViewById(R.id.txtboxSSID);
        int ssid = Integer.parseInt(txtboxSSID.getText().toString());
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

        //----------
        //Email information;
        String courses = englishCourse + '\n' + mathClass + '\n' + scienceClass + '\n' + socialStudies + '\n' + artClass + '\n'
                + elective1 + '\n' + elective2;

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        String shareBody = courses;
        String shareSub = " ";
        shareIntent.putExtra(Intent.EXTRA_SUBJECT,shareBody);
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(shareIntent, "Share using"));

    }

    public void onBtnClick(View view){
        TextView txtMessage = findViewById(R.id.txtMessage);
        //SSID
        TextView txtboxSSID = findViewById(R.id.txtboxSSID);
        int ssid = Integer.parseInt(txtboxSSID.getText().toString());
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

        //----------
        //Email information;
        String courses = englishCourse + '\n' + mathClass + '\n' + scienceClass + '\n' + socialStudies + '\n' + artClass + '\n'
                + elective1 + '\n' + elective2;
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{});
        email.putExtra(Intent.EXTRA_SUBJECT, ssid + "Courses");
        email.putExtra(Intent.EXTRA_TEXT, courses);

        //need this to prompts email client only
        email.setType("message/rfc822");

        startActivity(Intent.createChooser(email, "Choose an Email client :"));

    }


}