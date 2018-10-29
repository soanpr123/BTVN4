package com.soanlv.btvn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.soanlv.btvn.Bai1Day5.Bai1D5Activity;
import com.soanlv.btvn.Bai2Day5.Bai2Activity;
import com.soanlv.btvn.Bai3Day5.Bai3D5Activity;

public class Day5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day5);
    }

    public void bai1(View view) {
        Intent intent=new Intent(Day5Activity.this,Bai1D5Activity.class);
        startActivity(intent);
    }

    public void bai2(View view) {
        Intent intent=new Intent(Day5Activity.this,Bai2Activity.class);
        startActivity(intent);
    }

    public void bai3(View view) {
        Intent intent=new Intent(Day5Activity.this,Bai3D5Activity.class);
        startActivity(intent);
    }
}
