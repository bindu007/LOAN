package com.example.loan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class secActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seclay);
        TextView t11=(TextView) findViewById(R.id.textView5);
        Intent i=getIntent();
        String res = i.getStringExtra("tax");
        t11.setText(res);
    }
}
