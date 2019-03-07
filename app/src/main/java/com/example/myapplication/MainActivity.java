package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static String[] quiz = {"Ready to start the quiz!", "What are your ...","WDDDGH"};
    public static String[][] answers = {{"yes","no"},{"pink"}};
    public static int questnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        final Button changewords = findViewById(R.id.changewords);
        changewords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView)findViewById(R.id.welcomemess)).setText("Our goal is to help you de-stress through ___. Before we start, we’ll have you take a quiz so we can __.");
                ((TextView)findViewById(R.id.welcomemess)).setTextSize(30);
               // changewords.setOnClickListener(new View.OnClickListener() {
                    //@Override
                    //public void onClick(View view) {
                        //((TextView)findViewById(R.id.welcomemess)).setText("Thank you! Let's head to the home screen.");
                        //startActivity(new Intent(MainActivity.this,Main2Activity.class)); }
                //This starts a new activity; since finish() closes the mainactivity i wanted to try something else. i can change this activity to the home screen after the quiz is done.
                //super.onBackPressed() should work better than finish() for an activity
                //}
                changewords.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //read answers from old answerbox, all possible answers return > 0 but first starter is 0 automatically
                        //Textview Answerbox = new TextView, is there a wawy to have checkboxes
                        //setanswers with questnum, move to below question
                        ((TextView)findViewById(R.id.welcomemess)).setTextSize(18);
                        findViewById(R.id.welcomemess).setX(100);
                        findViewById(R.id.welcomemess).setY(100);
                        ((TextView)findViewById(R.id.welcomemess)).setText(quiz[questnum]);
                        //****bug i need help fixing - ready to start the quiz shows up in a location idk where its set and i want to change it to match where the next questions will be

                        questnum++;
                    }
                });
                }
        });
        changewords.setText("Tap Here");
        changewords.setX(350);
        changewords.setY(1300);
}



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void changetext(View view)
    {
        ((TextView)findViewById(R.id.welcomemess)).setText("You dont suck that much");
    }

    protected void startquiz(Button starter)
    {
        starter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ((TextView)findViewById(R.id.welcomemess)).setText(quiz[questnum]);
                for(int i = 0; i < answers.length;i++)
                {
                    for (int k = 0; k < answers[i][k].length();k++)
                    {
                        System.out.println(answers[i][k]);
                    }
                }
                //increment the value, questions are in an array.
            }
        });
    }
}
