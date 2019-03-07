package com.example.saimon.reshebnic.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.saimon.reshebnic.R;

public class BookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        getSupportActionBar().setTitle("Setting");
    }
}
