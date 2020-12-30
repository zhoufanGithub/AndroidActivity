package com.steven.androidactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;

/**
 * @author: zhoufan
 * @date:  2020/12/26 13:22
 * @content: 
*/
public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "StevenActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i(TAG,"--- SecondActivity --- onCreate ---");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"--- SecondActivity --- onStart ---");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"--- SecondActivity --- onResume ---");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"--- SecondActivity --- onRestart ---");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"--- SecondActivity --- onPause ---");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"--- SecondActivity --- onStop ---");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"--- SecondActivity --- onDestroy ---");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(TAG,"--- SecondActivity --- onNewIntent ---");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"--- SecondActivity --- onRestoreInstanceState ---");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"--- SecondActivity --- onSaveInstanceState ---");
    }

    /**
     * 跳转到ThirdActivity
     * @param view Butter按钮
     */
    public void enterThirdActivity(View view) {
        Intent intent = new Intent(this,ThreeActivity.class);
        startActivity(intent);
    }
}
