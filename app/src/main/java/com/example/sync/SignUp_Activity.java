package com.example.sync;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUp_Activity extends AppCompatActivity {

    EditText email;
    EditText password;
    EditText password2;
    Button btnn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_);

        email=(EditText)findViewById(R.id.Eemail);
        password=(EditText)findViewById(R.id.password);
        password2=(EditText)findViewById(R.id.confirmPass);
        btnn=(Button)findViewById(R.id.buttonn3);

        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String validemail = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +

                        "\\@" +

                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +

                        "(" +

                        "\\." +

                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +

                        ")+";


                String email2 = email.getText().toString();
                String Pass = password.getText().toString();
                String Pass2 = password2.getText().toString();

                Matcher matcher= Pattern.compile(validemail).matcher(email2);
                Matcher matcher2= Pattern.compile(Pass).matcher(Pass2);


                if (matcher.matches() && matcher2.matches()){
                    Toast.makeText(getApplicationContext(),"True",Toast.LENGTH_LONG).show();
                    change2(view);


                }
                else {

                    Toast.makeText(getApplicationContext(),"Enter Valid Details!",Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    public void change2(View view) {

        Button btn = (Button)findViewById(R.id.buttonn3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignUp_Activity.this, Fourth_Activity.class);
                startActivity(i);
            }
        });

    }
}
