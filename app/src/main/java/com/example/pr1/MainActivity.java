package com.example.pr1;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "start", Toast.LENGTH_SHORT).show();
        Log.e("TAG", "onCreateError");
        Log.i("TAG", "onCreateInfo");
        Log.w("TAG", "onCreateWarning");
        Log.v("TAG", "onCreateVerbose");
        Log.d("TAG", "onCreateDebug");

        ImageView image = findViewById(R.id.imageView1);
        image.setImageResource(R.drawable.group1);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        TextView text = findViewById(R.id.textView1);
        text.setText("Clothing store");

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("TAG", "Программное нажатие на кнопку");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityToMain2(view);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick(view);
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(this, "start", Toast.LENGTH_SHORT).show();
        Log.e("TAG", "onStartError");
        Log.i("TAG", "onStartInfo");
        Log.w("TAG", "onStartWarning");
        Log.v("TAG", "onStartVerbose");
        Log.d("TAG", "onStartDebug");
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(this, "start", Toast.LENGTH_SHORT).show();
        Log.e("TAG", "onResumeError");
        Log.i("TAG", "onResumeInfo");
        Log.w("TAG", "onResumeWarning");
        Log.v("TAG", "onResumeVerbose");
        Log.d("TAG", "onResumeDebug");
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(this, "start", Toast.LENGTH_SHORT).show();
        Log.e("TAG", "onResumeError");
        Log.i("TAG", "onResumeInfo");
        Log.w("TAG", "onResumeWarning");
        Log.v("TAG", "onResumeVerbose");
        Log.d("TAG", "onResumeDebug");
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(this, "start", Toast.LENGTH_SHORT).show();
        Log.e("TAG", "onStopError");
        Log.i("TAG", "onStopInfo");
        Log.w("TAG", "onStopWarning");
        Log.v("TAG", "onStopVerbose");
        Log.d("TAG", "onStopDebug");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "start", Toast.LENGTH_SHORT).show();
        Log.e("TAG", "onDestroyError");
        Log.i("TAG", "onDestroyInfo");
        Log.w("TAG", "onDestroyWarning");
        Log.v("TAG", "onDestroyVerbose");
        Log.d("TAG", "onDestroyDebug");
    }
    public void onClick(View view) {
        Log.i("TAG", "Декларативное нажатие на кнопку");
    }
    public void startActivityToMain2(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("hello", "hello world");
        mStartForResult.launch(intent);
    }
    ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Intent intent = result.getData();
                    Log.i("TAG", intent.getStringExtra("hello"));
                }
            });

}