package com.soanlv.btvn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.soanlv.btvn.Day4Bai1.Bai1Activity;
import com.soanlv.btvn.Day4bai2.Bai2Activity;
import com.soanlv.btvn.Day4bai3.Bai3Activity;

public class Day4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day4_activity);
    }

    public void bai1(View view) {
        Intent intent=new Intent(Day4Activity.this,Bai1Activity.class);
        startActivity(intent);
    }

    public void bai2(View view) {
        Intent intent=new Intent(Day4Activity.this,Bai2Activity.class);
        startActivity(intent);
    }

    public void bai3(View view) {
        Intent intent=new Intent(Day4Activity.this,Bai3Activity.class);
        startActivity(intent);
    }
}
