package com.example.brinypeddler.connect3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    boolean game=true;
    int active = 0;
    int[] stat = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    int[][] winpo = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};

    public void dropin(View v) {
        ImageView counter = (ImageView) v;
        counter.setTranslationY(-1000f);
        int tag = Integer.parseInt(counter.getTag().toString());
        if (game) {
            if (stat[tag] == 2) {
                stat[tag] = active;
                if (active == 0) {
                    counter.setImageResource(R.drawable.yellow);
                    counter.animate().translationYBy(1000f).rotation(360f).setDuration(400);
                    active = 1;

                } else {
                    counter.setImageResource(R.drawable.red);
                    counter.animate().translationYBy(1000f).rotation(360f).setDuration(400);
                    active = 0;

                }
            } else {
                if (stat[tag] == 1) {
                    counter.setImageResource(R.drawable.red);
                    counter.animate().translationYBy(1000f).rotation(360f).setDuration(400);
                } else {
                    counter.setImageResource(R.drawable.yellow);
                    counter.animate().translationYBy(1000f).rotation(360f).setDuration(400);
                }
            }

            for (int[] win : winpo) {

                if (stat[win[0]] == stat[win[1]] && stat[win[1]] == stat[win[2]] && stat[win[1]] != 2) {
                    String winn = "Yellow";
                    game = false;
                    if (stat[win[0]] == 1)
                        winn = "Red";
                    TextView winner = (TextView) findViewById(R.id.winner);
                    winner.setText(winn + " has won");
                    LinearLayout playAgainLayout = (LinearLayout) findViewById(R.id.playAgainLayout);
                    playAgainLayout.setVisibility(View.VISIBLE);
                }else{
                    boolean over=true;
                    for(int i=0;i<stat.length;i++){
                        if(stat[i]==2) over=false;}
                    if(over){
                        TextView winner = (TextView) findViewById(R.id.winner);
                        winner.setText("Draw");
                        LinearLayout playAgainLayout = (LinearLayout) findViewById(R.id.playAgainLayout);
                        playAgainLayout.setVisibility(View.VISIBLE);

                    }
                }
            }
        }
    }
    public void reset(View V) {
        LinearLayout playAgainLayout = (LinearLayout) findViewById(R.id.playAgainLayout);
        playAgainLayout.setVisibility(View.INVISIBLE);
        game=true;
        int active = 0;
        for(int i=0;i<stat.length;i++)
            stat[i]=2;


        GridLayout grid = (GridLayout) findViewById(R.id.grid);
        for(int i=0;i<grid.getChildCount();i++)
            ((ImageView)grid.getChildAt(i)).setImageResource(0);
    }

}
