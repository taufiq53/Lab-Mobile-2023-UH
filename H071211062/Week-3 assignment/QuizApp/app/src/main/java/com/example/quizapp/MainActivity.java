package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansA,ansB,ansC,ansD;

    int score = 0;
    int totalQuestion = Question.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";
    public static final String Key1 = "";

    private SharedPreferences sharedPreferences;
    private int bestScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        bestScore = sharedPreferences.getInt("best_score", 0);

        totalQuestionsTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);


        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);


        totalQuestionsTextView.setText("Total questions : "+totalQuestion);

        loadNewQuestion();




    }

    @Override
    public void onClick(View view) {
        ansA.setEnabled(false);
        ansB.setEnabled(false);
        ansC.setEnabled(false);
        ansD.setEnabled(false);

        final Button clickedButton = (Button) view;
        selectedAnswer = clickedButton.getText().toString();

        if (selectedAnswer.equals(Question.correctAnswers[currentQuestionIndex])) {
            score++;
            clickedButton.setBackgroundColor(Color.GREEN);
        } else {
            clickedButton.setBackgroundColor(Color.RED);
        }
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ansA.setEnabled(true);
                ansB.setEnabled(true);
                ansC.setEnabled(true);
                ansD.setEnabled(true);

                ansA.setBackgroundColor(Color.WHITE);
                ansB.setBackgroundColor(Color.WHITE);
                ansC.setBackgroundColor(Color.WHITE);
                ansD.setBackgroundColor(Color.WHITE);

                currentQuestionIndex++;
                if (currentQuestionIndex < totalQuestion) {
                    loadNewQuestion();
                } else {
                    finishQuiz();
                }
            }
        }, 1000);
    }





    void loadNewQuestion(){

        if(currentQuestionIndex == totalQuestion ){
            finishQuiz();
            return;
        }
        selectedAnswer = "";

        questionTextView.setText(Question.question[currentQuestionIndex]);
        ansA.setText(Question.choices[currentQuestionIndex][0]);
        ansB.setText(Question.choices[currentQuestionIndex][1]);
        ansC.setText(Question.choices[currentQuestionIndex][2]);
        ansD.setText(Question.choices[currentQuestionIndex][3]);




    }


    void finishQuiz(){
        if (score > bestScore) {
            bestScore = score;
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putInt("best_score", bestScore);
            editor.apply();
        }
        Intent KeEnd = new Intent(getApplicationContext(),Result.class);
        String point = (score+"/"+ totalQuestion);
        KeEnd.putExtra(Key1 , point);
        if (score > totalQuestion*0.60){
            String passStatus = "You Passed!!";
            KeEnd.putExtra("status" , passStatus);
        }else {
            String passStatus = "You Failed";
            KeEnd.putExtra("status" , passStatus);
        }
        String data1= getIntent().getStringExtra("Fname");
        Uri uri1 = (Uri) getIntent().getParcelableExtra("image");
        KeEnd.putExtra("best_score", bestScore);
        KeEnd.putExtra("Fname" , data1);
        KeEnd.putExtra("image" ,uri1);
        startActivity(KeEnd);

    }

}