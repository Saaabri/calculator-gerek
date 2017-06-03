package tech.msociety.calculatorgerek;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import tech.msociety.calculatorgerek.models.Calculator;

public class MainActivity extends AppCompatActivity {
    private TextView textViewCalculatorDisplay;
    private Calculator calculator;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        textViewCalculatorDisplay = (TextView) findViewById(R.id.text_view_calculator_display);
        calculator = new Calculator();
    }
    
    public void onNumberButtonClick(View view) {
        TextView textView = (TextView) view;
        String digitAsString = textView.getText().toString();
    
        if (!calculator.hasOperator()) {
            calculator.setOperand1(Long.parseLong(String.valueOf(calculator.getOperand1()) + digitAsString));
        } else {
            calculator.setOperand2(Long.parseLong(String.valueOf(calculator.getOperand2()) + digitAsString));
        }
    
        updateDisplay();
    }
    
    public void onOperatorButtonClick(View view) {
        TextView textView = (TextView) view;
        String operator = textView.getText().toString();
        
        if (operator.equals(getResources().getString(R.string.math_addition_symbol))) {
            calculator.setOperator(Calculator.Operator.ADD);
        }
        
        if (operator.equals(getResources().getString(R.string.math_subtraction_symbol))) {
            calculator.setOperator(Calculator.Operator.SUBTRACT);
        }
        
        if (operator.equals(getResources().getString(R.string.math_multiplication_symbol))) {
            calculator.setOperator(Calculator.Operator.MULTIPLY);
        }
        
        if (operator.equals(getResources().getString(R.string.math_division_symbol))) {
            calculator.setOperator(Calculator.Operator.DIVIDE);
        }
    
        updateDisplay();
    }
    
    public void onEqualButtonClick(View view) {
        if (!calculator.canCalculate()) return;
        
        Long result = calculator.calculate();
        textViewCalculatorDisplay.setText(String.valueOf(result));
        
        calculator = new Calculator();
        calculator.setOperand1(result);
    }
    
    public void onClearButtonClick(View view) {
        calculator = new Calculator();
        updateDisplay();
    }
    
    private void updateDisplay() {
        String finalDisplay;
        
        finalDisplay = String.valueOf(calculator.getOperand1());
        if (calculator.hasOperator()) finalDisplay += resolveOperatorSymbol(calculator.getOperator());
        if (calculator.hasOperand2()) finalDisplay += String.valueOf(calculator.getOperand2());
        
        textViewCalculatorDisplay.setText(finalDisplay);
    }
    
    private String resolveOperatorSymbol(Calculator.Operator operator) {
        if (operator == Calculator.Operator.ADD) {
            return getResources().getString(R.string.math_addition_symbol);
        }
        
        if (operator == Calculator.Operator.SUBTRACT) {
            return getResources().getString(R.string.math_subtraction_symbol);
        }
        
        if (operator == Calculator.Operator.MULTIPLY) {
            return getResources().getString(R.string.math_multiplication_symbol);
        }
        
        if (operator == Calculator.Operator.DIVIDE) {
            return getResources().getString(R.string.math_division_symbol);
        }
        
        return null;
    }
}
