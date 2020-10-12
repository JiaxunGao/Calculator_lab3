package com.example.calculator_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonAdd, buttonSub, buttonDivision, buttonMul, buttonC, buttonEqual;

    TextView text;
    float value1, value2;
    boolean add, sub, div, mul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //construct buttons and the other elements here, name are given above//

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

        buttonC.setOnClickListener(new View.OnClickListener()){
                public void onClick (View v){
                    text.setText("");
                    add=false;
                    sub=false;
                    div=false;
                    mul=false;
                    value1=0;
                    value2=0;
                }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (text == null) {
                    text.setText("");
                } else {
                    value1 = Float.parseFloat(text.getText() + "");
                    add = true;
                    text.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(text.getText() + "");
                sub = true;
                text.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(text.getText() + "");
                mul = true;
                text.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(text.getText() + "");
                div = true;
                text.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Float.parseFloat(text.getText() + "");

                if (add == true) {
                    text.setText(value1 + value2 + "");
                    add = false;
                }

                if (sub == true) {
                    text.setText(value1 - value2 + "");
                    sub = false;
                }

                if (mul == true) {
                    text.setText(value1 * value2 + "");
                    mul = false;
                }

                if (div == true) {
                    text.setText(value1 / value2 + "");
                    div = false;
                }
            }
        });



        

    }

}