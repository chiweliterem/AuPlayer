package com.app.princesoft.auplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //edited by Prince
        handler = new Handler();

        handler.postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this, MyCollections.class);
                startActivity(intent);
                finish();
            }
        },5000);
    }
}