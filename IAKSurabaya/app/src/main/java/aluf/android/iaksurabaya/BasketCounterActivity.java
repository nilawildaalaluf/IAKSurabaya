package aluf.android.iaksurabaya;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BasketCounterActivity extends AppCompatActivity {

    int totalScoreA=0, totalScoreB=0;
    TextView totalScoreteamA, totalScoreteamB;
    Button btnEnd, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket_counter);

        totalScoreteamA = (TextView)findViewById(R.id.teamATotalScore);
        totalScoreteamB = (TextView)findViewById(R.id.teamBTotalScore);

        btnEnd = (Button)findViewById(R.id.end);
        btnReset = (Button)findViewById(R.id.reset);

        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(BasketCounterActivity.this,ResultActivity.class);
                i.putExtra("score a",totalScoreA);
                i.putExtra("score b", totalScoreB);

                startActivity(i);

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalScoreA=totalScoreB=0;
                totalScoreteamA.setText(String.valueOf(totalScoreA));
                totalScoreteamB.setText(String.valueOf(totalScoreB));
            }
        });
    }

    public void poin2A(View view){
        updateScoreA(2);
    }

    public void poin3A(View view){
        updateScoreA(3);
    }

    public void throwA(View view){
        updateScoreA(1);
    }

    private void updateScoreA(int score) {
        totalScoreA +=score;
        totalScoreteamA.setText(String.valueOf(totalScoreA));
    }


    public void poin2b(View view){
        updateScoreB(2);
    }

    public void poin3B(View view){
        updateScoreB(3);
    }

    public void throwB(View view){
        updateScoreB(1);
    }

    private void updateScoreB(int score) {
        totalScoreB +=score;
        totalScoreteamB.setText(String.valueOf(totalScoreB));
    }
}
