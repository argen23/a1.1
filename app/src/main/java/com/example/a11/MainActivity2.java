package com.example.a11;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity {
    private Button button;
    private TextView tv;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = findViewById(R.id.tv);
        String text = getIntent().getStringExtra(MainActivity3.TEXT);
        tv.setText(text);
        button = findViewById(R.id.go);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
            startActivityForResult(intent,1);
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            String result = data.getStringExtra("text");
            tv.setText(result);
        }
    }
}
