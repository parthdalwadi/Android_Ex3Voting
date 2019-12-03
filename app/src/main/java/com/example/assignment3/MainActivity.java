package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


// just to check
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText vID = findViewById(R.id.vid);
        final Spinner sp = findViewById(R.id.selectCandidate);
        final ToggleButton YesNo = findViewById(R.id.toggleAR);
        Button voteBtn = findViewById(R.id.voteBtn);

        voteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Boolean idVoted = false;
                for (Vote v:
                     Vote.listVotes) {

                    if (v.voterID.equals(vID.getText().toString())){
                        System.out.println("inside parth");
                        idVoted = true;
                        Toast.makeText(MainActivity.this, "ID already voated", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
                System.out.println(idVoted);
                if (!idVoted) {
                String cn = (YesNo.getText().toString() == YesNo.getTextOn().toString()) ? sp.getSelectedItem().toString() : "NA";

                Vote v = new Vote(vID.getText().toString(), cn );
                Vote.listVotes.add(v);

                Intent intent = new Intent(MainActivity.this, Result.class);
                startActivity(intent);}
            }
        });
    }




}
