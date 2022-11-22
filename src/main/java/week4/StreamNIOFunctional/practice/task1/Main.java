package week4.StreamNIOFunctional.practice.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import week4.StreamNIOFunctional.practice.SimpleClass;

//Задача 1
//Сортировка листа по age
public class Main {

  public static void main(String[] args) {
    List<SimpleClass> list = new ArrayList<>();
    list.add(new SimpleClass("Nikita", "Veko", "n.veko", "123", 23));
    list.add(new SimpleClass("test", "test", "t.test", "123", 12));
    list.add(new SimpleClass("1test", "1test", "1t.test", "test", 17));
    list.add(new SimpleClass("2test", "2test", "2t.test", "test2222", 33));

    System.out.println(list);
    System.out.println(sortByAge(list));
  }

  public static List<SimpleClass> sortByAge(List<SimpleClass> list) {
    return list.stream().sorted(Comparator.comparing(SimpleClass::getAge)).collect(Collectors.toList());
  }
}
