package com.example.javalabs;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.EditText;
import android.widget.TextView;

public class Lab2 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_lab2);
        FooCorporation fooCorporation = new FooCorporation();
        String commonSallary="";
        commonSallary += "Работник 1: "+fooCorporation.getSallary(250,35)+"\n";
        commonSallary += "Работник 2: "+fooCorporation.getSallary(330,55)+"\n";
        commonSallary += "Работник 3: "+fooCorporation.getSallary(400,73)+"\n"git;
        TextView etAnswer = (TextView) findViewById(R.id.tw_lab2_answer);
        etAnswer.setText(commonSallary);
    }

    private class FooCorporation{
        public String getSallary(int baseSallary, int hours){
            if(baseSallary>0&&hours>0) {
                if (baseSallary < 300) {
                    return "Слишком маленькая ЗП";
                }
                if (hours > 60) {
                    return "Преработка";
                }
                int mainhours=40;
                int extraHouts=hours-mainhours;
                double sallary=0;
                sallary=baseSallary*mainhours;
                if(extraHouts>0){
                    sallary+=baseSallary*1.5d*extraHouts;
                }
                return "Зарплата "+String.valueOf(sallary);
            }else{
                return "Неверные входные данные";
            }
        }
    }
}
