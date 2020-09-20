package com.example.myassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Payment;
    private Button Triangle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Payment = (Button) findViewById(R.id.Payment);
        Payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });

        Triangle = (Button) findViewById(R.id.Triangle);
        Triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }

    public void openActivity1(){
        Intent intent1 = new Intent(this, Payment.class);
        startActivity(intent1);
    }

    public void openActivity2(){
        Intent intent2 = new Intent(this, Triangle.class);
        startActivity(intent2);
    }
}
