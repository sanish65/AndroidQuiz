package com.example.user.quiznnu;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4;
    TextView textscore,textquestion;
    private Questions mQuestions= new Questions();
    private int mScore=0;
    private String mAnswer;
    private int mQuestionslength=mQuestions.mQuestions.length;
    Random r;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r=new Random();





        btn1=(Button)findViewById(R.id.bttn1);
        btn2=(Button)findViewById(R.id.bttn2);
        btn3=(Button)findViewById(R.id.bttn3);
        btn4=(Button)findViewById(R.id.bttn4);


        textquestion=(TextView)findViewById(R.id.question);
        textscore=(TextView)findViewById(R.id.score);
        textscore.setText("score:"+mScore);


        updateQuestion(r.nextInt(mQuestionslength));


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn1.getText()==mAnswer)
                {
                    mScore++;
                    textscore.setText("score:"+mScore);
                    updateQuestion(r.nextInt(mQuestionslength));
                }
                else
                {
                    gameover();

                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn2.getText()==mAnswer)
                {
                    mScore++;
                    textscore.setText("score:"+mScore);
                    updateQuestion(r.nextInt(mQuestionslength));
                }
                else
                {
                    gameover();

                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn3.getText()==mAnswer)
                {
                    mScore++;
                    textscore.setText("score:"+mScore);
                    updateQuestion(r.nextInt(mQuestionslength));
                }
                else
                {
                    gameover();

                }

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn4.getText()==mAnswer)
                {
                    mScore++;
                    textscore.setText("score:"+mScore);
                    updateQuestion(r.nextInt(mQuestionslength));
                }
                else
                {
                    gameover();

                }

            }
        });
    }

    private void updateQuestion(int num)
    {
        textquestion.setText(mQuestions.getQuestion(num));
        btn1.setText(mQuestions.getChoice0(num));
        btn2.setText(mQuestions.getChoice1(num));
        btn3.setText(mQuestions.getChoice2(num));
        btn4.setText(mQuestions.getChoice3(num));
        mAnswer=mQuestions.getCorrectAnswer(num);

    }




    private void gameover()
    {
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game over!! try again.Score:"+mScore)
                .setCancelable(false)
                .setPositiveButton("Take new Quiz",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                                fileList();

                            }
                        })
                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                finish();


                            }
                        });

        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();


//    AlertDialog alertDialog= alertDialogBuilder.create();
//    alertDialog.show();
    }
}
