package com.hdev.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;//only can hold numbers
        rollButton = (Button) findViewById(R.id.rollButton);//telling rollbutton is indeed a button (Button)
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);
        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);

        final int[] diceArray = {R.drawable.dice1, R.drawable.dice2,R.drawable.dice3,
                R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};
        /**
         * final when u use final keyword it means now the element is constant cant be change.
         * R for reference.
         * drawable because our images in drawable folder.
         */

        //Listener to button
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Dicee","Ze button hase been pressed!! ");//
                Random randomNumberGenerator = new Random();
                //Random is the variable type
                        //randomNumberGenerator is the variable
                        //Random() is the one that what want to  create
                int number= randomNumberGenerator.nextInt(6);//0,1,2,3,4,5,
                Log.d("Dicee","The random Number Is : "+ number);// to check it actually worked? in logcat;

                leftDice.setImageResource(diceArray[number]);

                /**
                 * setImageResource - to hold the functionality.
                 * number  - to set a random number as it is a variable that hold the generated number.
                 */
                //int number2= randomNumberGenerator.nextInt(6);
                // because if you use same variable you get same number to both dice.
                // or u can use same "
                number= randomNumberGenerator.nextInt(6);
                // " after the left dice;
                rightDice.setImageResource(diceArray[number]);

            }
        });



    }
}
