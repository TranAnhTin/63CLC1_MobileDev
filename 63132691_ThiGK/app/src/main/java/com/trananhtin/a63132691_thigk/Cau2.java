package com.trananhtin.a63132691_thigk;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Cau2  extends AppCompatActivity {

    ArrayList<String> lsBH = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau2);
        getWidget();
        lsBH.add("Baby");
        lsBH.add("Animal");
        lsBH.add("Suagar");
        lsBH.add("Girl Like You");
        ArrayAdapter<String> adapterBT=new ArrayAdapter<String>
                (this,android.R.layout.simple_dropdown_item_1line,lsBH);
        listViewBH.setAdapter(adapterBT);
        listViewBH.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String mucChon=lsBH.get(i).toString();
                String chuoithongbao = "You selected"+ mucChon;
                Toast.makeText(Cau2.this, chuoithongbao, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getWidget(){
        listViewBH=findViewById(R.id.lsvBH);
    }
    ListView listViewBH;
}
