package com.reginazye.jt2017hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private static Map<String, String> CountryCode = new HashMap<>();
    static {
        CountryCode.put("GBR", "United Kingdom");
        CountryCode.put("IDN", "Indonesia");
        CountryCode.put("IND", "India");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button)findViewById(R.id.lookupButton)).setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                lookup();
            }
        });
    }

    public void lookup(){
        String code = ((EditText)findViewById(R.id.editText)).getText().toString().toUpperCase();
        String country;
        if (CountryCode.containsKey(code)){
            country = CountryCode.get(code);
        } else {
            country = code;
        }
        ((TextView)findViewById(R.id.countryCode)).setText(country);
    }
}
