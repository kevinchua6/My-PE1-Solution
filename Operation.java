abstract class Operation extends Expression {

  private Expression exp1;
  private Expression exp2;

  public static Operation of (char c, Expression exp1, Expression exp2) {
    if (c == '*') {
      return new Multiply(exp1, exp2);
    } else if (c == '+') {
      return new Add(exp1, exp2);
    } else if (c == '^') {
      return new BooleanXOR(exp1, exp2);
    } else {
      return null;
    }
  }

}
