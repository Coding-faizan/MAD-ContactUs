package com.example.contactus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.List;

public class ContactUs extends AppCompatActivity {

    private ImageView backButtonImageview;

    private EditText titleText,descriptionText;
    private Button sendButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_contact_us);

        backButtonImageview = (ImageView) findViewById(R.id.back);
        backButtonImageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        titleText = findViewById(R.id.title);
        descriptionText = findViewById(R.id.description);
        sendButton = findViewById(R.id.button);


    }
}