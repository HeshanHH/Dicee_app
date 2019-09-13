package com.hdev.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;//only can hold numbers
        rollButton = (Button) findViewById(R.id.rollButton);//telling rollbutton is indeed a button (Button)
        ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);
        ImageView lefttDice = (ImageView) findViewById(R.id.image_leftDice);


        //Listener to button
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Dicee","Ze button hase been pressed!! ");//


            }
        });



    }
}
