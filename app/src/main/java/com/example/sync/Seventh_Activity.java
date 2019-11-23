package com.example.sync;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seventh_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh_);
    }

    public void change6(View view) {

        Button btn = (Button)findViewById(R.id.buttonn5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Seventh_Activity.this, Fifth_Activity.class);
                startActivity(i);
            }
        });

    }

    public void Chatting(View view) {

        Button btn = (Button)findViewById(R.id.button14);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Seventh_Activity.this, Chat.class);
                startActivity(i);
            }
        });

    }
}
