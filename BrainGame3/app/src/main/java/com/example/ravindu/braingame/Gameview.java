package com.example.ravindu.braingame;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.lang.Runnable;

public class Gameview extends AppCompatActivity {
    Timer timerTask;
    int Spacing = 0;
    public static String questionset;
    public static int Correctanswer;
    public static Timer time;
    public static int questionnum;
    int sec = 10;
    final Context context = this;
    public boolean questionNumber = false;
    public static TextView quest;
    public static TextView text;
    private CountDownTimer countDownTimer;

public static int score;
    private final long starttime=10*1000;
    private final long interval=1*1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameview);

        Button bt0 = (Button) findViewById(R.id.button17);
        Button bt1 = (Button) findViewById(R.id.button10);
        Button bt2 = (Button) findViewById(R.id.button14);
        Button bt3 = (Button) findViewById(R.id.button18);
        Button bt4 = (Button) findViewById(R.id.button11);
        Button bt5 = (Button) findViewById(R.id.button15);
        Button bt6 = (Button) findViewById(R.id.button19);
        Button bt7 = (Button) findViewById(R.id.button12);
        Button bt8 = (Button) findViewById(R.id.button16);
        Button bt9 = (Button) findViewById(R.id.button20);

        Button del = (Button) findViewById(R.id.button13);

        Button hash = (Button) findViewById(R.id.button21);

        Button minus = (Button) findViewById(R.id.button22);


        final TextView answer = (TextView) findViewById(R.id.textView6);


        new Arithmatic().ArithmaticExpressions(Menue.difficultlevel);
        questionnum++;

        quest = (TextView) findViewById(R.id.textView3);

        quest.setText(questionset);


        // timer stuff
        text =(TextView)findViewById(R.id.textView5);
        countDownTimer = new MyCountDownTimer(starttime, interval);
        text.setText(text.getText() + String.valueOf(starttime / 1000));
        countDownTimer.start();
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Spacing == 0) {
                    answer.setText("");
                    Spacing = 1;
                }
                answer.setText(answer.getText() + "0");
            }
        });


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Spacing == 0) {
                    answer.setText("");
                    Spacing = 1;
                }
                answer.setText(answer.getText() + "1");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Spacing == 0) {
                    answer.setText("");
                    Spacing = 1;
                }
                answer.setText(answer.getText() + "2");
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Spacing == 0) {
                    answer.setText("");
                    Spacing = 1;
                }
                answer.setText(answer.getText() + "3");
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Spacing == 0) {
                    answer.setText("");
                    Spacing = 1;
                }
                answer.setText(answer.getText() + "4");
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Spacing == 0) {
                    answer.setText("");
                    Spacing = 1;
                }
                answer.setText(answer.getText() + "5");
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Spacing == 0) {
                    answer.setText("");
                    Spacing = 1;
                }
                answer.setText(answer.getText() + "6");
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Spacing == 0) {
                    answer.setText("");
                    Spacing = 1;
                }
                answer.setText(answer.getText() + "7");
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Spacing == 0) {
                    answer.setText("");
                    Spacing = 1;
                }
                answer.setText(answer.getText() + "8");
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Spacing == 0) {
                    answer.setText("");
                    Spacing = 1;
                }
                answer.setText(answer.getText() + "9");
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Spacing == 0) {
                    answer.setText("");
                    Spacing = 1;
                } else {
                    if (answer.getText().length() > 0) {
                        answer.setText(answer.getText().toString().substring(0, answer.getText().length() - 1));
                    }
                }

            }
        });

        hash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerchecker();


            }
        });

System.out.print(Correctanswer);
   }

    public void answerchecker() {
        TextView ans = (TextView) findViewById(R.id.textView6);
        final TextView result = (TextView) findViewById(R.id.textView8);
        Log.d("Ans:", ans.getText().toString());


        if (Integer.parseInt(ans.getText().toString()) == Correctanswer) {
            result.setVisibility(View.VISIBLE);
            result.setText("Corrrect");
            result.setTextColor(Color.GREEN);


            Log.d("Bool : ", questionNumber + "");
            if (questionNumber) {
                if (questionnum == 10) {
                    final Dialog dialog = new Dialog(context);
                    dialog.setContentView(R.layout.activity_gameview);
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

//                    TextView text = (TextView) dialog.findViewById(R.id.textView);
//                    text.setMovementMethod(new ScrollingMovementMethod());
                    //  TextView scorePrint = (TextView) dialog.findViewById(R.id.textView9);
                    // text.setMovementMethod(new ScrollingMovementMethod());
                    // scorePrint.setText(score + "");
                    // Log.d("Score : ", score + "");

                    Button dialogButton = (Button) dialog.findViewById(R.id.button);
                    dialogButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                          dialog.dismiss();
                            //finishAffinity();
                            Intent i = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(i);
                            result.setVisibility(View.GONE);
                            questionnum = 0;
                            //score=0;
                        }
                    });

                  //  dialog.show();

                } else {

                    finish();
                    startActivity(getIntent());
                    TextView questionUmber = (TextView) findViewById(R.id.textView8);
                    int num = questionnum;
                    questionUmber.setText(++num + " of 10");
                    questionNumber = false;
                }
            } else {
                questionNumber = true;
            }
        } else {
            result.setText("WRONG!");
            result.setTextColor(Color.RED);


      /*android.support.v7.widget.SwitchCompat sw = (android.support.v7.widget.SwitchCompat) findViewById(R.id.switch1);
        TextView hint = (TextView) findViewById(R.id);
        if (sw.isChecked()) {
            if (hintCount < 4) {
                hintCount++;
                if (Integer.parseInt(ans.getText().toString()) > valueInt) {
                    hint.setText("Less");
                    hint.setVisibility(View.VISIBLE);
                } else {
                    hint.setText("Greater");
                    hint.setVisibility(View.VISIBLE);
                }
            }
        }
    }

        }*/
    }
    }

    public void savingob(View view){
        SharedPreferences sharedPref = getSharedPreferences("cont", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("question", quest.getText().toString());
Log.d("working", quest.getText().toString());
        editor.putString("answer", String.valueOf(Correctanswer));
        Log.d("working", String.valueOf(Correctanswer));
        editor.apply();
        Toast.makeText(this, "saved", Toast.LENGTH_LONG).show();


    }




    public class MyCountDownTimer extends CountDownTimer {
        public MyCountDownTimer(long startTime, long interval) {
            super(startTime, interval);
        }

        @Override
        public void onFinish() {

            text.setText("Time's up!");
        }

        @Override
        public void onTick(long millisUntilFinished) {
            text.setText("" + millisUntilFinished / 1000);
        }
    }
}







