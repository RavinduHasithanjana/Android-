package com.example.ravindu.braingame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.Console;

public class Start extends AppCompatActivity {
private static Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Log.i("fdfdfdf","fdfdf");
        click();
    }


    public void click(){
button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

startActivity(new Intent(Start.this,MainActivity.class));
                finish();
            }
        });
    }
}
