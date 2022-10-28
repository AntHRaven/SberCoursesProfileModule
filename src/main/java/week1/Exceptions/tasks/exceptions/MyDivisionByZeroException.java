package week1.Exceptions.tasks.exceptions;

public class MyDivisionByZeroException extends MyBaseException {

  public MyDivisionByZeroException(String errorMessage) {
    super(errorMessage);
  }

  public MyDivisionByZeroException() {
    super("Недопустимое деление на 0.");
  }


}
