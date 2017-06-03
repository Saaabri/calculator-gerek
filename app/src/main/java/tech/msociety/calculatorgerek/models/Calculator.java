package tech.msociety.calculatorgerek.models;

public class Calculator {
    private Long operand1;
    private Long operand2;
    private Operator operator;
    
    public Calculator() {
        operand1 = 0L;
        operand2 = 0L;
        operator = null;
    }
    
    public Long calculate() {
        Long result = null;
        
        if (operator == Operator.ADD) {
            result = operand1 + operand2;
        }
        
        if (operator == Operator.SUBTRACT) {
            result = operand1 - operand2;
        }
        
        if (operator == Operator.MULTIPLY) {
            result = operand1 * operand2;
        }
        
        if (operator == Operator.DIVIDE) {
            result = operand1 / operand2;
        }
        
        return result;
    }
    
    public boolean canCalculate() {
        boolean result = true;
        if (operand1 == 0) result = false;
        if (operand2 == 0) result = false;
        if (operator == null) result = false;
        return result;
    }
    
    public boolean hasOperator() {
        return operator != null;
    }
    
    public boolean hasOperand2() {
        return operand2 != null && operand2 != 0;
    }
    
    public enum Operator {
        MULTIPLY, DIVIDE, ADD, SUBTRACT
    }
    
    public Long getOperand1() {
        return operand1;
    }
    
    public void setOperand1(Long operand1) {
        this.operand1 = operand1;
    }
    
    public Long getOperand2() {
        return operand2;
    }
    
    public void setOperand2(Long operand2) {
        this.operand2 = operand2;
    }
    
    public Operator getOperator() {
        return operator;
    }
    
    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
