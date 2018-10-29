package com.soanlv.btvn.Day4bai3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.soanlv.btvn.Day4Activity;
import com.soanlv.btvn.R;

public class GameOverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
    }

    public void quaylai(View view) {
        Intent intent = new Intent(GameOverActivity.this, Day4Activity.class);
        startActivity(intent);
    }
}
