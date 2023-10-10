package com.trananhtin.bmi_cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText_WE=findViewById(R.id.Weight);
        EditText editText_HE=findViewById(R.id.Height);
        Button button=findViewById(R.id.btnTinh);
        TextView textview=findViewById(R.id.Result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float WE=Float.parseFloat(String.valueOf(editText_WE.getText()))/100;
                Float HE=Float.parseFloat(String.valueOf(editText_HE.getText()));
                float kq;
                kq=WE/(HE*HE);
                textview.setText("Your Result\n"+String.valueOf(kq));
            }
        });
    }

}