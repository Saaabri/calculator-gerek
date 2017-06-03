package tech.msociety.calculatorgerek;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewCalculatorButton0;
    private TextView textViewCalculatorButton1;
    private TextView textViewCalculatorButton2;
    private TextView textViewCalculatorButton3;
    private TextView textViewCalculatorButton4;
    private TextView textViewCalculatorButton5;
    private TextView textViewCalculatorButton6;
    private TextView textViewCalculatorButton7;
    private TextView textViewCalculatorButton8;
    private TextView textViewCalculatorButton9;
    private TextView textViewCalculatorButtonDivision;
    private TextView textViewCalculatorButtonMultiplication;
    private TextView textViewCalculatorButtonAddition;
    private TextView textViewCalculatorButtonSubtraction;
    private TextView textViewCalculatorButtonEquals;
    private TextView textViewCalculatorButtonDecimal;
    private TextView textViewCalculatorButtonDelete;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        initViewHandles();
    
    }
    
    private void initViewHandles() {
        textViewCalculatorButton0 = (TextView) findViewById(R.id.text_view_calculator_button_0);
        textViewCalculatorButton1 = (TextView) findViewById(R.id.text_view_calculator_button_1);
        textViewCalculatorButton2 = (TextView) findViewById(R.id.text_view_calculator_button_2);
        textViewCalculatorButton3 = (TextView) findViewById(R.id.text_view_calculator_button_3);
        textViewCalculatorButton4 = (TextView) findViewById(R.id.text_view_calculator_button_4);
        textViewCalculatorButton5 = (TextView) findViewById(R.id.text_view_calculator_button_5);
        textViewCalculatorButton6 = (TextView) findViewById(R.id.text_view_calculator_button_6);
        textViewCalculatorButton7 = (TextView) findViewById(R.id.text_view_calculator_button_7);
        textViewCalculatorButton8 = (TextView) findViewById(R.id.text_view_calculator_button_8);
        textViewCalculatorButton9 = (TextView) findViewById(R.id.text_view_calculator_button_9);
        textViewCalculatorButtonDivision = (TextView) findViewById(R.id.text_view_calculator_button_division);
        textViewCalculatorButtonMultiplication = (TextView) findViewById(R.id.text_view_calculator_button_multiplication);
        textViewCalculatorButtonAddition = (TextView) findViewById(R.id.text_view_calculator_button_addition);
        textViewCalculatorButtonSubtraction = (TextView) findViewById(R.id.text_view_calculator_button_subtraction);
        textViewCalculatorButtonEquals = (TextView) findViewById(R.id.text_view_calculator_button_equals);
        textViewCalculatorButtonDecimal = (TextView) findViewById(R.id.text_view_calculator_button_decimal);
        textViewCalculatorButtonDelete = (TextView) findViewById(R.id.text_view_calculator_button_delete);
    }
}
