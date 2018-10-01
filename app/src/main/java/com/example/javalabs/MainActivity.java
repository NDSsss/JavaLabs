package com.example.javalabs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLab1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLab1 = (Button)findViewById(R.id.btnLab1);
        btnLab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickLab1(v);
            }
        });
    }

    private void onClickLab1(View view){
        Intent intent = new Intent(this, Lab1.class);
        startActivity(intent);
    }
}
