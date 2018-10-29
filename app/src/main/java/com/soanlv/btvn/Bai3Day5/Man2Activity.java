package com.soanlv.btvn.Bai3Day5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.soanlv.btvn.R;

public class Man2Activity extends AppCompatActivity {
    TextView tvphone;
EditText edfristname,lastname,birthday,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man2d5);
        edfristname=findViewById(R.id.fname);
        lastname=findViewById(R.id.lname);
        birthday=findViewById(R.id.brith);
        email=findViewById(R.id.edem);
        tvphone = findViewById(R.id.phonenb2);
        Intent in = getIntent();
        Bundle b = in.getExtras();
        String phone = b.getString("phone");
        tvphone.setText(phone);
    }

    public void btncontinute(View view) {
String friname=edfristname.getText().toString();
String lastnamea=lastname.getText().toString();
String brith=birthday.getText().toString();
String emails=email.getText().toString();
if (friname.equals("")||lastnamea.equals("")||brith.equals("")||emails.equals("")){
    Toast.makeText(Man2Activity.this,"Nhập đủ thông tin ",Toast.LENGTH_SHORT).show();
}else {

}
    }
}
