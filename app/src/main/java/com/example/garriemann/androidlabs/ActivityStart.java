package com.example.garriemann.androidlabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityStart extends Activity {

    protected static final String NAME = "ActivityStart";
    Button btn_login = (Button) findViewById(R.id.button3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Log.i(NAME,"In onCreate()");
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (ActivityStart.this,ListItemsActivity.class);
                startActivityForResult(intent,5);
            }
        });
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(NAME,"In onResume()");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(NAME,"In onStart()");

    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(NAME,"In onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(NAME,"In onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(NAME,"In onDestroy()");
    }

    protected void onActivityResult(int requestCode,int responseCode,Intent data){
        Log.i(NAME, "Returned to StartActivity.onActivityResult -outside if");
        if(requestCode==5 && responseCode == RESULT_OK) {
            Log.i(NAME, "Returned to StartActivity.onActivityResult -in request code ==  5");
        }

    }
}