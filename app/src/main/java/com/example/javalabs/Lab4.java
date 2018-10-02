package com.example.javalabs;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.ByteBuffer;

public class Lab4 extends Activity {
    EditText etPosition;
    EditText etValue;
    Button btnChange;
    TextView tvAnswer;
    int number = 15;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_lab4);
        etPosition= (EditText)findViewById(R.id.et_lab4_position);
        etValue= (EditText)findViewById(R.id.et_lab4_value);
        btnChange = (Button)findViewById(R.id.btn_lab4_change);
        tvAnswer = (TextView)findViewById(R.id.tv_lab4_answer);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAnswer();
            }
        });
    }

    private void onAnswer(){
        int position = Integer.parseInt(etPosition.getText().toString());
        boolean value = 1==Integer.parseInt(etPosition.getText().toString());
        byte[] numberBytes = ByteBuffer.allocate(32).putInt(number).array();
        tvAnswer.setText(String.valueOf(Integer.getInteger(Integer.toBinaryString(position))));

    }
}
