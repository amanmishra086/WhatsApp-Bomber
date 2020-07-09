package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText messege;
    EditText number;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     messege=findViewById(R.id.messege);
    number=findViewById(R.id.number);
     send=findViewById(R.id.send);

    send.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            Intent waIntent = new Intent(Intent.ACTION_SEND);
            String text = messege.getText().toString();

            String num=number.getText().toString();
            int n=Integer.parseInt(num);
            String text1="";

            for(int i=0;i<n;i++)
            {
               text1=text1+text;
               text1=text1+ "\n";
            }
            waIntent.setType("text/plain");

            waIntent.putExtra(Intent.EXTRA_TEXT,text1);
            startActivity(Intent.createChooser(waIntent, "Share with"));

        }
    });

         }




     }

