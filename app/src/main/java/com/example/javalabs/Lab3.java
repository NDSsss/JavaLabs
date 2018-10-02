package com.example.javalabs;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lab3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_lab3);
        TextView tvAnswer = (TextView)findViewById(R.id.tv_lab3_answer);
        ArrayList<Runner> runners = new ArrayList<>();
        runners.add(new Runner("Elena	",341,1));
        runners.add(new Runner("Thomas	",273,2));
        runners.add(new Runner("Hamilton",278,3));
        runners.add(new Runner("Suzie	",329,4));
        runners.add(new Runner("Phil	",445,5));
        runners.add(new Runner("Matt	",402,6));
        runners.add(new Runner("Alex	",388,7));
        runners.add(new Runner("Emma	",275,8));
        runners.add(new Runner("John	",243,9));
        runners.add(new Runner("James	",334,10));
        runners.add(new Runner("Jane	",412,11));
        runners.add(new Runner("Emily	",393,12));
        runners.add(new Runner("Daniel	",299,13));
        runners.add(new Runner("Neda	",343,14));
        runners.add(new Runner("Aaron	",317,15));
        runners.add(new Runner("Kate	",265,16));
        Collections.sort(runners);
        tvAnswer.setText(runners.get(0).name+" "+String.valueOf(runners.get(0).position));
    }

    private class Runner implements Comparable{
        public String name;
        public int time;
        public int position;

        public Runner(String name, int time, int position){
            this.name = name;
            this.time = time;
            this.position = position;
        }


        @Override
        public int compareTo(@NonNull Object o) {
            return time-((Runner)o).time;
        }
    }
}
