package com.example.sync;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn_Activitiy extends AppCompatActivity {

    EditText et_email;
    EditText et_password;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in__activitiy);


        et_email=(EditText)findViewById(R.id.screen2_email);
        et_password=(EditText)findViewById(R.id.screen2_pass);
        btn=(Button)findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String validemail = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +

                        "\\@" +

                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +

                        "(" +

                        "\\." +

                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +

                        ")+";


                String email = et_email.getText().toString();
                String Pass = et_password.getText().toString();

                Matcher matcher= Pattern.compile(validemail).matcher(email);
                Matcher matcher2= Pattern.compile("123456").matcher(Pass);


                if (matcher.matches() && matcher2.matches()){
                    Toast.makeText(getApplicationContext(),"True",Toast.LENGTH_LONG).show();
                    change(view);


                }
                else {

                    Toast.makeText(getApplicationContext(),"Enter Valid Details!",Toast.LENGTH_LONG).show();
                }

            }
        });

    }


    public void change(View view) {

        Button btn = (Button)findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignIn_Activitiy.this, Fourth_Activity.class);
                //Toast.makeText(SignIn_Activitiy.this, b1.getText(), Toast.LENGTH_LONG).show();
                startActivity(i);
            }
        });

    }




}
