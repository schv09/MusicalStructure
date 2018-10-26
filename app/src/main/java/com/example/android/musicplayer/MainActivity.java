package com.example.android.musicplayer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find See All Playlists Button
        Button seeAllPlaylists = (Button) findViewById(R.id.see_all_playlists_button);

        //Set OnClickListener to open the MusicLibraryActivity
        seeAllPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MusicLibraryActivity.class);
                startActivity(i);
            }
        });

        //Find See All Songs Button
        Button seeAllSongs = (Button) findViewById(R.id.see_all_songs_button);

        //Set OnClickListener to open the MusicLibraryActivity
        seeAllSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MusicLibraryActivity.class);
                startActivity(i);
            }
        });

        //Find Music Library Button
        Button musicLibraryButton = (Button) findViewById(R.id.music_library_button);

        //Set OnClickListener to open the MusicLibraryActivity
        musicLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MusicLibraryActivity.class);
                startActivity(i);
            }
        });

        //Find Now Playing Button
        Button nowPlayingButton = (Button) findViewById(R.id.now_playing_button);

        //Set OnClickListener to open the NowPlayingActivity
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, NowPlayingActivity.class);
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
