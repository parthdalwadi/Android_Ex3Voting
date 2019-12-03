package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static java.lang.Math.max;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView tv1 = findViewById(R.id.c1);
        TextView tv2 = findViewById(R.id.c2);
        TextView tv3 = findViewById(R.id.c3);
        TextView win = findViewById(R.id.winner);
        //Intent intent = getIntent(); not required


        int v1 = 0, v2 = 0, v3 = 0;



        for (Vote v: Vote.listVotes) {

            switch (v.canName){
                case "candidate 1": v1++; break;
                case "candidate 2": v2++; break;
                case "candidate 3": v3++; break;
                default: break;
            }

        }

        String c1 = String.format("Candidate 1 : %d",v1);
        String c2 = String.format("Candidate 2 : %d",v2);
        String c3 = String.format("Candidate 3 : %d",v3);

        tv1.setText(c1);
        tv2.setText(c2);
        tv3.setText(c3);
        String w = "";
        int m = max(max(v1, v2),v3);

        if (m == v1) { w = "Winner: Candidate 1";}
        if (m == v2) { w = "Winner: Candidate 2";}
        if (m == v3) { w = "Winner: Candidate 3";}

        win.setText(w);




    }
}
