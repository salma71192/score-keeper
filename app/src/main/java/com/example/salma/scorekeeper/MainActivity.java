package com.example.salma.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int TeamA_goals = 0;
    int TeamA_fouls = 0;
    int TeamB_goals = 0;
    int TeamB_fouls = 0;

    /**
     * Increase the Goals for Team A by 1.
     */
    public void addOneGoalForTeamA(View v) {
        TeamA_goals += 1;
        displayForTeamAGoals(TeamA_goals);
    }

    /**
     * Increase the goals for Team A by 1.
     */
    public void addOneGoalForTeamB(View v) {
        TeamB_goals += 1;
        displayForTeamBGoals(TeamB_goals);
    }


    /**
     * Increase the Fouls for Team A by 1.
     */
    public void addOneFoulForTeamA(View v) {
        TeamA_fouls += 1;
        displayForTeamAFouls(TeamA_fouls);
    }

    /**
     * Increase the Fouls for Team A by 1.
     */
    public void addOneFoulForTeamB(View v) {
        TeamB_fouls += 1;
        displayForTeamBFouls(TeamB_fouls);
    }



    /**
     * Displays the given Goals for Team A.
     */
    public void displayForTeamAGoals(int score) {
        score += score;
        TextView scoreView = (TextView) findViewById(R.id.team_a_goals);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Goals for Team B.
     */
    public void displayForTeamBGoals(int score) {
        score += score;
        TextView scoreView = (TextView) findViewById(R.id.team_b_goals);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Fouls for Team A.
     */

    public void displayForTeamAFouls(int score) {
        score += score;
        TextView scoreView = (TextView) findViewById(R.id.team_a_goals);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Fouls for Team B.
     */
    public void displayForTeamBFouls(int score) {
        score += score;
        TextView scoreView = (TextView) findViewById(R.id.team_b_goals);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset the App to intial state.
     */
    public void Reset(View v) {
        int TeamA_goals = 0;
        int TeamA_fouls = 0;
        int TeamB_goals = 0;
        int TeamB_fouls = 0;

        displayForTeamAGoals(TeamA_goals);
        displayForTeamBGoals(TeamB_goals);
        displayForTeamAFouls(TeamA_fouls);
        displayForTeamBFouls(TeamB_fouls);
    }
}