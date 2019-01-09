package com.example.danielbucci.audioplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClicked(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.pokerchips); // gets the audio file from the raw folder that i created
        mp.start();
    }
}
