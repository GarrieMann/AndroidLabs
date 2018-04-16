package com.example.garriemann.androidlabs;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class message_details extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_details);
        String message = getIntent().getExtras().getString("chatMsg");
        int id = getIntent().getExtras().getInt("Id");
        MessageFragment fragment = new MessageFragment();
        Bundle bundle = new Bundle();
        bundle.putString("chatMsg", message);
        bundle.putInt("Id",id);
        //bundle.putLong("dbId",id);
        fragment.setArguments(bundle);
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_frame, fragment);
        ft.commit();
    }
}