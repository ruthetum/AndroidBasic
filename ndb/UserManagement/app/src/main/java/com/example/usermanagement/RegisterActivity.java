package com.example.usermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText idText = (EditText) findViewById(R.id.idText);
        EditText pwText = (EditText) findViewById(R.id.pwText);
        EditText pwCheckText = (EditText) findViewById(R.id.pwCheckText);
        EditText nameText = (EditText) findViewById(R.id.nameText);
        Button registerBtn = (Button) findViewById(R.id.registerBtn);

    }
}
