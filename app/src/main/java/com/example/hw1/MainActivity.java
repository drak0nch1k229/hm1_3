package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText etEmail,etTheme, etText;
    private String email,theme, enterText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       initView();
       initListener();
    }

    private void initView(){
        etEmail = findViewById(R.id.et_email);
        etTheme = findViewById(R.id.et_theme);
        etText = findViewById(R.id.et_text2);
        button = findViewById(R.id.et_button);
    }

    private void initListener(){
        button.setOnClickListener(view ->{
            email=etEmail.getText().toString();
            theme=etTheme.getText().toString();
            enterText=etText.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_EMAIL,new String[]{email});
            intent.putExtra(Intent.EXTRA_SUBJECT, theme);
            intent.putExtra(Intent.EXTRA_TEXT, enterText);
            intent.setType("plain/text");
            startActivity(intent);

        });
    }
}