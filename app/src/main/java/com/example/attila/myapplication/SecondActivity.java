package com.example.attila.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Receive data in a String txt from MainActivity by using the key "android"
        Intent intent = getIntent();
        String txt = intent.getStringExtra("android");
        //Received data will be displayed in textView
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(txt);
    }
}
