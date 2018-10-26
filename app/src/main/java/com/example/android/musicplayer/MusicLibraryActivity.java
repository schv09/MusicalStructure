package com.example.android.musicplayer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        //Find Search Button
        Button searchButton = (Button) findViewById(R.id.search_button);

        //Set OnClickListener to open the NowPlayingActivity
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MusicLibraryActivity.this, SearchActivity.class);
                startActivity(i);
            }
        });

        //Find Now Playing Button
        Button nowPlayingButton = (Button) findViewById(R.id.now_playing_button);

        //Set OnClickListener to open the NowPlayingActivity
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MusicLibraryActivity.this, NowPlayingActivity.class);
                startActivity(i);
            }
        });

        //Find Recent Activity Button
        Button recentActivityButton = (Button) findViewById(R.id.recent_activity_button);

        //Set OnClickListener to open the MainActivity
        recentActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MusicLibraryActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        //Find Shop Button
        Button shopButton = (Button) findViewById(R.id.shop_button);

        //Set OnClickListener to open the Google Play Store Music section
        shopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://play.google.com/store/music?hl=en";
                Uri webpage = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW, webpage);
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
            }
        });
    }
}
