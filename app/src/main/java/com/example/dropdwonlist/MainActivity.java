package com.example.dropdwonlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    Spinner spinner, childSpinner;
    String[] mainList = {"Maharashtra", "Karnataka","Uttar Pradesh", "Gujarat","Punjab","Uttarakhand"};
    String[][] subLists = {
            {"Pune", "Aurangabad", "Nagpur","Kolhapur","Satara"},
            {"Bidar", "Bengaluru Urban","Belagavi"},
            {"Lucknow", "Kanpur Nagar", "Mathura", "Allahabad"},
            {"Ahmedabad","Anand","Vadodara"},
            {"Patiala","Ludhiana","Jalandhar"},
            {"Dehradun","Pithoragarh","Almora","Haridwar"}};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner1);
        childSpinner = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> mainAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, mainList);
        mainAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(mainAdapter);

        ArrayAdapter<String> subAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new ArrayList<>());
        subAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        childSpinner.setAdapter(subAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                String value = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
                subAdapter.clear();
                subAdapter.addAll(subLists[position]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                subAdapter.clear();
            }
        });


    }
}




