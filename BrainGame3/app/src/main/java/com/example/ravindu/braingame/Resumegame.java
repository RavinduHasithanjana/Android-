package com.example.ravindu.braingame;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Resumegame extends AppCompatActivity {
    private TextView text;
    private CountDownTimer countDownTimer;
    private boolean timerHasStarted = false;
    private Button startbutton;
    private final long starttime=30*1000;
    private final long interval=1*1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumegame);

        text=(TextView)findViewById(R.id.textView11);

startbutton=(Button)findViewById(R.id.button24);



    }
    public void coo(View view){
        // TextView show= (TextView)findViewById(R.id.textView10);
        SharedPreferences sharedPref = getSharedPreferences("cont", Context.MODE_PRIVATE);

        String name = sharedPref.getString("question","");
        String pass =sharedPref.getString("answer","");
        text.setText(name + " " + pass);
    }



}


