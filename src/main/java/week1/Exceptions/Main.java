package week1.Exceptions;

import java.util.Scanner;

//https://javarush.ru/groups/posts/isklyucheniya-java
//https://javarush.ru/groups/posts/1944-iskljuchenija-checked-unchecked-i-svoi-sobstvennihe
public class Main {

  public static void main(String[] args) {
//    firstExample();
//    secondExample();
//    thirdExample();
    fourthExample();
  }

  //Продемонстрировать получение ArithmeticException
  public static void firstExample() {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    System.out.println(toDivide(100, n));

  }

  private static Integer toDivide(int a, int b) {
    return a / b;
  }

  //throws – используется в сигнатуре методов для предупреждения, о том что метод может выбросить исключение.
  //Когда вы не планируете обрабатывать исключение в своем методе,
  // но хотите предупредить пользователей метода о возможных исключительных ситуациях — используйте ключевое слово throws.
  // Это ключевое слово в сигнатуре метода означает, что при определенных условиях метод, может выбросить исключение.
  private static Integer toDivideWithException(int a, int b) throws MyArithmeticException {
    try {
      return a / b;
    } catch (ArithmeticException e) {
      throw new MyArithmeticException(e.getMessage());
    }
  }

  public static void secondExample() {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    try {
      System.out.println(toDivide(100, n));
    } catch (ArithmeticException e) {
      throw new MyArithmeticException(e.getMessage());
    }
  }

  //Продемонстрировать работу finnaly
  public static void thirdExample() {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    try {
      System.out.println(toDivide(100, n));
    } catch (ArithmeticException e) {
      throw new MyArithmeticException(e.getMessage());
    } finally {
      System.out.println("finally");
    }
  }

  //Продемонстировать возможность передачи своего текста
  public static void fourthExample() {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    try {
      System.out.println(toDivideWithException(100, n));
    } catch (ArithmeticException e) {
      throw new MyArithmeticException("Текст исключения");
    } finally {
      System.out.println("finally");
    }
  }
}
