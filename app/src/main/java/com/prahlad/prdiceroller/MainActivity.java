package com.prahlad.prdiceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDicy;
    private ImageView imageViewDicy2;
    private Button roller;
    private Random myRandomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDicy = findViewById(R.id.imageView);
        imageViewDicy2 = findViewById(R.id.imageView3);

        roller = findViewById(R.id.button);
        roller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollOurDice();
            }
            public void buttondice(View v) {
                Toasty.success(this, "Dice Rolled", Toast.LENGTH_SHORT).show();
            }

            private void rollOurDice(){
                int myRanNumber = myRandomNumber.nextInt(6)+1;
                switch(myRanNumber){
                    case 1:
                        imageViewDicy.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        imageViewDicy.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        imageViewDicy.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        imageViewDicy.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        imageViewDicy.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        imageViewDicy.setImageResource(R.drawable.dice6);
                        break;
                }

                int myRanNumber2 = myRandomNumber.nextInt(6)+1;
                switch(myRanNumber2){
                    case 1:
                        imageViewDicy2.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        imageViewDicy2.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        imageViewDicy2.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        imageViewDicy2.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        imageViewDicy2.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        imageViewDicy2.setImageResource(R.drawable.dice6);
                        break;
                }
            }



        });


    }
}
