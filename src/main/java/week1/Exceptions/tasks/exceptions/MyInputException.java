package week1.Exceptions.tasks.exceptions;

public class MyInputException extends MyBaseException {

  public MyInputException(String errorMessage) {
    super(errorMessage);
  }

  public MyInputException() {
    super("Неправильный формат ввода");
  }


}
