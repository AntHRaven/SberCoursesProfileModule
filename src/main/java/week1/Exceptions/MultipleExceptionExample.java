package week1.Exceptions;

public class MultipleExceptionExample {

  public static void main(String[] args) {
    try {
      toDivideThrowMyArithmeticException(100, 1);
      someMethodThrowArrayIndexOutOfBoundsException();
      simpleThrowRuntimeException();
    } catch (MyArithmeticException e) {
      System.out.println("LOG: произошло деление на 0");
    }
    // Обработка нескольких исключений
//  } catch (RuntimeException | MyArithmeticException e) {
//    System.out.println("LOG: Произошло исключение");
//  }

    //Порядок исключений
//    try {
//      someMethodThrowArrayIndexOutOfBoundsException();
//      toDivideThrowMyArithmeticException(100, 0);
//      simpleThrowRuntimeException();
//    } catch (ArrayIndexOutOfBoundsException e) {
//      System.out.println("LOG: Произошло ArrayIndexOutOfBoundsException");
//    } catch (RuntimeException e) {
//      System.out.println("LOG: Произошло RuntimeException");
//    } catch (MyArithmeticException e) {
//      System.out.println("LOG: Произошло деление на 0");
//    }
}

  public static void simpleThrowRuntimeException() {
    throw new RuntimeException();
  }

  public static void someMethodThrowArrayIndexOutOfBoundsException() {
    int[] arr = new int[10];
    System.out.println(arr[10]);
  }

  public static void toDivideThrowMyArithmeticException(int a, int b) throws MyArithmeticException {
    try {
      System.out.println(a / b);
    } catch (ArithmeticException e) {
      throw new MyArithmeticException();
    }
  }


}
