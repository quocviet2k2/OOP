package expression;

public class TestExpressions {
    public static void main(String[] args) {
        /* TODO */
        /* Viết code đề mô tính biểu thức (1 + 2) * 3 - 4 */

        Evaluable operand1 = new Operand(1.0);
        Evaluable operand2 = new Operand(2.0);
        Evaluable operand3 = new Operand(3.0);
        Evaluable operand4 = new Operand(4.0);


        Operator additionOperator = new AdditionOperator();
        Operator multiplicationOperator = new MultiplicationOperator();
        Operator subtractionOperator = new SubtractionOperator();

        // Inner expression: 1 + 2
        Evaluable add = new Expression(operand1, operand2, additionOperator);
        Evaluable mul = new Expression(add, operand3, multiplicationOperator);
        Evaluable sub = new Expression(mul, operand4, subtractionOperator);

        // Evaluate the outer expression
        double result = sub.evaluate();
        System.out.println(result);
    }
}

