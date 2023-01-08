package expression;

public class SubtractionOperator implements Operator {

    public double doOperation(Evaluable leftOperand, Evaluable rightOperand) {
        /* TODO */
        return leftOperand.evaluate() - rightOperand.evaluate();
    }
}
