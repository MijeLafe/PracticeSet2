package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView (this);
        textView.setText("Hello");
        textView.setTextColor(getResources().getColor(android.R.color.black));
        textView.setTextSize(40);
        setContentView(textView);
    }
}
