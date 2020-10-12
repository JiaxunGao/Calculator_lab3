package com.example.calculator_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
<<<<<<< HEAD

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5,button6, button7, button8,
            button9, buttonAdd, buttonSub, buttonDivision, buttonMul, button10, buttonC,
            buttonEqual;
    TextView edttxt;
=======


public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonAdd, buttonSub, buttonDivison, buttonMul, buttonC, buttonEqual;

    TextView text;
    float value1, value2;
    boolean add, sub, div, mul;

>>>>>>> 8725310079ef799c19d6f24d4c552dfdb04d466c
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //constract buttons and the other elements here, name are given above//

        button1.setOnClickListener((v)->{
            text.setText(text.getText() + "1");
        });

        button2.setOnClickListener((v)->{
            text.setText(text.getText() + "2");
        });

        button3.setOnClickListener((v)->{
            text.setText(text.getText() + "3");
        });

        button4.setOnClickListener((v)->{
            text.setText(text.getText() + "4");
        });

        button5.setOnClickListener((v)->{
            text.setText(text.getText() + "5");
        });

        button6.setOnClickListener((v)->{
            text.setText(text.getText() + "6");
        });

        button7.setOnClickListener((v)->{
            text.setText(text.getText() + "7");
        });

        button8.setOnClickListener((v)->{
            text.setText(text.getText() + "8");
        });

        button9.setOnClickListener((v)->{
            text.setText(text.getText() + "9");
        });

        button0.setOnClickListener((v)->{
            text.setText(text.getText() + "0");
        });

        buttonC.setOnClickListener(new View.OnClickListener(){
                public void onClick (View v){
                    text.setText("");
                    add=false;
                    sub=false;
                    div=false;
                    mul=false;
                    value1=0;
                    value2=0;
                }}
        );

        

    }

}