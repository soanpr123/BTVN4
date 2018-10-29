package com.soanlv.btvn.Day4Bai1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.soanlv.btvn.R;

public class Bai1Activity extends AppCompatActivity {
    EditText edsoa, edsob;
    TextView tvkq;
    String ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        edsoa = findViewById(R.id.edSoa);
        edsob = findViewById(R.id.edSob);
        tvkq = findViewById(R.id.tvKetqua);
    }

    public void btncong(View view) {
        try {
            int soa = Integer.parseInt(edsoa.getText().toString());
            int sob = Integer.parseInt(edsob.getText().toString());
            ketqua = soa + sob + "";

            tvkq.setText(ketqua);

        } catch (Exception e) {
            Toast.makeText(Bai1Activity.this, " Bạn Phải Nhập đầy đủ  2 số ", Toast.LENGTH_SHORT).show();
        }

    }

    public void btntru(View view) {
        try {
            int soa = Integer.parseInt(edsoa.getText().toString());
            int sob = Integer.parseInt(edsob.getText().toString());
            ketqua = soa - sob + "";

            tvkq.setText(ketqua);

        } catch (Exception e) {
            Toast.makeText(Bai1Activity.this, " Bạn Phải Nhập đầy đủ  2 số ", Toast.LENGTH_SHORT).show();

        }
    }

    public void btnnhan(View view) {
        try {
            int soa = Integer.parseInt(edsoa.getText().toString());
            int sob = Integer.parseInt(edsob.getText().toString());
            ketqua = soa * sob + "";

            tvkq.setText(ketqua);

        } catch (Exception e) {
            Toast.makeText(Bai1Activity.this, " Bạn Phải Nhập đầy đủ  2 số ", Toast.LENGTH_SHORT).show();

        }
    }

    public void btnchia(View view) {
        try {
            int soa = Integer.parseInt(edsoa.getText().toString());
            int sob = Integer.parseInt(edsob.getText().toString());
            ketqua = 1.0 * soa / sob + "";

            tvkq.setText(ketqua);

        } catch (Exception e) {
            Toast.makeText(Bai1Activity.this, " Bạn Phải Nhập đầy đủ  2 số ", Toast.LENGTH_SHORT).show();

        }
    }
}
