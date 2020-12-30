package com.steven.androidactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * @author: zhoufan
 * @date: 2020/12/26 12:21
 * @content: Activity的相关知识点
 *           （1）Activity的生命周期
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "StevenActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"--- MainActivity --- onCreate ---");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"--- MainActivity --- onStart ---");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"--- MainActivity --- onResume ---");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"--- MainActivity --- onRestart ---");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"--- MainActivity --- onPause ---");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"--- MainActivity --- onStop ---");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"--- MainActivity --- onDestroy ---");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(TAG,"--- MainActivity --- onNewIntent ---");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"--- MainActivity --- onRestoreInstanceState ---");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"--- MainActivity --- onSaveInstanceState ---");
    }

    /**
     * 跳转到SecondActivity
     * @param view Butter按钮
     */
    public void enterSecondActivity(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
