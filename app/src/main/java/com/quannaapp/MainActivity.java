package com.quannaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 3;
    private Button login;
    private TextView incorrect;
    private EditText Name;
    private EditText Password;
    private TextView incorrectText2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText)findViewById(R.id.userText);
        Password = (EditText) findViewById(R.id.pasText);
        incorrect = (TextView) findViewById(R.id.incorrectText);
        login = (Button) findViewById(R.id.loginButton);
        incorrectText2 = (TextView) findViewById(R.id.incorrectText2);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }
    private void validate (String userName, String userPassword){
        if ((userName.equals("Adi naali")) && (userPassword.equals("ni5499"))){
            Intent intent = new Intent(MainActivity.this, thirdActivity.class);
            startActivity(intent);
        }else{
            counter --;
            incorrectText2.setVisibility(View.VISIBLE);
            if (counter == 0){
                login.setEnabled(false);
                incorrect.setVisibility(View.VISIBLE);

            }
        }
    }
}

