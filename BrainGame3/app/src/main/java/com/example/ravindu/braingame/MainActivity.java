package com.example.ravindu.braingame;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.prefs.Preferences;

public class MainActivity extends AppCompatActivity {
public static Button butt;

    public static  Button exit;
    public static  Button newgame;
    public static  Button cont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

        newgame=(Button)findViewById(R.id.button2);
        newg();
pop();
        exit();
continous();
    }

    public void newg(){

        newgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Menue.class);
                startActivity(i);
            }
        });
    }

public void pop(){
    butt=(Button)findViewById(R.id.button4);
    butt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, Pop.class));
        }
    });
}

    public void exit(){
        exit=(Button)findViewById(R.id.button5);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });




    }
   public void continous(){
       cont=(Button)findViewById(R.id.button3);
       cont.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent io = new Intent(getApplicationContext(),Resumegame.class);
               startActivity(io);
           }
       });
   }
}
