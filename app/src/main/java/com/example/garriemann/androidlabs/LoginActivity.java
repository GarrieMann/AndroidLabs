package com.example.garriemann.androidlabs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {

    protected static final String ACTIVITY_NAME = "LoginActivity";

    private Button mButton3;
    private EditText emailfield;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.i(ACTIVITY_NAME, "In onCreate()");

        mButton3 = (Button) findViewById(R.id.button3);
        emailfield = (EditText) findViewById(R.id.editText);

            final SharedPreferences sharedPreferences = getSharedPreferences("login", Context.MODE_PRIVATE);
            emailfield.setText(sharedPreferences.getString("DefaultEmail", "email@domain.com"));
            mButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("DefaultEmail", emailfield.getText().toString());
                    editor.commit();
                    Intent intent = new Intent(LoginActivity.this, ActivityStart.class);
                    startActivity(intent);

                }
            });

        }

        @Override
        protected void onStart() {
            super.onStart();
            Log.i(ACTIVITY_NAME, "In onStart()");

        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.i(ACTIVITY_NAME,"In onResume()");

        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.i(ACTIVITY_NAME,"In onStop()");

        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.i(ACTIVITY_NAME,"In onDestroy()");

        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.i(ACTIVITY_NAME,"In onPause()");

        }
    }