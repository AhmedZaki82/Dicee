package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rollButton;
    ImageView leftDice;
    ImageView rightDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = (Button) findViewById(R.id.roll_button);
        leftDice = (ImageView) findViewById(R.id.left_dice);
        rightDice = (ImageView) findViewById(R.id.right_dice);

        final int [] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                int number2 = randomNumberGenerator.nextInt(6);

//                Toast.makeText(MainActivity.this, "The Random Number is ----->"
//                        + String.valueOf(number), Toast.LENGTH_SHORT).show();

                leftDice.setImageResource(diceArray[number]);
                rightDice.setImageResource(diceArray[number2]);

            }
        });

        leftDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        rightDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
