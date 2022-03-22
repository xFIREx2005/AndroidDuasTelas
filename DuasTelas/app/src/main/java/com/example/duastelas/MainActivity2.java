package com.example.duastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    Intent it2 = getIntent();
    String msg = it2.getStringExtra(MainActivity.SENDMSG);
    TextView txt = (TextView).findViewById(R.id.textReceive);
    txt.setText(msg);
}