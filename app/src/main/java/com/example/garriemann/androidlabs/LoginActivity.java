package com.example.garriemann.androidlabs;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class LoginActivity extends Activity {

    protected static final String ACTIVITY_NAME = "ActivityStart";
    private Button mButton3;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.i(ACTIVITY_NAME, "In onCreate()");

        mButton3 = (Button)findViewById(R.id.button3);
        editText = (EditText)findViewById(R.id.editText);


        final SharedPreferences email = getSharedPreferences("email_file",MODE_PRIVATE);
        email.getString("DefaultEmail","email@domain.com");

        mButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = email.edit();
                editor.putString("Email Address",editText.getText().toString());
                editor.apply();
            }
        });
    }

    public void onResume(){
        super.onResume();
        Log.i(ACTIVITY_NAME, "In onResume()");
    }

    public void onStart(){
        super.onStart();
        Log.i(ACTIVITY_NAME, "In onStart()");
    }

    public void onPause(){
        super.onPause();
        Log.i(ACTIVITY_NAME, "In onPause()");
    }

    public void onStop(){
        super.onStop();
        Log.i(ACTIVITY_NAME, "In onStop()");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.i(ACTIVITY_NAME, "In onDestroy()");
    }
}
