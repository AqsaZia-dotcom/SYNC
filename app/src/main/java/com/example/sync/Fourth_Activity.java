package com.example.sync;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import java.io.File;

public class Fourth_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_);

        String filename = Environment.getExternalStorageDirectory().getAbsolutePath();
        filename += "/song1.3gp";
        Toast.makeText(Fourth_Activity.this, filename, Toast.LENGTH_LONG).show();

        StorageReference storage = FirebaseStorage.getInstance().getReference();
        final ProgressDialog progress = new ProgressDialog(this);

        StorageReference filePath = storage.child("Audio").child("song1.3gp");
        Uri uri = Uri.fromFile(new File(filename));

        filePath.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                progress.dismiss();
                progress.setMessage("Uploaded Successfully!");
            }
        });


    }

    public void change3(View view) {

        Button btn = (Button)findViewById(R.id.button12);
        final ProgressDialog progress = new ProgressDialog(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progress.setMessage("Uploading Audio");
                progress.show();
                Intent i = new Intent(Fourth_Activity.this, Sixth_Activity.class);
                Toast.makeText(Fourth_Activity.this, "Connected", Toast.LENGTH_LONG).show();
                startActivity(i);
            }
        });

    }


}
