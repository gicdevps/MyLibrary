package com.example.mylibrarytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        Toast.makeText(getApplicationContext(),"Toast",Toast.LENGTH_SHORT).show();
    }
}
