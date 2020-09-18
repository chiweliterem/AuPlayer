package com.app.princesoft.auplayer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MyCollections extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_collections);

        mTextView = (TextView) findViewById(R.id.text);


    }
}