package com.example.conversionkareemalexisversion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button conversionMile;
    EditText inputMile;
    TextView textView1, textView6;
    ImageView imageView;
    double miles, kilometers, getMilesConverted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputMile =(EditText) findViewById(R.id.milesInput);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView6 = (TextView) findViewById(R.id.convertResult);
        conversionMile = (Button) findViewById(R.id.convertButton);
        imageView = (ImageView) findViewById(R.id.imageView3);


    }
    public void titleOfApp(View view)
    {

        TextView textView = findViewById(R.id.textView1);
    }

    public void nameImage (View view)
    {

        imageView.setImageResource(R.drawable.myname);
    }

    private void convertMileToKilometer()
    {
        String milesEntered = inputMile.getText().toString();
        double convertedMile = Double.parseDouble(milesEntered);
        double fromMilesToKilometer = convertedMile * 1.609;
        textView6.setText(" " +fromMilesToKilometer + " miles");



    }

    public void convertMiles(View view)
    {
        convertMileToKilometer();
    }


}