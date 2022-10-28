package week1.Exceptions;

import java.util.Scanner;

/*
Свое собственное исключение - полный аналог арифметического исключения.
 */
public class MyArithmeticException
    extends ArithmeticException  {
//    extends ArithmeticException {

  public MyArithmeticException() {
    //Можно по дефолту передавать сообщение об ошибке, если она одна и та-же.
    //super("Произошло деление на 0.");
  }

  public MyArithmeticException(String message) {
    super(message);
  }
}

