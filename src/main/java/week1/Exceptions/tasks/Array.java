package week1.Exceptions.tasks;

import java.util.Arrays;
//Создать int массив заполненный
//Методы:
//Получение по индексу
//Перестановка двух элементов
//Деление одного элемента массива на другой
public class Array {

  static int[] arr = {0,2,3,4,5,0};

  public static void main(String[] args) {
//    System.out.println(getByIndex(10));
    swap(1, 2);
    System.out.println( div(1, 2));
  }

  public static int getByIndex(int i) {
    try {
      return arr[i];
    } catch (IndexOutOfBoundsException e) {
      throw new IndexOutOfBoundsException("Такого индекса не существует");
    }
  }

  public static void swap(int i, int j) {
    int temp;
    temp = getByIndex(i);
    arr[i] = getByIndex(j);
    arr[j] = temp;
    System.out.println(Arrays.toString(arr));
  }

  public static int div(int i, int j) {
    try {
      return getByIndex(i) / getByIndex(j);
    } catch (ArithmeticException e) {
      throw new ArithmeticException("Ошибка деления");
    }
  }
}
