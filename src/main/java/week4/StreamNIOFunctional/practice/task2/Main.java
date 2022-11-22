package week4.StreamNIOFunctional.practice.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import week4.StreamNIOFunctional.practice.SimpleClass;

public class Main {

  //Сортировка по нескольким свойствам (age, firstname, secondName)
  public static void main(String[] args) {
    List<SimpleClass> list = new ArrayList<>();
    list.add(new SimpleClass("Nikita", "Veko", "n.veko", "123", 23));
    list.add(new SimpleClass("test", "test", "t.test", "123", 12));
    list.add(new SimpleClass("1test", "1test", "1t.test", "test", 17));
    list.add(new SimpleClass("2test", "2test", "2t.test", "test2222", 33));

    System.out.println(list);
    System.out.println("----");
    System.out.println(sortByAgeFirstNameSecondName(list));
  }

  public static List<SimpleClass> sortByAgeFirstNameSecondName(List<SimpleClass> list) {
    return list.stream().sorted(Comparator.comparing(SimpleClass::getAge).thenComparing(SimpleClass::getFirstName).thenComparing(SimpleClass::getSecondName)).toList();
  }
}
