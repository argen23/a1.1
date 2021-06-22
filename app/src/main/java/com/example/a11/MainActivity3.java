package com.example.a11;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    private EditText et;
    public static final String TEXT = "text";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        et = findViewById(R.id.et_num);
        findViewById(R.id.change_btn).setOnClickListener(v -> {
            Intent intent = new Intent();
            String text = et.getText().toString();
            if (!text.isEmpty()) {
                intent.putExtra("text", text);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }


}