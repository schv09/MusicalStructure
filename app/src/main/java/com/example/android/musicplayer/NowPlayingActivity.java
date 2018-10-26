package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        //Find Music Library Button
        Button musicLibraryButton = (Button) findViewById(R.id.music_library_button);

        //Set OnClickListener to open the MusicLibraryActivity
        musicLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NowPlayingActivity.this, MusicLibraryActivity.class);
                startActivity(i);
            }
        });
    }
}
