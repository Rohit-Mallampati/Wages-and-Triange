package com.example.myassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Payment extends AppCompatActivity {

    EditText Mwages;
    EditText MregHr;
    EditText MovtHr;
    EditText Moutput;
    Button McalPay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Mwages = (EditText) findViewById(R.id.wages); //Assigning ID's to get Inputs
        MregHr = (EditText) findViewById(R.id.RegHr);
        MovtHr = (EditText) findViewById(R.id.OvtHr);
        Moutput = (EditText) findViewById(R.id.Output);

        McalPay = (Button) findViewById(R.id.CalPay);
        McalPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });
    }

    public void calculate(){
        Double wag = Double.parseDouble(Mwages.getText().toString()); // Converting Input into Double
        Double ReHr = Double.parseDouble(MregHr.getText().toString());
        Double OvHr = Double.parseDouble(MovtHr.getText().toString());

        //Calculation for pay

        Double me1 = 1.5 * wag;
        Double me2 = wag * ReHr;
        Double OvtPay = OvHr * me1;

        Double Final = me2 + OvtPay;

        //Print output

        Moutput.setText(Final.toString());
    }
}
