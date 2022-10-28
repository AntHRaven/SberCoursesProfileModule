package week1.Exceptions.tasks.exceptions;

public class MyBaseException extends RuntimeException {

  public MyBaseException(String errorMessage) {
    super(errorMessage);
    System.out.println("LOG: " + errorMessage);
  }

}
