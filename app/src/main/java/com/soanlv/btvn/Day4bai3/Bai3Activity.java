package com.soanlv.btvn.Day4bai3;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.soanlv.btvn.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Bai3Activity extends AppCompatActivity {
    TextView tvcauhoi;
    TextView tvStt;
    TextView tvdapan1;
    TextView tvdapan2;
    Button btnDapanA, btnDapanB;
    ArrayList<ArrayList<String>> dscauhoi = new ArrayList<>();
    private String rightAnswer;
    //    private int rightAnswerCount = 0;
    private int quizCount = 1;
    static final private int QUIZ_COUNT = 6;
    String quizData[][] = {
            {"1+1=?", "2", "1", "2"},
            {"1+2=?", "3", "3", "2"},
            {"1+3=?", "4", "3", "4"},
            {"1+4=?", "5", "6", "5"},
            {"1+5=?", "6", "6", "7"},
            {"1+6=7", "7", "4", "7"}

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        tvcauhoi = findViewById(R.id.tvcauhoi);
        tvdapan1 = findViewById(R.id.tvdapan1);
        tvdapan2 = findViewById(R.id.tvdapan2);
        btnDapanA = findViewById(R.id.btndapanA);
        btnDapanB = findViewById(R.id.btndapanB);

        for (int i = 0; i < quizData.length; i++) {
            // Prepare array.
            ArrayList<String> tmpArray = new ArrayList<>();
            tmpArray.add(quizData[i][0]);  // Country
            tmpArray.add(quizData[i][1]);  // Right Answer
            tmpArray.add(quizData[i][2]);  // Choice1
            tmpArray.add(quizData[i][3]);  // Choice2

            // Add tmpArray to quizArray.
            dscauhoi.add(tmpArray);
        }
        showNextQuiz();

        btnDapanA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String tvdapan11 = tvdapan1.getText().toString();
                final String tvdapan12 = tvdapan2.getText().toString();
                if (tvdapan11.equals(rightAnswer)) {
                    Toast.makeText(Bai3Activity.this, "Đúng Rồi", Toast.LENGTH_SHORT).show();
//            rightAnswerCount++;
                    quizCount++;
                    showdialog();
                    showNextQuiz();

                } else {
                    Toast.makeText(Bai3Activity.this, "sai Rồi", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Bai3Activity.this, GameOverActivity.class);
                    startActivity(intent);
                }
            }
        });
        btnDapanB.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                final String tvdapan11 = tvdapan1.getText().toString();
                final String tvdapan12 = tvdapan2.getText().toString();
                if (tvdapan12.equals(rightAnswer)) {
                    Toast.makeText(Bai3Activity.this, "Đúng Rồi", Toast.LENGTH_SHORT).show();
//                    rightAnswerCount++;
                    quizCount++;
                    showdialog();
                    showNextQuiz();

                } else {
                    Toast.makeText(Bai3Activity.this, "sai Rồi", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Bai3Activity.this, GameOverActivity.class);
                    startActivity(intent);
                }
            }
        });

    }

    private void showNextQuiz() {
//        cập nhật số câu hỏi
//       tvStt.setText("Câu :" +quizCount);
        Random random = new Random();
        int randomNum = random.nextInt(dscauhoi.size());
        ArrayList<String> quiz = dscauhoi.get(randomNum);
//         Đặt câu hỏi và trả lời đúng.
//        // Định dạng mảng: {"câu hỏi", "Câu trả lời đúng", "Lựa chọn 1", "Lựa chọn 2"}
        tvcauhoi.setText(quiz.get(0));
        rightAnswer = quiz.get(1);
        quiz.remove(0);
        Collections.shuffle(quiz);
//        đặt lữa chon
        tvdapan1.setText(quiz.get(0));
        tvdapan2.setText(quiz.get(1));
        dscauhoi.remove(randomNum);
    }

    public void showdialog() {
        if (quizCount == QUIZ_COUNT) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setMessage("Bạn đã trả lời đúng bạn có muốn tiếp tục không ");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int which) {
                    Return();
                }

                private void Return() {
                    Intent intent = new Intent(getApplicationContext(), Bai3Activity.class);
                    startActivity(intent);
                }
            });
            builder.setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.setCancelable(false);
            builder.show();
        }
    }
}


