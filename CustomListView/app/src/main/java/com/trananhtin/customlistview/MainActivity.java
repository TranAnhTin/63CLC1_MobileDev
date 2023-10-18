package com.trananhtin.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country> dsQG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dsQG=new ArrayList<Country>();
        Country qg1=new Country("VietNam","vn",80);
        Country qg2=new Country("United State","us",68);
        dsQG.add(qg1);
        dsQG.add(qg2);
        ListView lvQG=findViewById(R.id.listViewNation);
        CountryArrayAdaper adaper;
        adaper=new CountryArrayAdaper(dsQG,this);
        lvQG.setAdapter(adaper);

    }
}