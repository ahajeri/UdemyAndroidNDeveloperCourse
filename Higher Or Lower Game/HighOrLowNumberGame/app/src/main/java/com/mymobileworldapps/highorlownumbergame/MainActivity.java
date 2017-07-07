package com.mymobileworldapps.highorlownumbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.textservice.TextInfo;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randnumber ;

    int fristClick = 1;

    //Generate random number for the game

    public int getRandnumber(){
        Random rand = new Random();
        return rand.nextInt(20)+1;
    }

    //Print

    public void makeToast(String s){

        Toast.makeText(MainActivity.this,s , Toast.LENGTH_LONG).show();

    }

    //Button Onclick Method

    public void checkNumber(View view){

        if(fristClick == 1) {
            randnumber = getRandnumber();
            fristClick++;
        }

        EditText inputValue = (EditText) findViewById(R.id.myInput);

        if(inputValue.getText().toString().isEmpty()){
            makeToast("Please, Enter a number");
            return;
        }

        int inputMyValue = Integer.valueOf(inputValue.getText().toString());


        if(inputMyValue > 20){
            makeToast("Please, Enter number between 1 -20");
        }

        if(inputMyValue == randnumber){
            makeToast("yes, you guessed it right");
            randnumber = getRandnumber();
        }

        else if (inputMyValue > randnumber){
            makeToast("Try for Low value Number");

        }

        else {
            makeToast("Try for High value Number");
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
