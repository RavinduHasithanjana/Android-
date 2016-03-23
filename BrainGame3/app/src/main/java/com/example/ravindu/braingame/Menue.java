package com.example.ravindu.braingame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menue extends AppCompatActivity {
    public static int difficultlevel=0;
public static Button novice ;
    public  static Button easy;
    public  static Button Medium;
    public  static Button guru;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menue);


        novice=(Button)findViewById(R.id.button6);
        easy =(Button)findViewById(R.id.button9);
        Medium=(Button)findViewById(R.id.button7);
        guru =(Button)findViewById(R.id.button8);

        novice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Gameview.class);
                difficultlevel=1;
                startActivity(i);
            }
        });



        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),Gameview.class);
                difficultlevel=2;
                startActivity(i1);
            }
        });

Medium.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i2 = new Intent(getApplicationContext(),Gameview.class);
        difficultlevel=3;
        startActivity(i2);
    }
});

        guru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3= new Intent(getApplicationContext(),Gameview.class);
                difficultlevel=4;
                startActivity(i3);
            }
        });
    }


}
