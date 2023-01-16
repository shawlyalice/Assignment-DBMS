package com.xiaoly.convertex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
    }
    public void nextPage3(View view){
        Intent intent = new Intent(this,AbsoluteActivity.class);
        startActivity(intent);
    }
}
