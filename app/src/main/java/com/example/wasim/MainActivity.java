package com.example.wasim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static List<TrueQ>  ALLQ1= new ArrayList<TrueQ>();
    public static  int cont =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ALLQ1.add(new TrueQ("Your Android lab starts at 2:00PM on Saturdays every week?", "True",1));
        ALLQ1.add(new TrueQ("Android Studio is a light software?", "False",2));
        ALLQ1.add(new TrueQ("In this lab, We are using Kotlin for developing Android apps?", "False",3));
        ALLQ1.add(new TrueQ("This is your first todo in this lab?", "True",4));

        Button TrueAC = (Button) findViewById(R.id.button_True);


        TrueAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,True_False.class);
                MainActivity.this.startActivity(intent);
                finish();
            }
        });

    }



}