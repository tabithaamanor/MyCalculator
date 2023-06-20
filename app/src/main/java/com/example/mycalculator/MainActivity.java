package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    StringBuilder leftoperand = new StringBuilder();
    StringBuilder rightoperand = new StringBuilder();
    StringBuilder display = new StringBuilder();
    String operator;
    boolean save_as = false;
    float computed = 0;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result =findViewById(R.id.results);
        AppCompatButton clear =findViewById(R.id.clear);
        AppCompatButton plus_minus  =findViewById(R.id.plus_minus);
        AppCompatButton percent=findViewById(R.id.percent);
        AppCompatButton divide =findViewById(R.id.divide);
        AppCompatButton seven =findViewById(R.id.seven);
        AppCompatButton eight =findViewById(R.id.eight);
        AppCompatButton nine =findViewById(R.id.nine);
        AppCompatButton four =findViewById(R.id.four);
        AppCompatButton five =findViewById(R.id.five);
        AppCompatButton six =findViewById(R.id.six);
        AppCompatButton one =findViewById(R.id.one);
        AppCompatButton two=findViewById(R.id.two);
        AppCompatButton three =findViewById(R.id.three);
        AppCompatButton multiply=findViewById(R.id.multiply);
        AppCompatButton minus=findViewById(R.id.minus);
        AppCompatButton plus=findViewById(R.id.plus);
        AppCompatButton zero=findViewById(R.id.zero);
        AppCompatButton dot=findViewById(R.id.dot);
        AppCompatButton equal=findViewById(R.id.equal);

        zero.setOnClickListener(v -> {
            if (!save_as) {
                leftoperand.append(0);
                display.append("0");
                result.setText(display.toString());
            } else {
                rightoperand.append(0);
                display.append("0");
                result.setText(display.toString());
            }
        });
        one.setOnClickListener(v -> {
            if (!save_as) {
                leftoperand.append(1);
                display.append("1");
                result.setText(display.toString());
            } else {
                rightoperand.append(1);
                display.append("1");
                result.setText(display.toString());
            }
        });

        two.setOnClickListener(v -> {
            if (!save_as) {
                leftoperand.append(2);
                display.append("2");
                result.setText(display.toString());
            } else {
                rightoperand.append(2);
                display.append("2");
                result.setText(display.toString());
            }
        });

        three.setOnClickListener(v -> {
            if (!save_as) {
                leftoperand.append(3);
                display.append("3");
                result.setText(display.toString());
            } else {
                rightoperand.append(3);
                display.append("3");
                result.setText(display.toString());
            }
        });

        four.setOnClickListener(v -> {
            if (!save_as) {
                leftoperand.append(4);
                display.append("4");
                result.setText(display.toString());
            } else {
                rightoperand.append(4);
                display.append("4");
                result.setText(display.toString());
            }
        });

        five.setOnClickListener(v -> {
            if (!save_as) {
                leftoperand.append(5);
                display.append("5");
                result.setText(display.toString());
            } else {
                rightoperand.append(5);
                display.append("5");
                result.setText(display.toString());
            }
        });

        six.setOnClickListener(v -> {
            if (!save_as) {
                leftoperand.append(6);
                display.append("6");
                result.setText(display.toString());
            } else {
                rightoperand.append(6);
                display.append("6");
                result.setText(display.toString());
            }
        });

        seven.setOnClickListener(v -> {
            if (!save_as) {
                leftoperand.append(7);
                display.append("7");
                result.setText(display.toString());
            } else {
                rightoperand.append(7);
                display.append("7");
                result.setText(display.toString());
            }
        });

        eight.setOnClickListener(v -> {
            if (!save_as) {
                leftoperand.append(8);
                display.append("8");
                result.setText(display.toString());
            } else {
                rightoperand.append(8);
                display.append("8");
                result.setText(display.toString());
            }
        });

        nine.setOnClickListener(v -> {
            if (!save_as) {
                leftoperand.append(9);
                display.append("9");
                result.setText(display.toString());
            } else {
                rightoperand.append(9);
                display.append("9");
                result.setText(display.toString());
            }
        });



        plus.setOnClickListener(v -> {
            if (leftoperand.length() > 0)  {
                operator = "+";
                save_as = true;
                display.append("+");
                result.setText(display.toString());
            }
        });

        minus.setOnClickListener(v -> {
            if (leftoperand.length() > 0)  {
                operator = "-";
                save_as = true;
                display.append("-");
                result.setText(display.toString());
            }

        });

        multiply.setOnClickListener(v -> {
            if (leftoperand.length() > 0)  {
                operator = "x";
                save_as = true;
                display.append("x");
                result.setText(display.toString());
            }

        });

        divide.setOnClickListener(v -> {
            if ((leftoperand.length() > 0))  {
                operator = "/";
                save_as = true;
                display.append("/");
                result.setText(display.toString());
            }

        });

        plus_minus.setOnClickListener(v -> {

        });





        percent.setOnClickListener(v -> {

        });





        dot.setOnClickListener(v -> {

        });



        equal.setOnClickListener(v -> {
            if (leftoperand.length() > 0 && rightoperand.length() > 0 && operator.length() > 0)  {
                compute();
            }
        });


        clear.setOnClickListener(v -> {

        });
    }

    public void compute(){

        if(operator.equalsIgnoreCase("+")){
            computed = Float.parseFloat(leftoperand.toString()) + Float.parseFloat(rightoperand.toString());
        }
        else if(operator.equalsIgnoreCase("-")){
            computed = Float.parseFloat(leftoperand.toString()) - Float.parseFloat(rightoperand.toString());
        }
        else if(operator.equalsIgnoreCase("/")){
            computed = Float.parseFloat(leftoperand.toString()) / Float.parseFloat(rightoperand.toString());
        }
        else if(operator.equalsIgnoreCase("x")){
            computed = Float.parseFloat(leftoperand.toString()) * Float.parseFloat(rightoperand.toString());
        }
        result.setText(String.valueOf(computed));
        display.delete(0, display.length() - 1);
        leftoperand.delete(0, leftoperand.length() - 1);
        rightoperand.delete(0, rightoperand.length() - 1);
    }
}
