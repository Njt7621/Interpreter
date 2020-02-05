package rit.cs;

/**
 * An implementation of Expression that processes integers
 */
public class IntExpression implements Expression {
    private int value;

    /**
     * Creates an integer value
     * @param value inter
     */
    public IntExpression(int value){
        this.value = value;
    }

    /**
     * Evaluates the left and right based off of the operation
     * @return the evaluation the operation
     */
    @Override
    public int evaluate() {
        return this.value;
    }

    /**
     * Emits the string representation of the operation
     * @return the string representation of the operation
     */
    public String emit() {
        return String.valueOf(value);
    }
}
