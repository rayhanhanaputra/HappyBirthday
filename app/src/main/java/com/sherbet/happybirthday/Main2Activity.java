package com.sherbet.happybirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button btnTambah;
    Button btnReset;
    Button btnKurang;
    TextView txtHasil;
    TextView totalHarga;

    public int temp = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnBack = (Button) findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(i);
            }
        });

        Button btnNext2 = (Button) findViewById(R.id.btnNext2);

        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(i);
            }
        });

        txtHasil = (TextView) findViewById(R.id.txtHasil);
        btnKurang= (Button) findViewById(R.id.btnKurang);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnReset = (Button) findViewById(R.id.btnReset);
        totalHarga=(TextView) findViewById(R.id.totalHarga);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                temp++;
                txtHasil.setText(String.valueOf(temp));
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                temp--;
                txtHasil.setText(String.valueOf(temp));
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                temp=0;
                txtHasil.setText(String.valueOf(temp));
            }
        });

    }
}
