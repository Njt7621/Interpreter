package rit.cs;

public class DivExpression implements Expression {
    private Expression rNode;
    private Expression lNode;

    public DivExpression( Expression lNode, Expression rNode){
        this.rNode = rNode;
        this.lNode = lNode;
    }

    public int evaluate() {
        return lNode.evaluate() / rNode.evaluate();
    }

    public String emit() {
        return "(" + lNode.emit()+ " / " +rNode.emit()+ ")";
    }
}
