package com.example.sync;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.UploadTask;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class user{


    String userId = "";
    String name = "";
    Integer ID = 0;

    public user() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public user(String username, String email) {
        this.name = username;
        this.userId = email;
    }
}


public class MainActivity extends AppCompatActivity {


    private MediaPlayer mMediaplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_screen);



    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);

    }

    public void onClick(View view) {

        Button btn = (Button)findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),SignIn_Activitiy.class);
                startActivity(i);
            }
        });

    }

    public void onClick2(View view) {

        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),SignUp_Activity.class);
                startActivity(i);
            }
        });
    }



//    public void change(View view) {
//
//            Button btn = (Button)findViewById(R.id.button3);
//            btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent i = new Intent(SignIn_Activitiy.this, Fourth_Activity.class);
//                    startActivity(i);
//                }
//            });
//
//        }
}
