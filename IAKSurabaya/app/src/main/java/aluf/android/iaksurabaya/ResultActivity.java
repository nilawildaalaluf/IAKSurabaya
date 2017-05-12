package aluf.android.iaksurabaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    int totalScoreA, totalScoreB;
    TextView  Winner,DifferentScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        totalScoreA = getIntent().getIntExtra("score a", 0);
        totalScoreB = getIntent().getIntExtra("score b", 0);

        Winner = (TextView)findViewById(R.id.winning_team);
        Winner.setText(getWinningTeam());

        DifferentScore = (TextView)findViewById(R.id.score_different);

        if (totalScoreA == totalScoreB){
            DifferentScore.setVisibility(View.GONE);
        }else {
            DifferentScore.setText(getDifferentScore()+"");
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    private String getWinningTeam() {
        String WinningTeam = (totalScoreA>totalScoreB)? "Team A Menang" : "Team B Menang";
        if (totalScoreA==totalScoreB) WinningTeam = "Draw";
        return WinningTeam;
    }

    public int getDifferentScore() {

        return Math.abs(totalScoreA - totalScoreB);
    }
}
