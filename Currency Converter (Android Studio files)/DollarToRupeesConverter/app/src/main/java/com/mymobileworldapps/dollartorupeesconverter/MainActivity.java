package com.mymobileworldapps.dollartorupeesconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertToRupees(View view){
        EditText inputValue = (EditText) findViewById(R.id.myInputValue);
        double value = Double.parseDouble(inputValue.getText().toString());


        double result = value * 64.72;

        Toast.makeText(MainActivity.this, String.format("%.0f",value)+"$ in Rupees: "+ String.format("%.2f",result) + "₹", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
