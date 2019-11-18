package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import models.Calculate;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button one, two, three, four, five, six, seven, eight, nine, zero, equal, multiply, divide,
    minus, plus, clear;
    TextView calculate;
    String first = "";
    String second = "";
    String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven= findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        divide = findViewById(R.id.divide);
        multiply = findViewById(R.id.multiply);
        clear = findViewById(R.id.clear);
        equal = findViewById(R.id.equal);
        calculate = findViewById(R.id.calculate);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        minus.setOnClickListener(this);
        plus.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiply.setOnClickListener(this);
        equal.setOnClickListener(this);
        clear.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
      switch (view.getId()){
          case R.id.one:
              this.DataSet("1");
              break;
          case R.id.two:
              this.DataSet("2");
              break;
          case R.id.three:
              this.DataSet("3");
              break;
          case R.id.four:
              this.DataSet("4");
              break;
          case R.id.five:
              this.DataSet("5");
              break;
          case R.id.six:
              this.DataSet("6");
              break;
          case R.id.seven:
              this.DataSet("7");
              break;
          case R.id.eight:
              this.DataSet("8");
              break;
          case R.id.nine:
              this.DataSet("9");
              break;
          case R.id.zero:
              this.DataSet("0");
              break;
          case R.id.minus:
              calculate.setText("");
              operator = "-";
              calculate.append("");
              break;
          case R.id.plus:
              calculate.setText("");
              operator = "+";
              calculate.append("");
              break;
          case R.id.multiply:
              calculate.setText("");
              operator = "*";
              calculate.append("");
              break;
          case R.id.divide:
              calculate.setText("");
              operator = "/";
              calculate.append("");
              break;
          case R.id.equal:
              calculate.setText("");
              Calculate cal = new Calculate(Integer.parseInt(first), Integer.parseInt(second));
              if(("+").equals(operator)) {
                  int result = cal.Add();
                  operator = "";
                  calculate.setText(String.valueOf(result));
              }else if(("/").equals(operator)) {
                  int result = cal.Divide();
                  operator = "";
                  calculate.setText(String.valueOf(result));
              }else if(("*").equals(operator)) {
                  int result = cal.Multiply();
                  operator = "";
                  calculate.setText(String.valueOf(result));
              }else if(("-").equals(operator)) {

                  int result = cal.Subract();
                  operator = "";
                  calculate.setText(String.valueOf(result));
              }
              break;
          case R.id.clear:
              this.Clear();
              break;
      }
    }

    public void Clear () {
        calculate.setText("");
        operator = "";
        this.first = "";
        this.second = "";
    }

    public void DataSet(String num){
        if(operator.equals("")) {
            this.first = this.first + num;
            calculate.setText(first);
        } else  {
            this.second = this.second + num;
            calculate.setText(second);
        }

    }
}
