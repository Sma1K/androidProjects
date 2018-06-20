package com.example.smaik.secondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnMove = findViewById(R.id.ma_move_btn);
        btnMove.setOnClickListener(view->{
            Log.d("MainActivity", "clicked btn");
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });
//        btnMove.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(getApplicationContext(), "First Page", Toast.LENGTH_SHORT);
        toast.show();
    }
    //    public void onClick(View v)
//    {
//        switch (v.getId())
//        {
//            case R.id.ma_move_btn:
//                Log.d("myLogs", "btnClicked");
//        }
//    }
}
