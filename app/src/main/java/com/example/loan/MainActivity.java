package com.example.loan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText t1,t2;
    String s1="",s2="",tx="";
    double d=1,i=1,tax=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.bt1);
        t1=(EditText) findViewById(R.id.et1);
        t2=(EditText) findViewById(R.id.et2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    s1=t1.getText().toString();
                    s2=t2.getText().toString();
                d=Double.parseDouble(s1);
                i=Double.parseDouble(s2);
                tax = i*18/100;
                tx=Double.toString(tax);
                Intent intent = new Intent(MainActivity.this, secActivity.class);
                intent.putExtra("tax",tx);
                startActivity(intent);
            }

        });

    }
}
