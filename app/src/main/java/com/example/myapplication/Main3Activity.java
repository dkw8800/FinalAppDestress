package com.example.myapplication;
//testing fab
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
/*    @Override
    *//*testing*//*
            FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    fab1 = (FloatingActionButton) findViewById(R.id.fab1);
    fab2 = (FloatingActionButton) findViewById(R.id.fab2);
    fab3 = (FloatingActionButton) findViewById(R.id.fab3);
    fab.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(!isFABOpen){
                showFABMenu();
            }else{
                closeFABMenu();
            }
        }
    });

    private void showFABMenu(){
        isFABOpen=true;
        fab1.animate().translationY(-getResources().getDimension(R.dimen.standard_55));
        fab2.animate().translationY(-getResources().getDimension(R.dimen.standard_105));
        fab3.animate().translationY(-getResources().getDimension(R.dimen.standard_155));
    }

    private void closeFABMenu(){
        isFABOpen=false;
        fab1.animate().translationY(0);
        fab2.animate().translationY(0);
        fab3.animate().translationY(0);
    }


    <android.support.design.widget.FloatingActionButton
    android:id="@+id/fab3"
    android:layout_width="@dimen/standard_45"
    android:layout_height="@dimen/standard_45"
    android:layout_gravity="bottom|end"
    android:layout_margin="@dimen/standard_21"
    app:srcCompat="@android:drawable/ic_btn_speak_now" />

    <android.support.design.widget.FloatingActionButton
    android:id="@+id/fab2"
    android:layout_width="@dimen/standard_45"
    android:layout_height="@dimen/standard_45"
    android:layout_gravity="bottom|end"
    android:layout_margin="@dimen/standard_21"
    app:srcCompat="@android:drawable/ic_menu_camera" />

    <android.support.design.widget.FloatingActionButton
    android:id="@+id/fab1"
    android:layout_width="@dimen/standard_45"
    android:layout_height="@dimen/standard_45"
    android:layout_gravity="bottom|end"
    android:layout_margin="@dimen/standard_21"
    app:srcCompat="@android:drawable/ic_dialog_map" />

    <android.support.design.widget.FloatingActionButton
    android:id="@+id/fab"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_gravity="bottom|end"
    android:layout_margin="@dimen/fab_margin"
    app:srcCompat="@android:drawable/ic_dialog_email" />



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton floatingActionButton = findViewById(R.id.fab_1);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main3Activity.this, "FAB clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    };*/
}