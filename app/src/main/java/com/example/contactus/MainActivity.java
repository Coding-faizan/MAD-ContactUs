package com.example.contactus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button contactUsButton,githubButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactUsButton = (Button) findViewById(R.id.ContactUs);
        contactUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openContactActivity();
            }
        });

        githubButton = findViewById(R.id.github);
        githubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://github.com/Coding-faizan/ContactUs"));
                startActivity(intent);
            }
        });
    }

    public void openContactActivity(){
        Intent intent = new Intent(MainActivity.this,ContactUs.class);
        startActivity(intent);
    }
}