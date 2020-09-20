package com.example.myassignment;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Triangle extends AppCompatActivity {

    EditText Ma1; //Defining Edittext
    EditText Mb1;
    EditText Mc1;
    EditText Mresult;
    Button Mbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        Ma1 = (EditText) findViewById(R.id.a1); //Assigning ID's to get Inputs
        Mb1 = (EditText) findViewById(R.id.b1);
        Mc1 = (EditText) findViewById(R.id.c1);

        Mresult = (EditText) findViewById(R.id.Result);

        Mbutton = (Button) findViewById(R.id.butt1);

        Mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calculation();
                //Toast.makeText(Triangle.this, "Check Triangle Diagram and enter values", Toast.LENGTH_LONG).show();
            }
        });
    }


    public void Calculation(){ //Class to find all the Triangles

        if((Ma1.getText().toString().equals( Mb1.getText().toString())) && (Mb1.getText().toString().equals( Mc1.getText().toString())))
        {

            Mresult.setText("Equilateral Triangle");
        }
        else if((Ma1.getText().toString().equals( Mc1.getText().toString())) && (!(Mb1.getText().toString()).equals( Mc1.getText().toString()))){

            Mresult.setText("Isosceles Triangle");

        }

        else {
            Mresult.setText("Scalene Triangle");
        }



    }


}
