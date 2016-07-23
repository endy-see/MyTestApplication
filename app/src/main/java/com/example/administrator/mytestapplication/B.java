package com.example.administrator.mytestapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2016/7/23.
 */
public class B extends Activity{
    private String TAG = "B";
    private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(B.this, A.class));
                finish();
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
