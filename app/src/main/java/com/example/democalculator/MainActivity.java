package com.example.democalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Double previousNumber;
    Double currentNumber;
    char operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.tvl);
    }

    public void plus(View view) {
        String num1 = result.getText().toString();
        previousNumber = Double.parseDouble(num1);
        result.setText("");
        operation = '+';
    }

    public void minus(View view) {
        String num1 = result.getText().toString();
        previousNumber = Double.parseDouble(num1);
        result.setText("");
        operation = '-';
    }

    public void multiply(View view) {
        String num1 = result.getText().toString();
        previousNumber = Double.parseDouble(num1);
        result.setText("");
        operation = '*';
    }

    public void divide(View view) {
        String num1 = result.getText().toString();
        previousNumber = Double.parseDouble(num1);
        result.setText("");
        operation = '/';
    }

    public void equal(View view) {
        String num2 = result.getText().toString();
        currentNumber = Double.parseDouble(num2);
        result.setText("");
        if (operation == '+') {
            if (previousNumber != null) {
                Double addResult = previousNumber + currentNumber;
                result.setText(addResult.toString());
            }
        } else if (operation == '-') {
            if (previousNumber != null) {
                Double minusResult = previousNumber - currentNumber;
                result.setText(minusResult.toString());
            }
        } else if (operation == '*') {
            if (previousNumber != null) {
                Double multiplyResult = previousNumber * currentNumber;
                result.setText(multiplyResult.toString());
            }
        } else if (operation == '/') {
            if (previousNumber != null) {
                if (currentNumber == 0) {
                    result.setText("Invalid");
                } else {
                    Double minusResult = previousNumber / currentNumber;
                    result.setText(minusResult.toString());
                }
            }
        }
    }

    public void clear(View view) {
        result.setText("");
    }

    public void back(View view) {
        String currentResult = result.getText().toString();
        if (currentResult.length() > 0) {
            currentResult = currentResult.substring(0, currentResult.length() - 1);
            result.setText(currentResult);
        }
    }

    public void numberZero(View view) {
        String zero = result.getText().toString();
        if (zero.length() > 0) {
            result.setText(zero + "0");
        }
    }

    public void numberOne(View view) {
        String one = result.getText().toString();
        result.setText(one + "1");
    }

    public void numberTwo(View view) {
        String two = result.getText().toString();
        result.setText(two + "2");
    }

    public void numberThree(View view) {
        String three = result.getText().toString();
        result.setText(three + "3");
    }

    public void numberFour(View view) {
        String four = result.getText().toString();
        result.setText(four + "4");
    }

    public void numberFive(View view) {
        String five = result.getText().toString();
        result.setText(five + "5");
    }

    public void numberSix(View view) {
        String six = result.getText().toString();
        result.setText(six + "6");
    }

    public void numberSeven(View view) {
        String seven = result.getText().toString();
        result.setText(seven + "7");
    }

    public void numberEight(View view) {
        String eight = result.getText().toString();
        result.setText(eight + "8");
    }

    public void numberNine(View view) {
        String nine = result.getText().toString();
        result.setText(nine + "9");
    }
}