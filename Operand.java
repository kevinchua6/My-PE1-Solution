class Operand extends Expression {

  private Object value;

  public Operand(Object value) {
    this.value = value;
  }

  @Override
  public Object eval() {
    return this.value;
  }

}

