package com.sherbet.happybirthday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    Button btnNext2;
    Button shotB;
    Button pointB;
    Button throwB;
    TextView teamB;
    Button shotA;
    Button pointA;
    Button throwA;
    TextView teamA;
    int tempA=0;
    int tempB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btnBack2 = (Button) findViewById(R.id.btnBack2);

        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (Main3Activity.this, Main2Activity.class);
                startActivity(i);
            }
        });

        btnNext2= (Button) findViewById(R.id.btnNext2);

        btnNext2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent (Main3Activity.this, Main4Activity.class);
                startActivity(i);
            }
        });

        shotA= (Button) findViewById(R.id.shotA);
        shotB=(Button) findViewById(R.id.shotB);
        pointA=(Button) findViewById(R.id.pointA);
        pointB=(Button) findViewById(R.id.pointB);
        throwA=(Button) findViewById(R.id.throwA);
        throwB=(Button) findViewById(R.id.throwB);
        teamA=(TextView) findViewById(R.id.teamA);
        teamB=(TextView) findViewById(R.id.teamB);

        shotA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tempA+=2;
                teamA.setText(String.valueOf(tempA));   }
        });

        shotB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tempB+=2;
                teamB.setText(String.valueOf(tempB));
            }
        });

        pointA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tempA+=3;
                teamA.setText(String.valueOf(tempA));
            }
        });

        pointB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tempB+=3;
                teamB.setText(String.valueOf(tempB));
            }
        });

        throwA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tempA++;
                teamA.setText(String.valueOf(tempA));
            }
        });

        throwB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tempB++;
                teamB.setText(String.valueOf(tempB));
            }
        });
    }
}
