package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView scre,stat,bscore;
    Button reset;

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        scre = findViewById(R.id.score);
        stat = findViewById(R.id.status);
        reset = findViewById(R.id.Rbutton);
        bscore = findViewById(R.id.bscore);

        Intent keEnd = getIntent();
        String Score = keEnd.getStringExtra(MainActivity.Key1);
        String Stats= getIntent().getStringExtra("status");
        int bestScore = getIntent().getIntExtra("best_score", 0);
        bscore.setText("Best score: " + bestScore);

        String curScore = Score;

        scre.setText("you got "+ curScore);
        stat.setText(Stats);



        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int bestScore = getIntent().getIntExtra("best_score", 0);
                String data1= getIntent().getStringExtra("Fname");
                Uri uri1 = (Uri) getIntent().getParcelableExtra("image");
                Intent KeA = new Intent(getApplicationContext(), ActivityScnd.class);
                KeA.putExtra("best_score", bestScore);
                KeA.putExtra("Fname" , data1);
                KeA.putExtra("image" ,uri1);
                startActivity(KeA);
                finish();
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // Reset the best score value when the activity is destroyed (i.e. the app is closed)
        sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("best_score", 0);
        editor.apply();
    }
}