package com.example.jonas.clicker;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener{
    public static int counter = 0;
    public TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tts = new TextToSpeech(this, this);
    }

    public void increase(View view) {
        TextView tw = (TextView) findViewById(R.id.textView);
        if(this.counter == Integer.MAX_VALUE)
            this.counter = 0;
        else
            this.counter++;
        tw.setText(String.valueOf(this.counter));
        tts.speak("Go!", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onInit(int status) {
        tts.speak("Welcome", TextToSpeech.QUEUE_FLUSH, null);
    }
}
