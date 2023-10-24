package com.trananhtin.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Sub_Activity.class);
                startActivity(i);
            }
        });
    }

//    public void ChuyenManHinh(View v){
//        Intent iManHinhKhac=new Intent(this,Sub_Activity.class);
//        startActivity(iManHinhKhac);
//    }
//
//

}