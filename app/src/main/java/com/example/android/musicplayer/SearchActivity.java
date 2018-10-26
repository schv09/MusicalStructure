package com.example.android.musicplayer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

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
