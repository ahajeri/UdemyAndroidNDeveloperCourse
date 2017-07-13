package com.mymobileworldapps.animationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    void imageTransition(View view){

        ImageView myimage1 = (ImageView) findViewById(R.id.image1);
        ImageView myimage2 = (ImageView) findViewById(R.id.photo);
        if(myimage1.getAlpha() == 1f) {
            myimage1.animate().alpha(0f).setDuration(2000);
            myimage2.animate().alpha(1f).setDuration(2000);
        }
        else {
            myimage1.animate().alpha(1f).setDuration(2000);
            myimage2.animate().alpha(0f).setDuration(2000);
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
