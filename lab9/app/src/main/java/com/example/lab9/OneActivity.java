package com.example.lab9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OneActivity extends AppCompatActivity {

    TextView question1;

    Button next_Activity_button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneactivity);

        next_Activity_button = (Button)findViewById(R.id.first_activity_button);
        question1 = (TextView)findViewById(R.id.question1_id);
        question1.setText("Q1) How to pass the data between activity in android?\n"+
                "\n"
            +"Ans- Intent");

        next_Activity_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OneActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }
}
