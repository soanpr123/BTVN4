package com.soanlv.btvn.Bai3Day5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.soanlv.btvn.R;

public class Bai3D5Activity extends AppCompatActivity {
EditText rdphone,edpasss,edconpasss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3_d5);
        rdphone=findViewById(R.id.edphonenumberd5);
        edconpasss=findViewById(R.id.edconfirm5);
        edpasss=findViewById(R.id.edpasswordd5);
    }

    public void btnsignup(View view) {
        String phone=rdphone.getText().toString();
        String pass=edpasss.getText().toString();
        String conpass=edconpasss.getText().toString();
        if (phone.equals("")||pass.equals("")||conpass.equals("")){
            Toast.makeText(Bai3D5Activity.this,"Nhập đủ thông tin ",Toast.LENGTH_SHORT).show();
        }else if (pass.equals(conpass)){
            Intent intent=new Intent(Bai3D5Activity.this,Man2Activity.class);
            Bundle bundle=new Bundle();
            bundle.putString("phone",phone);
            intent.putExtras(bundle);
            startActivity(intent);
        }else {
            Toast.makeText(Bai3D5Activity.this," mật khảu không khớp ",Toast.LENGTH_SHORT).show();
        }




    }
}
