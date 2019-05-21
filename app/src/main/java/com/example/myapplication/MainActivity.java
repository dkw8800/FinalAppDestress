package com.example.myapplication;
//app has been committed to only by dwong0023 but stranger's account is always showing up on git for all commits
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //((TextView)findViewById(R.id.welcome)).hide();



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
                ((TextView)findViewById(R.id.welcome)).setText("Our goal is to help you de-stress. Before we start, we’ll have you take a quiz so we can make recommendations.");

                changewords.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ((TextView)findViewById(R.id.welcome)).setText("");
                        //startActivity(new Intent(MainActivity.this,Main2Activity.class));
                        startActivity(new Intent(MainActivity.this,QuizActivity.class));
                    }
                });

            }
        });

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
        ((TextView)findViewById(R.id.welcome)).setText("You dont suck that much");
    }

    public static void starttutorial()
    {
        //((TextView)findViewById(R.id.welcome)).setText("Thank you! Let's head to the home screen.");
    }
}
