package rit.cs;

/**
 * An implementation of Expression that processes multiplication
 */
public class MulExpression implements Expression {
    private Expression rNode;
    private Expression lNode;

    /**
     * Creates the left and right node of the operator
     * @param lNode the left node of the prefix exp
     * @param rNode the right node of the prefix exp
     */
    public MulExpression( Expression lNode, Expression rNode){
        this.rNode = rNode;
        this.lNode = lNode;
    }

    /**
     * Evaluates the left and right based off of the operation
     * @return the evaluation the operation
     */
    public int evaluate() {
        return lNode.evaluate() * rNode.evaluate();
    }

    /**
     * Emits the string representation of the operation
     * @return the string representation of the operation
     */
    public String emit() {
        return "(" + lNode.emit()+ " * " +rNode.emit()+ ")";
    }
}

