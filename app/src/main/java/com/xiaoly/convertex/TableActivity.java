package com.xiaoly.convertex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
    }
    public void nextPage2(View view){
        Intent intent = new Intent(this,FrameActivity.class);
        startActivity(intent);
    }
}
