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
import android.widget.TextView;

public class LoginActivity extends Activity {

  protected static final String ACTIVITY_NAME = "Login Activity";

   EditText editLogin;
    Button lgnButton = (Button) findViewById(R.id.loginButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.i(ACTIVITY_NAME,"In onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editLogin = findViewById(R.id.email);

        final SharedPreferences StoredEmails = getSharedPreferences("login", Context.MODE_PRIVATE);
        editLogin.setText(StoredEmails.getString("DefaultEmail", "email@domain.com"));
        lgnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = StoredEmails.edit();
                editor.putString("DefaultEmail", editLogin.getText().toString());
                editor.commit();

                Intent intent = new Intent(LoginActivity.this, StartActivity.class);
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