package com.trananhtin.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sub_Activity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        button = findViewById(R.id.btnQuayLai);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sub_Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
//    public void QuayVe(View v){
//        Intent manHinhChinh=new Intent(this, MainActivity.class);
//        startActivity(manHinhChinh);
//    }
}

