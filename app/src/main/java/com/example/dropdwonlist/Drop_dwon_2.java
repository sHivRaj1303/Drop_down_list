package com.example.dropdwonlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class Drop_dwon_2 extends AppCompatActivity {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_dwon2);
        spinner=(Spinner)findViewById(R.id.p_language);
    }
}