package com.example.okhttp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.tv_show);
        getExecute();
    }
    private void getExecute(){
        new Thread(){
            @Override
            public void run() {

                final String result = OkHttpUtils.get("http://www.tngou.net/api/cook/list");
                tv.post(new Runnable() {
                    @Override
                    public void run() {
                        tv.setText(result);
                    }
                });
            }
        }.start();
    }



}
