package week1.Exceptions.tasks.exceptions;

public class MyIntOverflowException extends MyBaseException {

  public MyIntOverflowException(String errorMessage) {
    super(errorMessage);
  }

  public MyIntOverflowException() {
    super("Выход за пределы допустимых значений int");
  }


}
