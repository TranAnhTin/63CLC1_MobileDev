package com.trananhtin.a63132691_thigk;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Cau3 extends AppCompatActivity {
    ArrayList<Song> dsBH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau3);
        dsBH=new ArrayList<Song>();
        Song bh1=new Song("Baby","Justin Bieber",80);
        Song bh2=new Song("Animal","Maron5",68);
        dsBH.add(bh1);
        dsBH.add(bh2);
        ListView lvBH=findViewById(R.id.ListViewBH);
        SongAdaper adaper;
        adaper=new SongAdaper(dsBH,this);
        lvBH.setAdapter(adaper);
        lvBH.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> songAdaper, View view, int i, long id) {
                String mucChon=lvBH.toString();
                String chuoithongbao = "You selected"+ mucChon;
                Toast.makeText(Cau3.this, chuoithongbao, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
