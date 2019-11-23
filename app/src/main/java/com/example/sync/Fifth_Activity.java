package com.example.sync;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Fifth_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_);

    }

    public void change4(View view) {

        Button btn = (Button) findViewById(R.id.buttonn3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Fifth_Activity.this, Sixth_Activity.class);
                startActivity(i);
            }
        });

    }

    public void change0(View view) {
        ImageButton bt2 = (ImageButton) findViewById(R.id.imageButtonn2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer ring = MediaPlayer.create(Fifth_Activity.this, R.raw.song1);
                if(ring.isPlaying())
                {
                    ring.pause();
                }
                else
                {
                    ring.start();
                }
            }
        });
    }

    public void forward(View view) {
        ImageButton bt2 = (ImageButton) findViewById(R.id.imageButton11);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer ring = MediaPlayer.create(Fifth_Activity.this, R.raw.song1);

                if(ring.isPlaying())
                {
                    ring.stop();
                    ring.seekTo(10000);
                }
                else
                {
                    ring.seekTo(10000);
                    ring.start();
                }
            }
        });
    }

    public void Reverse(View view) {
        ImageButton bt2 = (ImageButton) findViewById(R.id.imageButton31);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer ring = MediaPlayer.create(Fifth_Activity.this, R.raw.song1);
                if(ring.isPlaying())
                {
                    ring.pause();
                    ring.seekTo(-10000);
                }
                else
                {
                    ring.seekTo(0);
                    ring.start();
                }
            }
        });
    }
}
