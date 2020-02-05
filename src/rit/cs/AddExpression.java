package rit.cs;

public class AddExpression implements Expression {
    private Expression rNode;
    private Expression lNode;

    public AddExpression( Expression lNode, Expression rNode){
        this.rNode = rNode;
        this.lNode = lNode;
    }

    public int evaluate() {
        return rNode.evaluate() + lNode.evaluate();
    }

    public String emit() {
        return "(" + lNode.emit()+ " + " +rNode.emit()+ ")";
    }
}
