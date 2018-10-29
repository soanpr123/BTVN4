package com.soanlv.btvn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DAY4(View view) {
        Intent intent=new Intent(MainActivity.this,Day4Activity.class);
        startActivity(intent);
    }

    public void DAY5(View view) {
        Intent intent=new Intent(MainActivity.this,Day5Activity.class);
        startActivity(intent);
    }
}
