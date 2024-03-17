package com.example.wasim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        ScrollView scrollView=(ScrollView) findViewById(R.id.scrol);
        LinearLayout myLinearLayout = (LinearLayout) findViewById(R.id.show);
        int count =0;
       for(TrueQ objCustomer : MainActivity.ALLQ1) {
            TextView txt = new TextView(this) ;
            txt.setTextAppearance(com.google.android.material.R.style.TextAppearance_Design_HelperText);
            txt.setText(objCustomer.toString());
            myLinearLayout.addView(txt);
            if(objCustomer.isHisAnswer())
                count++;

        }
    TextView result = (TextView)findViewById(R.id.finall);
     result.setText("your result "+count+"/"+MainActivity.ALLQ1.size());

    }
}