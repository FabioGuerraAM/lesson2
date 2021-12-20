package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //region Created button classes
    TextView calcPlateVisible;
    TextView calcPlate;
    Button plus;
    Button percent;
    Button equals;
    Button clearButton;
    Button deleteButton;
    Button minus;
    Button division;
    Button multiply;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button comma;
    public String saveCalcPlate;
    public String calcSymbol;
    public int number1 = 0;
    public int number2 = 0;
    public int result = 0;
    String calcSymbolEquals = "";
//endregion


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcPlateVisible = findViewById(R.id.calcularPlateVisible);
        calcPlate = findViewById(R.id.calcularPlate);
        plus = findViewById(R.id.plus);
        percent = findViewById(R.id.percent);
        equals = findViewById(R.id.equals);
        clearButton = findViewById(R.id.clear);
        deleteButton = findViewById(R.id.delete);
        minus = findViewById(R.id.minus);
        division = findViewById(R.id.division);
        multiply = findViewById(R.id.multiply);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        comma = findViewById(R.id.comma);
        calcPlate.setText("");
        saveCalcPlate = calcPlate.getText().toString();
        calcSymbol = "";
        calcSymbolEquals = "";
        String calcSymbolsArray[] = {",", "/", "*", "+", "-", "="};

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                    case R.id.zero:

                        if (calcPlate.getText() != "") {
                            calcSymbol=".";
                            calcSymbolEquals = "0";
                            saveCalcPlate = calcPlate.getText().toString() + calcSymbolEquals;
                            calcPlateVisible.setText(calcPlateVisible.getText().toString() + calcSymbolEquals);
                            calcPlate.setText(saveCalcPlate);
                        }
                        break;

                    case R.id.one:
                        calcSymbol=".";
                        calcSymbolEquals = "1";
                        saveCalcPlate = calcPlate.getText().toString() + calcSymbolEquals;
                        calcPlateVisible.setText(calcPlateVisible.getText().toString() + calcSymbolEquals);
                        calcPlate.setText(saveCalcPlate);
                        break;

                    case R.id.two:
                        calcSymbol=".";
                        calcSymbolEquals = "2";
                        saveCalcPlate = calcPlate.getText().toString() + calcSymbolEquals;
                        calcPlateVisible.setText(calcPlateVisible.getText().toString() + calcSymbolEquals);
                        calcPlate.setText(saveCalcPlate);
                        break;

                    case R.id.three:
                        calcSymbol=".";
                        calcSymbolEquals = "3";
                        saveCalcPlate = calcPlate.getText().toString() + calcSymbolEquals;
                        calcPlateVisible.setText(calcPlateVisible.getText().toString() + calcSymbolEquals);
                        calcPlate.setText(saveCalcPlate);
                        break;

                    case R.id.four:
                        calcSymbol=".";
                        calcSymbolEquals = "4";
                        saveCalcPlate = calcPlate.getText().toString() + calcSymbolEquals;
                        calcPlateVisible.setText(calcPlateVisible.getText().toString() + calcSymbolEquals);
                        calcPlate.setText(saveCalcPlate);
                        break;

                    case R.id.five:
                        calcSymbol=".";
                        calcSymbolEquals = "5";
                        saveCalcPlate = calcPlate.getText().toString() + calcSymbolEquals;
                        calcPlateVisible.setText(calcPlateVisible.getText().toString() + calcSymbolEquals);
                        calcPlate.setText(saveCalcPlate);
                        break;

                    case R.id.six:
                        calcSymbol=".";
                        calcSymbolEquals = "6";
                        saveCalcPlate = calcPlate.getText().toString() + calcSymbolEquals;
                        calcPlateVisible.setText(calcPlateVisible.getText().toString() + calcSymbolEquals);
                        calcPlate.setText(saveCalcPlate);
                        break;

                    case R.id.seven:
                        calcSymbol=".";
                        calcSymbolEquals = "7";
                        saveCalcPlate = calcPlate.getText().toString() + calcSymbolEquals;
                        calcPlateVisible.setText(calcPlateVisible.getText().toString() + calcSymbolEquals);
                        calcPlate.setText(saveCalcPlate);
                        break;

                    case R.id.eight:
                        calcSymbol=".";
                        calcSymbolEquals = "8";
                        saveCalcPlate = calcPlate.getText().toString() + calcSymbolEquals;
                        calcPlateVisible.setText(calcPlateVisible.getText().toString() + calcSymbolEquals);
                        calcPlate.setText(saveCalcPlate);
                        break;

                    case R.id.nine:
                        calcSymbol=".";
                        calcSymbolEquals = "9";
                        saveCalcPlate = calcPlate.getText().toString() + calcSymbolEquals;
                        calcPlateVisible.setText(calcPlateVisible.getText().toString() + calcSymbolEquals);
                        calcPlate.setText(saveCalcPlate);
                        break;

                    case R.id.plus:
                        if (calcSymbol != calcSymbolsArray[3] && calcSymbol != "") {
                            calcSymbol = "+";
                            calcSymbolEquals = "+";
                            saveCalcPlate = calcPlate.getText().toString() + calcSymbol;
                            calcPlate.setText(saveCalcPlate);
                            if (number1 == 0) {
                                number1 = Integer.parseInt(calcPlateVisible.getText().toString());
                                calcPlateVisible.setText("");
                            }
                        }
                        break;

                    case R.id.minus:
                        if (calcSymbol != "-") {
                            calcSymbol = "-";
                            calcSymbolEquals = "-";
                            saveCalcPlate = calcPlate.getText().toString() + calcSymbol;
                            calcPlateVisible.setText(saveCalcPlate);
                            calcPlate.setText(saveCalcPlate);
                        }
                        break;

                    case R.id.division:
                        if (calcSymbol != "/") {
                            calcSymbol = "/";
                            calcSymbolEquals = "/";
                            saveCalcPlate = calcPlate.getText().toString() + calcSymbol;
                            calcPlateVisible.setText(saveCalcPlate);
                            calcPlate.setText(saveCalcPlate);
                        }
                        break;

                    case R.id.multiply:
                        if (calcSymbol != "*") {
                            calcSymbol = "*";
                            calcSymbolEquals = "*";
                            saveCalcPlate = calcPlate.getText().toString() + calcSymbol;
                            calcPlateVisible.setText(saveCalcPlate);
                            calcPlate.setText(saveCalcPlate);
                        }
                        break;

                    case R.id.comma:
                        if (calcSymbol != ",") {
                            calcSymbol = ",";
                            calcSymbolEquals = ",";
                            saveCalcPlate = calcPlate.getText().toString() + calcSymbol;
                            calcPlateVisible.setText(saveCalcPlate);
                            calcPlate.setText(saveCalcPlate);
                        }
                        break;

                    case R.id.equals:
                        if (calcSymbolEquals != "=" && number1 != 0 && number2 ==0) {
                            number2 = Integer.parseInt(calcPlateVisible.getText().toString());
                            calcSymbolEquals = "=";
                            saveCalcPlate = calcPlate.getText().toString();
                            switch (calcSymbol) {
                                case "*":
                                    result = number1 * number2;
                                    calcPlateVisible.setText("=" + result);
                                    number1=0;
                                    number2=0;
                                    break;
                                case "/":
                                    result = number1 / number2;
                                    calcPlateVisible.setText("=" + result);
                                    number1=0;
                                    number2=0;
                                    break;
                                case "+":
                                    result = number1 + number2;
                                    calcPlateVisible.setText("=" + result);
                                    number1=0;
                                    number2=0;
                                    break;
                                case "-":
                                    result = number1 - number2;
                                    calcPlateVisible.setText("=" + result);
                                    number1=0;
                                    number2=0;
                                    break;

                            }
                            calcPlateVisible.setText(saveCalcPlate);
                            calcPlate.setText(saveCalcPlate);

                        }
                        break;

                    case R.id.percent:
                        if (calcSymbol != "%") {
                            calcSymbol = "%";
                            calcSymbolEquals = "%";
                            saveCalcPlate = calcPlate.getText().toString() + calcSymbol;
                            calcPlateVisible.setText(saveCalcPlate);
                            calcPlate.setText(saveCalcPlate);
                        }
                        break;

                    case R.id.delete:
                        if (calcPlate.getText() != "") {
                            calcSymbol = "Del";
                            calcSymbolEquals = "Del";
                            saveCalcPlate = calcPlate.getText().toString();
                            if (saveCalcPlate.length() != 1) {
                                calcPlate.setText(saveCalcPlate.substring(0, saveCalcPlate.length() - 1));
                                calcPlateVisible.setText(saveCalcPlate.substring(0, saveCalcPlate.length() - 1));
                                break;
                            }
                        }

                    case R.id.clear:
                        calcSymbol = "Clear";
                        calcSymbolEquals = "Clear";
                        calcPlate.setText("");
                        calcPlateVisible.setText("");
                        break;


                }
            }
        };
        calcPlate.setOnClickListener(onClickListener);
        plus.setOnClickListener(onClickListener);
        percent.setOnClickListener(onClickListener);
        equals.setOnClickListener(onClickListener);
        clearButton.setOnClickListener(onClickListener);
        deleteButton.setOnClickListener(onClickListener);
        minus.setOnClickListener(onClickListener);
        division.setOnClickListener(onClickListener);
        multiply.setOnClickListener(onClickListener);
        one.setOnClickListener(onClickListener);
        two.setOnClickListener(onClickListener);
        three.setOnClickListener(onClickListener);
        four.setOnClickListener(onClickListener);
        five.setOnClickListener(onClickListener);
        six.setOnClickListener(onClickListener);
        seven.setOnClickListener(onClickListener);
        eight.setOnClickListener(onClickListener);
        nine.setOnClickListener(onClickListener);
        zero.setOnClickListener(onClickListener);
        comma.setOnClickListener(onClickListener);
    }

}