package tech.msociety.calculatorgerek;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewCalculatorDisplay;
    private long operand1 = 0;
    private long operand2 = 0;
    private String operator = null;
    private long result = 0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        textViewCalculatorDisplay = (TextView) findViewById(R.id.text_view_calculator_display);
    }
    
    public void onNumberButtonClick(View view) {
        TextView textView = (TextView) view;
        String digitAsString = textView.getText().toString();
        
        if (operator == null) {
            operand1 = Long.parseLong(String.valueOf(operand1) + digitAsString);
        } else {
            operand2 = Long.parseLong(String.valueOf(operand2) + digitAsString);
        }
        
        flushToDisplay();
    }
    
    public void onOperatorButtonClick(View view) {
        TextView textView = (TextView) view;
        operator = textView.getText().toString();
        flushToDisplay();
    }
    
    public void onEqualButtonClick(View view) {
        if (operator == null) return;
        
        if (operator.equals(getResources().getString(R.string.math_addition_symbol))) {
            result = operand1 + operand2;
        }
        
        if (operator.equals(getResources().getString(R.string.math_subtraction_symbol))) {
            result = operand1 - operand2;
        }
        
        if (operator.equals(getResources().getString(R.string.math_multiplication_symbol))) {
            result = operand1 * operand2;
        }
        
        if (operator.equals(getResources().getString(R.string.math_division_symbol))) {
            result = operand1 / operand2;
        }
        
        flushToDisplay();
        clear();
    }
    
    public void onClearButtonClick(View view) {
        clear();
        flushToDisplay();
    }
    
    private void clear() {
        operand1 = 0;
        operand2 = 0;
        operator = null;
        result = 0;
    }
    
    private void flushToDisplay() {
        String finalDisplay;
        
        if (result != 0) {
            finalDisplay = String.valueOf(result);
        } else {
            finalDisplay = String.valueOf(operand1);
            
            if (operator != null) {
                finalDisplay = finalDisplay + operator;
                if (operand2 != 0) finalDisplay += String.valueOf(operand2);
            }
        }
        
        textViewCalculatorDisplay.setText(finalDisplay);
    }
}
