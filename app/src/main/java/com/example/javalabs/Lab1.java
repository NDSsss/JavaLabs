package com.example.javalabs;

import android.accessibilityservice.GestureDescription;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lab1 extends Activity {
    TextView etLab1answer;
    TextView twLab1Explain;
    Button btnAnsewr;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_lab1);
        etLab1answer = (TextView) findViewById(R.id.et_lab1_answer);
        btnAnsewr= (Button)findViewById(R.id.btn_lab1_answer);
        twLab1Explain = (TextView) findViewById(R.id.tw_lab1_explain);
        btnAnsewr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x0 = 2;
                int v0 = 3;
                int t = 4;
                etLab1answer.setVisibility(View.VISIBLE);
                twLab1Explain.setText("x0 = "+String.valueOf(x0)+" v0 = "+String.valueOf(v0)+" t = "+String.valueOf(t));
                etLab1answer.setText(String.valueOf(calculate(x0, v0, t)));

            }
        });
    }

    double calculate(int x0, int v0, int t){
        return (x0+(v0*t)+((9.8d*(t*t))/2));
    }

}
