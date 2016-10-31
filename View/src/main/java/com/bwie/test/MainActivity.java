package com.bwie.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bwie.test.View.RubblerView;

public class MainActivity extends AppCompatActivity {

    private RubblerView mRubblerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRubblerView = (RubblerView) findViewById(R.id.rubbler);
        mRubblerView.beginRubbler(40,
                1f , "一等奖");
    }
}
