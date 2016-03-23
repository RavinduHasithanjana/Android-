package com.example.ravindu.braingame;

import java.util.Random;

/**
 * Created by Ravindu on 3/4/2016.
 */
public class Arithmatic {
    static int genone=0;
    static int gentwo=0;
    static int genthree=0;
    static int genfour=0;
    static char sign=0;
    public void ArithmaticExpressions(int level){
   String input ="";
char operation1= genrateoperation();

        int no1,no2,no3,no4,n05,no6;
        no1=generateno();
        no2=generateno();
        no3=generateno();
        no4=generateno();
        n05=generateno();
        no6=generateno();

        if (level==1){

            input= no1+" "+operation1+" "+no2;
            switch (operation1){
                case '+':
                    Gameview.Correctanswer=no1+no2;
                    break;
                case '-':
                    Gameview.Correctanswer=no1-no2;
                    break;
                case '/':
                    Gameview.Correctanswer=no1/no2;
                    break;
                case '*':
                    Gameview.Correctanswer=no1*no2;
                    break;
            }
           // Gameview.Correctanswer= no1+operation1+no2;


        }else if (level==2){
            Random ran = new Random();
            int c = ran.nextInt(2);
            if (c==0){
                input=no1+" "+genrateoperation()+" "+no2;
                Gameview.Correctanswer=no1+genrateoperation()+no2;
            }else if (c==1){
                input=no1+" "+genrateoperation()+" "+no2+" "+genrateoperation()+""+no3;
                Gameview.Correctanswer=no1+genrateoperation()+no2+genrateoperation()+no3;
            }
        }else if (level==3){
            Random ran1 = new Random();
            int c1= ran1.nextInt(3);
            if (c1==0){
                input=no1+" "+genrateoperation()+" "+no2;
                Gameview.Correctanswer=no1+genrateoperation()+no2;
            }else if (c1==1){
                input=no1+" "+genrateoperation()+" "+no2+" "+genrateoperation()+""+no3;
                Gameview.Correctanswer=no1+genrateoperation()+no2+genrateoperation()+no3;
            }else if (c1==2){
                input=no1+" "+genrateoperation()+" "+no2+" "+genrateoperation()+""+no3+" "+genrateoperation()+" "+no4;
                Gameview.Correctanswer=no1+genrateoperation()+no2+genrateoperation()+no3+genrateoperation()+no4;
            }
        }else if (level==4){
            Random ran2 = new Random();
            int c2= ran2.nextInt(3);
            if (c2==0){
                input=no1+" "+genrateoperation()+" "+no2+" "+genrateoperation()+""+no3+" "+genrateoperation()+" "+no4;
                Gameview.Correctanswer=no1+genrateoperation()+no2+genrateoperation()+no3+genrateoperation()+no4;
            }else if (c2==1){
                input=no1+" "+genrateoperation()+" "+no2+" "+genrateoperation()+""+no3+" "+genrateoperation()+" "+no4+" "+genrateoperation()+" "+n05;
                Gameview.Correctanswer=no1+genrateoperation()+no2+genrateoperation()+no3+genrateoperation()+no4+genrateoperation()+n05;
            }else if (c2==2){
                input=no1+" "+genrateoperation()+" "+no2+" "+genrateoperation()+""+no3+" "+genrateoperation()+" "+no4+" "+genrateoperation()+" "+n05+" "+genrateoperation()+" "+no6;
                Gameview.Correctanswer=no1+genrateoperation()+no2+genrateoperation()+no3+genrateoperation()+no4+genrateoperation()+n05+genrateoperation()+no6;
            }
        }





        Gameview.questionset=input;


    }

    public int generateno(){
        Random random = new Random();
        return random.nextInt(199)+1;
    }

    public char genrateoperation(){
        Random random2 = new Random();
        int oper=random2.nextInt(4);

        if (oper==0){
            return '+';
        }else  if (oper==1){
            return '-';
        }else  if (oper==2){
            return '*';
        }else if (oper==3){
            return '/';
        }
        return 0;
    }
}
