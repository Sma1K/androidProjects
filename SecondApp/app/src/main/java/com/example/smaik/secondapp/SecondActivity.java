package com.example.smaik.secondapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("SecondActivity", "SecondPage is opened");
        Toast toast = Toast.makeText(getApplicationContext(), "Second Page", Toast.LENGTH_SHORT);
        toast.show();
    }
}
