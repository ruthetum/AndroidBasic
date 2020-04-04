package com.example.parcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Intent passedIntent = getIntent();
        processIntent(passedIntent);
    }

    private void processIntent(Intent intent) {
        if (intent != null) {
            // ArrayList는 Serializable을 implemetable 하기 때문에 가능
            ArrayList<String> names = (ArrayList<String>) intent.getSerializableExtra("names");
            if (names != null) {
                Toast.makeText(getApplicationContext(), "전달받은 이름 리스트 갯수 : " +names.size(), Toast.LENGTH_LONG).show();
            }

            SimpleData data = (SimpleData) intent.getParcelableExtra("data");
            if (data != null) {
                Toast.makeText(getApplicationContext(), "전달받은 SimpleData 갯수 : " +data.message, Toast.LENGTH_LONG).show();
            }
        }
    }
}
