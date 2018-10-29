package com.soanlv.btvn.Bai1Day5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.soanlv.btvn.R;

public class Bai1D5Activity extends AppCompatActivity {
    EditText edphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1_d5);
        edphone = findViewById(R.id.edphone);
    }

    public void btncall(View view) {
        String number = edphone.getText().toString();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + number));
        startActivity(intent);
    }

    public void btncamera(View view) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }

    public void btncontact(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("content://contacts/people/"));

        startActivity(intent);
    }

    public void btnbrowser(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com.vn"));
        startActivity(i);
    }

    public void btncalllog(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("content://call_log/calls"));

        startActivity(intent);
    }

    public void btngallery(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivity(intent);
    }

    public void btndialpad(View view) {
    }
}
