package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 액션바 삭제 방법 2가지
        // 1. values - styles.xml에서 DarkActionBar를 NoActionBar로 바꾸기
        // 2. 1처럼 안 했을 경우 밑에 방법처럼
//        ActionBar abar = getSupportActionBar();
//        abar.hide();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int curId = item.getItemId();
        switch(curId){
            case R.id.menu_refresh:
                Toast.makeText(this, "새로 고침 메뉴 클릭", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_search:
                Toast.makeText(this, "검색 메뉴 클릭", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_settings:
                Toast.makeText(this, "설정 메뉴 클릭", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}
