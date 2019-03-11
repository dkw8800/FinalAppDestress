package com.example.myapplication;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public static String[] quiz = {"Ready to start the quiz!", "Which of the following have you done to relieve stress?","How effective would you say these are?","What is/are the cause(s) of your stress?","What is your diet like?","What is your exercise routine?"};
    public static String[][] answers = {{"yes","no"},{"mc","watch videos","play games","talk with someone","eat","listen to music","sleep","physical activity","other"},{"rating"},{"School/Work", "Major life change(s)/Traumatic Events","Relationship difficulties", "Emotional problems"},{"Healthy","Average","Unhealthy"},{"over 60 minutes","60 minutes","30 minutes","less than 30 minutes"}};
    public static int questnum;
    public boolean quiztest = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

       //final Button setupquestion = findViewById(R.id.setupquestion);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //read answers from old answerbox, all possible answers return > 0 but first starter is 0 automatically
                //Textview Answerbox = new TextView, is there a wawy to have checkboxes
                //setanswers with questnum, move to below question
                ((TextView) findViewById(R.id.welcomemess)).setTextSize(18);
                findViewById(R.id.welcomemess).setX(100);
                findViewById(R.id.welcomemess).setY(100);
                ((TextView) findViewById(R.id.welcomemess)).setText(quiz[questnum]);
                //****bug i need help fixing - ready to start the quiz shows up in a location idk where its set MAKE LAYOUT FIT TO PHONE
                questnum++;
                //check how to look at the app again
            }
        });

    }



    public void checkisdone()
    {
        if(quiztest == false)
        {
            MainActivity.starttutorial();
            finish();
        }
    }

    public void addanswers()
    {
        questnum++;
        ((TextView)findViewById(R.id.welcomemess)).setText(quiz[questnum]);
        for(int i = 0; i < answers.length;i++)
        {
            for (int k = 0; k < answers[i][k].length();k++)
            {
                System.out.println(answers[i][k]);
            }
        }
        //increment the value, questions are in an array.
        //MULTIWINDOWMODE OR CONSTRAINT LAYOUT KEEP LAYOUT CONSTANT ON DIFFERENT PHONES
    }



}