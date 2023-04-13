package com.example.lab11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class First extends AppCompatActivity {

    EditText textBox;
    Button passButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        textBox = (EditText) findViewById(R.id.textBox);
        passButton = (Button) findViewById(R.id.passButton);

        passButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textBox.getText().toString();

                Intent intent = new Intent(getApplicationContext(), Second.class);
                intent.putExtra("message", str);

                startActivity(intent);
            }
        });
    }
}
