package com.example.lifeincity_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edName, edSecName, edEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        edName = findViewById(R.id.edName);
        edSecName = findViewById(R.id.edSecName);
        edEmail = findViewById(R.id.edEmail);
    }

    public void onClickSave(View view){

    }

    public void onClickRead(View view){

    }
}
