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
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.List;

public class ContactUs extends AppCompatActivity {

    private ImageView backButtonImageview;

    private EditText titleText,descriptionText;
    private Button sendButton;

    private LinearLayout whatsappButton;
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

        sendButton = findViewById(R.id.button);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String to="abeerkhurram123@gmail.com";
                EditText edt1=(EditText) findViewById(R.id.title);
                EditText edt2=(EditText) findViewById(R.id.description);
                Intent email = new Intent(Intent.ACTION_SEND);
                String subject=edt1.getText().toString();
                String message=edt2.getText().toString();
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
                email.putExtra(Intent.EXTRA_TEXT, message);
                email.setType("message/rfc822");
                startActivity(email);
            }
        });

        whatsappButton = findViewById(R.id.whatsappPkLayout);
        whatsappButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent what = new Intent(Intent.ACTION_VIEW);
                String message = "";
                String number = "tel:+923217865622";
                what.setData(Uri.parse("whatsapp://send?phone=" + number + "&text=" + message));
                startActivity(what);
            }
        });

    }
}