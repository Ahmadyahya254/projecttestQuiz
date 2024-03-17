package com.example.wasim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class True_False extends AppCompatActivity {

    public void check(RadioButton True1,RadioButton False1){
        if(True1.isChecked()){
            if(MainActivity.ALLQ1.get(MainActivity.cont).getAnswer().equalsIgnoreCase("True")){
                MainActivity.ALLQ1.get(MainActivity.cont).setHisAnswer(true);
            }
            else
                MainActivity.ALLQ1.get(MainActivity.cont).setHisAnswer(false);
        }else if(False1.isChecked()){
            if(MainActivity.ALLQ1.get(MainActivity.cont).getAnswer().equalsIgnoreCase("False")){
                MainActivity.ALLQ1.get(MainActivity.cont).setHisAnswer(true);
            }
            else
                MainActivity.ALLQ1.get(MainActivity.cont).setHisAnswer(false);
        }
        MainActivity.cont++;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_false);

        RadioButton True1 = (RadioButton)findViewById(R.id.True);
        RadioButton False1 = (RadioButton)findViewById(R.id.False);
        TextView ShowQ= (TextView)findViewById(R.id.QustionMode2) ;
        ShowQ.setText(MainActivity.ALLQ1.get(MainActivity.cont).getQuestions());

        Button Next = (Button) findViewById(R.id.next1);
        Button finish = (Button) findViewById(R.id.fin);
        finish.setEnabled(false);
        if(MainActivity.cont ==MainActivity.ALLQ1.size()-1){
            Next.setEnabled(false);
            finish.setEnabled(true);
        }


        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(True1,False1);
               Intent intent = new Intent(True_False.this,True_False.class);
                True_False.this.startActivity(intent);
                finish();
            }
        });
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(True1,False1);
                Intent intent = new Intent(True_False.this,Feedback.class);
                True_False.this.startActivity(intent);
                finish();
            }
        });

    }
}