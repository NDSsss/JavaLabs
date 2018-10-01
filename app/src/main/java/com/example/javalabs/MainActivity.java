package com.example.javalabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLab1;
    Button btnLab2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLab1 = (Button) findViewById(R.id.btnLab1);
        btnLab2 = (Button) findViewById(R.id.btnLab2);
        btnLab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickLab1(v);
            }
        });
        btnLab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickLab1(v);
            }
        });
    }

    private void onClickLab1(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btnLab1:
                intent = new Intent(this, Lab1.class);
                startActivity(intent);
                break;
            case R.id.btnLab2:
                intent = new Intent(this,Lab2.class);
                startActivity(intent);
                break;
        }

    }
}
