package com.example.myapplication;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
//next friday
public class QuizActivity extends AppCompatActivity {
    public static String[] quiz = {"Which of the following have you done to relieve stress?", "How effective would you say these are?", "What is/are the cause(s) of your stress?", "What is your diet like?", "What is your exercise routine?", "How often do you get mad?"};
    public static String[][] answers = {{"yes", "no"}, {"multi", "watch videos", "play games", "talk with someone", "eat", "listen to music", "sleep", "physical activity", "other"}, {"single", "1","2","3","4","5"}, {"multi", "School/Work", "Major life change(s)", "Traumatic Events", "Relationship difficulties", "Emotional problems", "Other"}, {"single", "Healthy", "Average", "Unhealthy"}, {"single", "over 60 minutes", "60 minutes", "30 minutes", "less than 30 minutes"}};
    public static int questnum;
    public boolean quiztest = true;
    public String selectedanswers[][];

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
                Snackbar.make(view, "Please select an answer choice", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final ViewGroup answerchoices = (ViewGroup) findViewById(R.id.answerlist);
        Button qbutton = findViewById(R.id.qbutton);
        //final Button setupquestion = findViewById(R.id.setupquestion);
        qbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //read answers from old answerbox, all possible answers return > 0 but first starter is 0 automatically
                //Textview Answerbox = new TextView, is there a wawy to have checkboxes
                //setanswers with questnum, move to below question
                //recordanswers();
                ((TextView) findViewById(R.id.quizquestions)).setText(quiz[questnum]);
                //****bug i need help fixing - ready to start the quiz shows up in a location idk where its set MAKE LAYOUT FIT TO PHONE
                questnum++;
                //check how to look at the app again
                //app src main res layout activitymain2.xml
                //dont touch contentmainxml thats the layout and things added here cannot be moved in scenebuilder or worked with well

                answerchoices.removeAllViews();
                if(questnum != 0 && answers[questnum][0].equals("multi")) {
                    listanswersascheckboxes(answerchoices);
                }
                else if (questnum != 0 && answers[questnum][0].equals("single"))
                {
                    listanswersasradiobuttons(answerchoices);
                }
                else
                {
                    //ratingquestion(answerchoices);
                    return;
                }
                //for questnum 2 repeat value rating options for every answer they give from questnum 1 maybe dropdown checkbox instead
            }
        });


    }

    public void listanswersasradiobuttons(ViewGroup answerchoices) {
        // This is the id of the RadioGroup we defined
        if (answers[questnum][0].equals("multi")) {
        }
        for (int i = 1; i < answers[questnum].length; i++) {
            final RadioButton button = new RadioButton(this);
            button.setId(i);
            button.setText(answers[questnum][i]);
            int k = 0;
            button.setTag(k + questnum);
            final int[] val = {(int) button.getTag()};
            answerchoices = (ViewGroup) findViewById(R.id.answerlist);
            answerchoices.addView(button);
            //fixed problem with button selection by changing id num
        }
    }

    public void listanswersascheckboxes(ViewGroup answerchoices) {
        // This is the id of the RadioGroup we defined
        if (answers[questnum][0].equals("multi")) {
        }
        for (int i = 1; i < answers[questnum].length; i++) {
            CheckBox button = new CheckBox(this);
            button.setId(0);
            button.setText(answers[questnum][i]);
            int k = 0;
            button.setTag(k + questnum);
            answerchoices.addView(button);
        }
        //for (int i = 0; i < 1; i++) {
        //   RadioButton button1 = new RadioButton(this);
        //   button1.setId(i); //id has to be a number, text has to be a string, work with values
        //   button1.setText(i);
        //   answerchoices.addView(button1);
        //}
        //creates new button without above thing, something is off
        //answers[questnum][answers[questnum].length-1].length()
    }

    public void listanswersasdropdowns(ViewGroup answerchoices) {
        // need to change this into spinner for dropdown
        if (answers[questnum][0].equals("multi")) {
        }
        for (int i = 1; i < answers[questnum].length; i++) {
            final RadioButton button = new RadioButton(this);
            button.setId(i);
            button.setText(answers[questnum][i]);
            int k = 0;
            button.setTag(k + questnum);
            final int[] val = {(int) button.getTag()};
            answerchoices = (ViewGroup) findViewById(R.id.answerlist);
            answerchoices.addView(button);
            //create a spinner per response
        }
    }

    //public void ratingquestion(ViewGroup answerchoices){ If we want to change that one question to set to be a sliding question or something}

    public void recordanswers(ViewGroup answerchoices)
    {
        //for( View v: answerchoices)
       // {
         //  if(v.isChecked())
         // {
         //     selectedanswers[questnum][i].add(v.getText());
          //}
       // }
    }

    public void checkisdone() {
        if (quiztest == false) {
            MainActivity.starttutorial();
            finish();
            //does this close this activity or whole app?
            //activity -cindy
        }
    }

    //public void addanswers() has been moved to quiz
    //{ questnum++;((TextView)findViewById(R.id.welcome)).setText(quiz[questnum]);for(int i = 0; i < answers.length;i++) { for (int k = 0; k < answers[i][k].length();k++) { System.out.println(answers[i][k]); } }
    //increment the value, questions are in an array.
    //MULTIWINDOWMODE OR CONSTRAINT LAYOUT KEEP LAYOUT CONSTANT ON DIFFERENT PHONES
    //THOUSANDSANDTHOUSANDSOFEYESJUSTLIKEMINEDADAADA
    //}


}

