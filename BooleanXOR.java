class BooleanXOR extends Operation {

  private Expression exp1;
  private Expression exp2;

  public BooleanXOR(Expression exp1, Expression exp2) {
    this.exp1 = exp1;
    this.exp2 = exp2;
  }

  public Boolean eval() {
    if (!(exp1.eval() instanceof Boolean) || !(exp2.eval() instanceof Boolean)) {
      throw new InvalidOperandException('^');
    } else {
      return (boolean) this.exp1.eval() ^ (boolean) this.exp2.eval();
    }

  }
}

