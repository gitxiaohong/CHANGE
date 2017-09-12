package com.example.lenovo.change;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("TAG","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("TAG","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("TAG","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("TAG","onRestart");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.e("TAG","onSaveInstanceState");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TAG","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("TAG","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TAG","onDestroy");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("TAG","onRestoreInstanceState");
    }
}
