package com.example.app_notes;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class notes extends AppCompatActivity {


    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);


        editText = findViewById(R.id.text);
        Intent intent = getIntent();

        int noteid = intent.getIntExtra("noteid", -1);


        if(noteid == -1){
            editText.setText(MainActivity.list.get(noteid));
        }


    }
}
