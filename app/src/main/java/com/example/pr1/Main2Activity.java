package com.example.pr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("hello").toString();
        Button button = findViewById(R.id.button_rl_layout);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setResult(0, getIntent());

                finish();
            }
        });
    }
}