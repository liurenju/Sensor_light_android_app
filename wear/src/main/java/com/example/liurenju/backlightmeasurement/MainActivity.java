package com.example.liurenju.backlightmeasurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView = (TextView) stub.findViewById(R.id.text);
            }
        });
    }

    public void red(View view){
        startActivity(new Intent(getApplicationContext(), Red.class));
    }

    public void green(View view){
        startActivity(new Intent(getApplicationContext(), Green.class));
    }

    public void blue(View view){
        startActivity(new Intent(getApplicationContext(), Blue.class));
    }

    public void black(View view){
        startActivity(new Intent(getApplicationContext(), Black.class));
    }

    public void white(View view){
        startActivity(new Intent(getApplicationContext(), White.class));
    }
}
