package com.soanlv.btvn.Day4bai2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.soanlv.btvn.R;

public class ResgerActivity extends AppCompatActivity {
    EditText edemail, edpass, edfirstname, edlastname, eddate, edheight, edweight;
    TextView tverroremail, tverrorpass, tverrorfirstname, tverrorlastname, tverrorheight, tverrorDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resger);
        initview();

    }

    private void initview() {
        edemail = findViewById(R.id.emailaddress);
        edpass = findViewById(R.id.edpassword);
        edfirstname = findViewById(R.id.FirstName);
        edlastname = findViewById(R.id.edLassName);
        eddate = findViewById(R.id.eddate);
        edheight = findViewById(R.id.edHeight);
        edweight = findViewById(R.id.edweight);
        tverroremail = findViewById(R.id.erroremail);
        tverrorpass = findViewById(R.id.errorpass);
        tverrorfirstname = findViewById(R.id.errorname);
        tverrorlastname = findViewById(R.id.errorlassname);
        tverrorheight = findViewById(R.id.errorheight);
        tverrorDate = findViewById(R.id.errorDate);
    }

    public void back(View view) {
    }

    public void register(View view) {
        check();
    }

    public void check() {
        String email = edemail.getText().toString();
        String pass = edpass.getText().toString();
        String firstname = edfirstname.getText().toString();
        String lastname = edlastname.getText().toString();
        String date = eddate.getText().toString();
        String height = edheight.getText().toString();
        String weight = edweight.getText().toString();

        if (email.equals("")) {
            tverroremail.setText("Không Được Bỏ trống");
        } else if (pass.equals("")) {
            tverrorpass.setText("Không được bỏ trống");

        } else if (firstname.equals("")) {

            tverrorfirstname.setText("Không được bỏ trống");

        } else if (lastname.equals("")) {

            tverrorlastname.setText("Không được bỏ trống");

        } else if (date.equals("")) {

            tverrorDate.setText("Không được bỏ trống");

        } else if (height.equals("")) {

            tverrorheight.setText("Không được bỏ trống");

        } else if (weight.equals("")) {
            tverrorheight.setText("Không được bỏ trống");
        } else {
            Toast.makeText(ResgerActivity.this, "Đâng Kí Thành Công", Toast.LENGTH_SHORT).show();
            tverroremail.setText("");
            tverrorpass.setText("");
            tverrorfirstname.setText("");
            tverrorlastname.setText("");
            tverrorDate.setText("");
            tverrorheight.setText("");
        }
    }
}
