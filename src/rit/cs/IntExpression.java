package rit.cs;

public class IntExpression implements Expression {
    private int value;

    public IntExpression(int value){
        this.value = value;
    }
    @Override
    public int evaluate() {
        return this.value;
    }

    public String emit() {
        return String.valueOf(value);
    }
}
