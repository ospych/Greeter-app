package com.example.greeter;

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
    }

    public void greet(View view){
        EditText editText = findViewById(R.id.enter_name);
        String name = editText.getText().toString();

        String message = "Hello, " + name;
        displayGreet(message);
    }

    public void reset(View view){
        EditText editText = findViewById(R.id.enter_name);
        editText.setText("");

        String message = "";
        displayGreet(message);
    }

    private void displayGreet(String message){
        TextView textView = (TextView) findViewById(R.id.greet_text);
        textView.setText(message);
    }
}