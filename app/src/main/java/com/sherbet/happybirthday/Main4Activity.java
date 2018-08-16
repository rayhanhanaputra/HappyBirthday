package com.sherbet.happybirthday;

import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    Button btnBack3;
    TextView txt2;
    Sensor proximity;
    SensorManager sensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final EditText number=(EditText) findViewById(R.id.number);
        Button btnCall=(Button) findViewById(R.id.btnCall);

        btnCall.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                String toDial="tel: "+number.getText().toString();

                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(toDial)));
            }
        });

        btnBack3=(Button) findViewById(R.id.btnBack3);

        btnBack3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Main4Activity.this, Main3Activity.class);
                startActivity(i);
            }
        });

        txt2= (TextView) findViewById(R.id.txt2);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        proximity = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        if(proximity==null){
            Toast.makeText(Main4Activity.this, "Sensor Gaada",Toast.LENGTH_LONG);
        }

        SensorEventListener proxymityListener= new SensorEventListener(){
            @Override
            public void onSensorChanged(SensorEvent sensorEvent){
                if(sensorEvent.values[0] < proximity.getMaximumRange()){
                    txt2.setText("Kamu Dekat");
                    getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                } else{
                    txt2.setText("Kamu Jauh");
                    getWindow().getDecorView().setBackgroundColor(Color.RED);
                }
            }
            @Override
            public void onAccuracyChanged(Sensor sensor,int i){}
        };

        sensorManager.registerListener(proxymityListener,proximity,2 *1000*1000);
    }
}
