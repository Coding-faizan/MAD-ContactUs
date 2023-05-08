package com.example.contactus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class ContactUs extends AppCompatActivity {

    private Button backButton;
    private ImageView backButtonImageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_contact_us);

        backButtonImageview = (ImageView) findViewById(R.id.back);
    }
}