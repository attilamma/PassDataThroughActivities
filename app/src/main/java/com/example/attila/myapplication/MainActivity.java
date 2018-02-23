package com.example.attila.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.text.InputType;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                //Switch from MainActivity to SecondActivity
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                //Save text input as a string
                EditText edText = (EditText) findViewById(R.id.editText);
                edText.setInputType(InputType.TYPE_CLASS_TEXT);
                String passedText = edText.getText().toString();
                //pass data, using the key "android"
                intent.putExtra("android",passedText);
            startActivity(intent);
        }
        });
    }
}
