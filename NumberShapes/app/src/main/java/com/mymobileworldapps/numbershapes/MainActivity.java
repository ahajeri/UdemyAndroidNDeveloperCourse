package com.mymobileworldapps.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void makeToast(String s){

        Toast.makeText(MainActivity.this,s , Toast.LENGTH_LONG).show();

    }

    public void checkNumber(View view){
        EditText inputNum = (EditText) findViewById(R.id.inputValue);

        if(inputNum.getText().toString().isEmpty()){
            makeToast("Please, Enter a number");
            return;
        }


        int myNum = Integer.parseInt(inputNum.getText().toString());

        Number checkNum = new Number();
        checkNum.num = myNum;
        if(checkNum.isSquare() && checkNum.isTriangular()){
            makeToast("Yes, Number is a square triangular number");
        }

        else if(checkNum.isTriangular()) {
            makeToast("Yes, Number is a Triangular");
        }

        else if(checkNum.isSquare()){

            makeToast("Yes, Number is a Square");
        }

        else {

            makeToast("Number is not a Triangular and not a Square");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

class Number{

    int num;

    public boolean isTriangular(){
        int n =1;
        int trigularNum = 0;
        while(num > trigularNum){
            trigularNum  = trigularNum  + n;
            n++;
            if(num == trigularNum) return true;
        }
        return false;
    }


    public boolean isSquare(){
        int n = 1;
        int square =1;
        while(num > square  ){
            square = n *n;
            n++;
            if(num ==  square) return true;

        }
        return false;

    }



}
