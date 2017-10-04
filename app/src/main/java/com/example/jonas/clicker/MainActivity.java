package com.example.jonas.clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increase(View view) {
        TextView tw = (TextView) findViewById(R.id.textView);
        this.counter++;
        tw.setText(String.valueOf(this.counter));
    }
}
