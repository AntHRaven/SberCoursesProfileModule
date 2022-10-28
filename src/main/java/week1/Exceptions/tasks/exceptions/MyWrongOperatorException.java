package week1.Exceptions.tasks.exceptions;

public class MyWrongOperatorException extends MyBaseException {

  public MyWrongOperatorException(String errorMessage) {
    super(errorMessage);
  }

  public MyWrongOperatorException() {
    super("Недопустимый оператор для калькулятора");
  }


}
