package expression;

public class MultiplicationOperator implements Operator {

    public double doOperation(Evaluable leftOperand, Evaluable rightOperand) {
        /* TODO */
        return leftOperand.evaluate() * rightOperand.evaluate();
    }
}
