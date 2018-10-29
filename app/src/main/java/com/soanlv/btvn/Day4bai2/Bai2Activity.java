package com.soanlv.btvn.Day4bai2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.soanlv.btvn.R;

public class Bai2Activity extends AppCompatActivity {
    TextView sign;
    EditText edemail, edpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        sign = findViewById(R.id.sign);
        edemail = findViewById(R.id.edemail);
        edpass = findViewById(R.id.edpass);
    }


    public void Login(View view) {
        String email = edemail.getText().toString();
        String pass = edpass.getText().toString();
        if (email.equals("") || pass.equals("")) {
            Toast.makeText(Bai2Activity.this, "Bạn Phải Nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();

        } else if (email.equals("t3h") && pass.equals("t3h")){
            Toast.makeText(Bai2Activity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(Bai2Activity.this, "Đăng nhập Không thành  công", Toast.LENGTH_SHORT).show();
    }

    public void sign(View view) {
        Intent intent=new Intent(Bai2Activity.this,ResgerActivity.class);
        startActivity(intent);
    }
}
