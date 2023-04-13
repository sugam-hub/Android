package com.example.lab7;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class lab7 extends Activity {
    Button btn;
    TextView tView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab7events);
        btn = (Button)findViewById(R.id.btnClick);
        tView = (TextView) findViewById(R.id.txtResult);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tView.setText("You clicked the button.");
            }
        });
    }
}
