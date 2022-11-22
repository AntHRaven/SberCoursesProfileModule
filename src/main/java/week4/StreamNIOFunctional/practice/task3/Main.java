package week4.StreamNIOFunctional.practice.task3;

import java.util.ArrayList;
import java.util.List;
import week4.StreamNIOFunctional.practice.SimpleClass;

//Задача 3
//Вычисление среднего возраста (age) и максимальной длины firstName
public class Main {

  public static void main(String[] args) {
    List<SimpleClass> list = new ArrayList<>();
    list.add(new SimpleClass("Nikita", "Veko", "n.veko", "123", 23));
    list.add(new SimpleClass("test", "test", "t.test", "123", 12));
    list.add(new SimpleClass("1test", "1test", "1t.test", "test", 17));
    list.add(new SimpleClass("2test", "2test", "2t.test", "test2222", 33));
    System.out.println(getAverageAge(list));
    System.out.println(maxLengthFirstName(list));
  }

  public static Double getAverageAge(List<SimpleClass> list) {
    return list.stream().mapToInt(SimpleClass::getAge).summaryStatistics().getAverage();
  }

  public static Integer maxLengthFirstName(List<SimpleClass> list) {
    return list.stream().mapToInt((i) -> {
      return i.getFirstName().length();
    }).summaryStatistics().getMax();
  }
}
