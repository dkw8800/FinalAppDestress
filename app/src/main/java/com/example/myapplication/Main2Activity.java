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
    public static String[] quiz = {"placeholder to make it simpler", "What are your ...","WDDDGH"};
    public static String[][] answers = {{"yes","no"},{"pink"}};
    public static int questnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button startq = findViewById(R.id.fab);
        startq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    protected void startquiz(Button starter)
    {
        starter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
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
            }
        });
    }



}
