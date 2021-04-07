class Add extends Operation {

  private Expression exp1;
  private Expression exp2;

  public Add(Expression exp1, Expression exp2) {
    this.exp1 = exp1;
    this.exp2 = exp2;
  }

  @Override
  public String eval() {
    if (!(exp1.eval() instanceof String) || !(exp2.eval() instanceof String)) {
      throw new InvalidOperandException('+');
    } else {
      return (String) this.exp1.eval() + (String) this.exp2.eval();
    }

  }

}

