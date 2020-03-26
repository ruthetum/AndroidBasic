package com.example.buttonlistener2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button.OnClickListener myClick = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.b1:
                        Toast.makeText(getApplicationContext(), "Seoul", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.b2:
                        Toast.makeText(getApplicationContext(), "London", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };

        findViewById(R.id.b1).setOnClickListener(myClick);
        findViewById(R.id.b2).setOnClickListener(myClick);

    }
}
