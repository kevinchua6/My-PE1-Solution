class InvalidOperandException extends RuntimeException {

  public InvalidOperandException(char c) {
    super("ERROR: invalid operand for operator " + c);
  }

}
