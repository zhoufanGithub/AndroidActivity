package com.steven.androidactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

/**
 * @author: zhoufan
 * @date:  2020/12/26 13:21
*/
public class ThreeActivity extends AppCompatActivity {

    private static final String TAG = "StevenActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        Log.i(TAG,"--- ThreeActivity --- onCreate ---");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"--- ThreeActivity --- onStart ---");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"--- ThreeActivity --- onResume ---");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"--- ThreeActivity --- onRestart ---");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"--- ThreeActivity --- onPause ---");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"--- ThreeActivity --- onStop ---");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"--- ThreeActivity --- onDestroy ---");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(TAG,"--- ThreeActivity --- onNewIntent ---");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"--- ThreeActivity --- onRestoreInstanceState ---");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.i(TAG,"--- ThreeActivity --- onSaveInstanceState ---");
    }
}
