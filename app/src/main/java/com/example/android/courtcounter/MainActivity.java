package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  int score=0;
  int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void reset(View view){
        score=0;
        displayforteamA(score);
        displayforteamB(score);
    }
    public void three(View view){
        score=score+3;
        displayforteamA(score);
    }

    public void two(View view){
        score=score+2;
        displayforteamA(score);
    }
    public void freethrow(View view){
        score=score+1;
        displayforteamA(score);
    }
    public void threeB(View view){
        scoreB=scoreB+3;
        displayforteamB(scoreB);
    }

    public void twoB(View view){
        scoreB=scoreB+2;
        displayforteamB(scoreB);
    }
    public void freethrowB(View view){
        scoreB=scoreB+1;
        displayforteamB(scoreB);
    }

    public void displayforteamA(int score){
        TextView scoreView=(TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }
    public void displayforteamB(int score){
        TextView scoreView=(TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}