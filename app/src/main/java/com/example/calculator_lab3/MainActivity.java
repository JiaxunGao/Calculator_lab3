package com.example.calculator_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10,
            buttonAdd, buttonSub, buttonDivision, buttonMul, buttonC, buttonEqual;

    TextView text;
    float value1, value2;
    boolean add, sub, div, mul;

    protected void resetB() {
        add=false;
        sub=false;
        div=false;
        mul=false;

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        button10 = (Button) findViewById(R.id.btnDec);
        buttonAdd = (Button) findViewById(R.id.btnAdd);
        buttonSub = (Button) findViewById(R.id.btnSub);
        buttonMul = (Button) findViewById(R.id.btnMul);
        buttonDivision = (Button) findViewById(R.id.btnDiv);
        buttonC = (Button) findViewById(R.id.btnClear);
        buttonEqual = (Button) findViewById(R.id.btnEqual);
        text = (TextView) findViewById(R.id.screen);

        //Operation functions  //



        button1.setOnClickListener((v)->{
            if(text.getText() == "ERROR"){
                text.setText("");
            }
            text.setText(text.getText() + "1");
        });

        button2.setOnClickListener((v)->{
            if(text.getText() == "ERROR"){
                text.setText("");
            }
            text.setText(text.getText() + "2");
        });

        button3.setOnClickListener((v)->{
            if(text.getText() == "ERROR"){
                text.setText("");
            }
            text.setText(text.getText() + "3");
        });

        button4.setOnClickListener((v)->{
            if(text.getText() == "ERROR"){
                text.setText("");
            }
            text.setText(text.getText() + "4");
        });

        button5.setOnClickListener((v)->{
            if(text.getText() == "ERROR"){
                text.setText("");
            }
            text.setText(text.getText() + "5");
        });

        button6.setOnClickListener((v)->{
            if(text.getText() == "ERROR"){
                text.setText("");
            }
            text.setText(text.getText() + "6");
        });

        button7.setOnClickListener((v)->{
            if(text.getText() == "ERROR"){
                text.setText("");
            }
            text.setText(text.getText() + "7");
        });

        button8.setOnClickListener((v)->{
            if(text.getText() == "ERROR"){
                text.setText("");
            }
            text.setText(text.getText() + "8");
        });

        button9.setOnClickListener((v)->{
            if(text.getText() == "ERROR"){
                text.setText("");
            }
            text.setText(text.getText() + "9");
        });

        button0.setOnClickListener((v)->{
            if(text.getText() == "ERROR"){
                text.setText("");
            }
            text.setText(text.getText() + "0");
        });

        button10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(text.getText() == "ERROR"||text.getText() == ""){
                    text.setText("");
                }

                text.setText(text.getText() + ".");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
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

            public void onClick(View v) {

                if (text.getText() == ""|| text.getText()== "ERROR") {
                    text.setText("");
                } else {
                    if (add == true) {
                        value1 = value1+Float.parseFloat(text.getText() + "");
                    }

                    else if (sub == true) {
                        value1 = value1-Float.parseFloat(text.getText() + "");
                    }

                    else if (mul == true) {
                        value1 = value1*Float.parseFloat(text.getText() + "");
                    }

                    else if (div == true) {
                        value1 = value1/Float.parseFloat(text.getText() + "");
                    }
                    else{
                        value1 = Float.parseFloat(text.getText() + "");

                    }
                    resetB();
                    add = true;
                    text.setText(null);


                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (text.getText() == ""|| text.getText()== "ERROR") {
                    text.setText("");
                } else {
                    if (add == true) {
                        value1 = value1+Float.parseFloat(text.getText() + "");
                    }

                    else if (sub == true) {
                        value1 = value1-Float.parseFloat(text.getText() + "");
                    }

                    else if (mul == true) {
                        value1 = value1*Float.parseFloat(text.getText() + "");
                    }

                    else if (div == true) {
                        value1 = value1/Float.parseFloat(text.getText() + "");
                    }
                    else{
                        value1 = Float.parseFloat(text.getText() + "");

                    }
                    resetB();
                    sub = true;
                    text.setText(null);


                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (text.getText() == ""|| text.getText()== "ERROR") {
                    text.setText("");
                } else {
                    if (add == true) {
                        value1 = value1+Float.parseFloat(text.getText() + "");
                    }

                    else if (sub == true) {
                        value1 = value1-Float.parseFloat(text.getText() + "");
                    }

                    else if (mul == true) {
                        value1 = value1*Float.parseFloat(text.getText() + "");
                    }

                    else if (div == true) {
                        value1 = value1/Float.parseFloat(text.getText() + "");
                    }
                    else{
                        value1 = Float.parseFloat(text.getText() + "");

                    }
                    resetB();
                    mul = true;
                    text.setText(null);


                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (text.getText() == ""|| text.getText()== "ERROR") {
                    text.setText("");
                } else {
                    if (add == true) {
                        value1 = value1+Float.parseFloat(text.getText() + "");
                    }

                    else if (sub == true) {
                        value1 = value1-Float.parseFloat(text.getText() + "");
                    }

                    else if (mul == true) {
                        value1 = value1*Float.parseFloat(text.getText() + "");
                    }

                    else if (div == true) {
                        value1 = value1/Float.parseFloat(text.getText() + "");
                    }
                    else{
                        value1 = Float.parseFloat(text.getText() + "");

                    }
                    resetB();
                    div = true;
                    text.setText(null);


                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (text.getText()== "" || text.getText()== "ERROR" ) {
                    text.setText("ERROR");
                }else{
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

            }
        });



        

    }

}