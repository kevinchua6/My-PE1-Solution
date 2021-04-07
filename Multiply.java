class Multiply extends Operation {

  private Expression exp1;
  private Expression exp2;

  public Multiply(Expression exp1, Expression exp2) {
    this.exp1 = exp1;
    this.exp2 = exp2;
  }

  @Override
  public Integer eval() {
    if (!(exp1.eval() instanceof Integer) || !(exp2.eval() instanceof Integer)) {
      throw new InvalidOperandException('*');
    } else {
      return (int) this.exp1.eval() * (int) this.exp2.eval();
    }

  }

}
