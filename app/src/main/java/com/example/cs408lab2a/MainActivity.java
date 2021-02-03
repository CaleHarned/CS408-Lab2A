package com.example.cs408lab2a;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int playerScore;
    private int computerScore;
    private Weapon playerChoice;
    private Weapon computerChoice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playerScore = 0;
        computerScore = 0;
        TextView t = (TextView) findViewById(R.id.scoreText);
        t.setText("Player:"+playerScore+", Computer:"+computerScore);
    }
    public void onClickRockButton(View v) {
        playerChoice=Weapon.ROCK;
        Random rand = new Random();
        int bound= 3;
        int compChoice= rand.nextInt(bound);
        if (compChoice==0){
            computerChoice=Weapon.ROCK;
            TextView a = (TextView) findViewById(R.id.winnerAndExplination);
            a.setText("Draw!");
        }
        if (compChoice==1){
            computerChoice=Weapon.PAPER;
            TextView a = (TextView) findViewById(R.id.winnerAndExplination);
            a.setText("Computer wins...Paper covers rock!");
            computerScore=computerScore+1;
        }
        if (compChoice==2){
            computerChoice=Weapon.SCISSORS;
            TextView a = (TextView) findViewById(R.id.winnerAndExplination);
            a.setText("Player wins...Rock crushes scissors!");
            playerScore=playerScore+1;
        }
        TextView b = (TextView) findViewById(R.id.scoreText);
        b.setText("Player:"+playerScore+", Computer:"+computerScore);
        TextView t = (TextView) findViewById(R.id.playerWeaponChoice);
        t.setText("Player's Weapon: "+playerChoice.toString());
        TextView c = (TextView) findViewById(R.id.computerWeaponChoice);
        c.setText("Computer's Weapon: "+computerChoice.toString());

    }
    public void onClickPaperButton(View v) {
        playerChoice=Weapon.PAPER;
        Random rand = new Random();
        int bound= 3;
        int compChoice= rand.nextInt(bound);
        if (compChoice==0){
            computerChoice=Weapon.ROCK;
            TextView a = (TextView) findViewById(R.id.winnerAndExplination);
            a.setText("Player wins...Paper covers rock!");
            playerScore=playerScore+1;
        }
        if (compChoice==1){
            computerChoice=Weapon.PAPER;
            TextView a = (TextView) findViewById(R.id.winnerAndExplination);
            a.setText("Draw!");
        }
        if (compChoice==2){
            computerChoice=Weapon.SCISSORS;
            TextView a = (TextView) findViewById(R.id.winnerAndExplination);
            a.setText("Computer wins...Scissors cuts paper!");
            computerScore=computerScore+1;
        }
        TextView b = (TextView) findViewById(R.id.scoreText);
        b.setText("Player:"+playerScore+", Computer:"+computerScore);
        TextView t = (TextView) findViewById(R.id.playerWeaponChoice);
        t.setText("Player's Weapon: "+playerChoice.toString());
        TextView c = (TextView) findViewById(R.id.computerWeaponChoice);
        c.setText("Computer's Weapon: "+computerChoice.toString());

    }
    public void onClickScissorsButton(View v) {
        playerChoice=Weapon.SCISSORS;
        Random rand = new Random();
        int bound= 3;
        int compChoice= rand.nextInt(bound);
        if (compChoice==0){
            computerChoice=Weapon.ROCK;
            TextView a = (TextView) findViewById(R.id.winnerAndExplination);
            a.setText("Computer wins..Rock crushes scissors!");
            computerScore=computerScore+1;

        }
        if (compChoice==1){
            computerChoice=Weapon.PAPER;
            TextView a = (TextView) findViewById(R.id.winnerAndExplination);
            a.setText("Player wins...Scissors cut paper!");
            playerScore=playerScore+1;
        }
        if (compChoice==2){
            computerChoice=Weapon.SCISSORS;
            TextView a = (TextView) findViewById(R.id.winnerAndExplination);
            a.setText("Draw!");

        }
        TextView b = (TextView) findViewById(R.id.scoreText);
        b.setText("Player:"+playerScore+", Computer:"+computerScore);
        TextView t = (TextView) findViewById(R.id.playerWeaponChoice);
        t.setText("Player's Weapon: "+playerChoice.toString());
        TextView c = (TextView) findViewById(R.id.computerWeaponChoice);
        c.setText("Computer's Weapon: "+computerChoice.toString());

    }
}