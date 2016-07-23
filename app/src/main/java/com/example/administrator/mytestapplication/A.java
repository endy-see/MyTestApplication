package com.example.administrator.mytestapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class A extends AppCompatActivity {
    private String TAG = "A";
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(A.this, B.class));
//                finish();
            }
        });
        Log.e(TAG, "-->> onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "-->> onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "-->> onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "-->> onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "-->> onPause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG, "-->> onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "-->> onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "-->> onDestroy");
    }

}
