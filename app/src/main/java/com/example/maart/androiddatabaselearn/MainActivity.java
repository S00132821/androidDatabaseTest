package com.example.maart.androiddatabaselearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    public static final String TAG = "ANDROIDLEARN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate() method ");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause() method ");
    }

    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop() method ");
    }

    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy() method ");
    }

    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart() method ");
    }

    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume() method ");
    }
}
