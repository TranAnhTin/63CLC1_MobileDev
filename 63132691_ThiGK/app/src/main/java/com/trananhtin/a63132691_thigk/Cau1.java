package com.trananhtin.a63132691_thigk;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cau1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau1);
        EditText editText_a=findViewById(R.id.a);
        EditText editText_b=findViewById(R.id.b);
        Button cong=findViewById(R.id.btnCong);
        Button tru=findViewById(R.id.btnTru);
        Button nhan =findViewById(R.id.btnNha);
        Button chia=findViewById(R.id.btnChia);
        TextView textview=findViewById(R.id.Result);
        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float a=Float.parseFloat(String.valueOf(editText_a.getText()));
                Float b=Float.parseFloat(String.valueOf(editText_b.getText()));
                float kq;
                kq=a+b;
                textview.setText("Your Result\n"+String.valueOf(kq));
            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float a=Float.parseFloat(String.valueOf(editText_a.getText()));
                Float b=Float.parseFloat(String.valueOf(editText_b.getText()));
                float kq;
                kq=a-b;
                textview.setText("Your Result\n"+String.valueOf(kq));
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float a=Float.parseFloat(String.valueOf(editText_a.getText()));
                Float b=Float.parseFloat(String.valueOf(editText_b.getText()));
                float kq;
                kq=a*b;
                textview.setText("Your Result\n"+String.valueOf(kq));
            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float a=Float.parseFloat(String.valueOf(editText_a.getText()));
                Float b=Float.parseFloat(String.valueOf(editText_b.getText()));
                float kq;
                kq=a/b;
                textview.setText("Your Result\n"+String.valueOf(kq));
            }
        });
    }

}