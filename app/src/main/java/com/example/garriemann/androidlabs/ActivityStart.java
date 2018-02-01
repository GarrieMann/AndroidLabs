package com.example.garriemann.androidlabs;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityStart extends Activity {

    protected static final String NAME = "ActivityStart";
   Button btn_login = (Button)findViewById(R.id.button3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void onResume(){
        super.onResume();
        Log.i(NAME, "In onResume()");
    }

    public void onStart(){
        super.onStart();
        Log.i(NAME, "In onStart()");
    }

    public void onPause(){
        super.onPause();
        Log.i(NAME, "In onPause()");
    }

    public void onStop(){
        super.onStop();
        Log.i(NAME, "In onStop()");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.i(NAME, "In onDestroy()");
    }

}
