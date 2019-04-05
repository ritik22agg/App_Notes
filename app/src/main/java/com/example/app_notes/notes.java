package com.example.app_notes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class notes extends AppCompatActivity {


    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        editText = findViewById(R.id.notes);

        if(MainActivity.list.get(0) == "Example Note"){
            String s  = editText.getText().toString();
            MainActivity.list.set(0, s);
            MainActivity.arrayAdapter.notifyDataSetChanged();
        }else{
            String s  = editText.getText().toString();
            MainActivity.list.add(s);
            MainActivity.arrayAdapter.notifyDataSetChanged();
        }
    }
}
