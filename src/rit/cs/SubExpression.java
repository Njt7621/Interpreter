package rit.cs;

public class SubExpression implements Expression {
    private Expression rNode;
    private Expression lNode;

    public SubExpression( Expression lNode, Expression rNode){
        this.rNode = rNode;
        this.lNode = lNode;
    }

    public int evaluate() {
        return lNode.evaluate() - rNode.evaluate();
    }

    public String emit() {
        return "(" + lNode.emit()+ " - " +rNode.emit()+ ")";
    }
}

