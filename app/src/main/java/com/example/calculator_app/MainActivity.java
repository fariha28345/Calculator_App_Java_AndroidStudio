package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button buttonDLE, buttonAC, buttonPer, button9, button8, button7,
            buttonPlus, button6, button5, button4, buttonMinus, button3, button2,
            button1, buttonInto, buttondot, buttonEqual, button0, buttonDivision;
    EditText edtxt;
    float mvalueOne, mvalueTwo;
    boolean addition, subtruct, multiplication, division;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtxt = findViewById(R.id.edTxt);
        buttonDLE = findViewById(R.id.buttonDEL);
        buttonAC = findViewById(R.id.buttonAC);
        buttonPer = findViewById(R.id.buttonPer);
        button9 = findViewById(R.id.button9);
        button8 = findViewById(R.id.button8);
        button7 = findViewById(R.id.button7);
        buttonPlus = findViewById(R.id.buttonPlus);
        button6 = findViewById(R.id.button6);
        button5 = findViewById(R.id.button5);
        button4 = findViewById(R.id.button4);
        buttonMinus = findViewById(R.id.buttonMinus);
        button3 = findViewById(R.id.button3);
        button2 = findViewById(R.id.button2);
        button1 = findViewById(R.id.button1);
        button0 = findViewById(R.id.button0);
        buttonInto = findViewById(R.id.buttonInto);
        buttonDivision = findViewById(R.id.buttonDivision);
        buttondot = findViewById(R.id.buttonDot);
        buttonEqual = findViewById(R.id.buttonEqual);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt.setText(edtxt.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt.setText(edtxt.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt.setText(edtxt.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt.setText(edtxt.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt.setText(edtxt.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt.setText(edtxt.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt.setText(edtxt.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt.setText(edtxt.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt.setText(edtxt.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt.setText(edtxt.getText()+"9");
            }
        });
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt.setText(edtxt.getText()+".");
            }
        });
        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtxt.setText("");
            }
        });
        buttonDLE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentNumber = edtxt.getText().toString();
                if (!currentNumber.isEmpty()) {
                    String newNumber = currentNumber.substring(0, currentNumber.length() - 1);
                    edtxt.setText(newNumber);
                }
            }
        });
        buttonPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float no = Float.parseFloat(edtxt.getText().toString())/100;
                edtxt.setText(no+"");
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtxt == null) {
                    edtxt.setText("");
                }
                else {
                    mvalueOne = Float.parseFloat(edtxt.getText() + "");
                    addition=true;
                    edtxt.setText(null);
                }
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtxt == null) {
                    edtxt.setText("");
                }
                else {
                    mvalueOne = Float.parseFloat(edtxt.getText() + "");
                    subtruct=true;
                    edtxt.setText(null);
                }
            }
        });
        buttonInto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtxt == null) {
                    edtxt.setText("");
                }
                else {
                    mvalueOne = Float.parseFloat(edtxt.getText() + "");
                    multiplication=true;
                    edtxt.setText(null);
                }
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtxt == null) {
                    edtxt.setText("");
                }
                else {
                    mvalueOne = Float.parseFloat(edtxt.getText() + "");
                    division=true;
                    edtxt.setText(null);
                }
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mvalueTwo=Float.parseFloat(edtxt.getText()+"");
                if(addition==true){
                    edtxt.setText(mvalueOne+mvalueTwo+"");
                    addition=false;
                }
                if(subtruct==true){
                    edtxt.setText(mvalueOne-mvalueTwo+"");
                    subtruct=false;
                }
                if(multiplication==true){
                    edtxt.setText(mvalueOne*mvalueTwo+"");
                    multiplication=false;
                }
                if(division==true){
                    edtxt.setText(mvalueOne/mvalueTwo+"");
                    division=false;
                }
            }
        });
    }
}