package com.trananhtin.autocompleteexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String>COUNTRIES = new ArrayList<String>();
    AutoCompleteTextView auTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
        COUNTRIES.add("Viet Nam");
        COUNTRIES.add("England");
        COUNTRIES.add("USA");
        COUNTRIES.add("Albania");
        COUNTRIES.add("Australia");
        ArrayAdapter<String>adapterCountries = new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,COUNTRIES);
    }
    public void getWidget(){
        auTV=findViewById(R.id.autoCompleteCountries);

    }
}