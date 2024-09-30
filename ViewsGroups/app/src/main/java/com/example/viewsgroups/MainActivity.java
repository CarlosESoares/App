package com.example.viewsgroups;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout linerarlayout = new LinearLayout(this);

        Button b = new Button(this);

        b.setText("bla");
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.VERTICAL
        );

        linerarlayout.setLayoutParams(params);
                linerarlayout.addView(b);
                setContentView(linerarlayout);

    }
}