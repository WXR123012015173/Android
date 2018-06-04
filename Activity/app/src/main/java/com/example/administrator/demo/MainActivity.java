package com.example.administrator.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
        @Override
        protected void onStart() {
            super.onStart();
            // The activity is about to become visible.
            Log.d("1", "onStart: ");
        }
        @Override
        protected void onResume() {
            super.onResume();
            // The activity has become visible (it is now "resumed").
            Log.d("2", "onResume: ");
        }
        @Override
        protected void onPause() {
            super.onPause();
            // Another activity is taking focus (this activity is about to be "paused").
            Log.d("3", "onPause: ");
        }
        @Override
        protected void onStop() {
            super.onStop();
            // The activity is no longer visible (it is now "stopped")
            Log.d("4", "onStop: ");
        }
        @Override
        protected void onDestroy() {
            super.onDestroy();
            // The activity is about to be destroyed.
            Log.d("5", "onDestroy: ");
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
