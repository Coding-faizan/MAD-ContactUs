package com.example.contactus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ContactUs extends AppCompatActivity {

    private ImageView backButtonImageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_contact_us);

        backButtonImageview = (ImageView) findViewById(R.id.back);
        backButtonImageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToMainActivity();
            }
        });
    }

    public void backToMainActivity(){
        Intent intent = new Intent(ContactUs.this,MainActivity.class);
        startActivity(intent);
    }
}