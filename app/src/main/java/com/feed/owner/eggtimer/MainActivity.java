package com.feed.owner.eggtimer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar timerSeekBar = (SeekBar)findViewById(R.id.seekBar);

        timerSeekBar.setMax(600);
        timerSeekBar.setProgress(30);
    }
}
