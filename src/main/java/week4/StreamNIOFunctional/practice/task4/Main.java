package week4.StreamNIOFunctional.practice.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import week4.StreamNIOFunctional.practice.SimpleClass;

//User старше 10 лет, у которых первый символ firstName не равен T.
public class Main {

  public static void main(String[] args) {
    List<SimpleClass> list = new ArrayList<>();
    list.add(new SimpleClass("Nikita", "Veko", "n.veko", "123", 23));
    list.add(new SimpleClass("test", "test", "t.test", "123", 12));
    list.add(new SimpleClass("1test", "1test", "1t.test", "test", 17));
    list.add(new SimpleClass("2test", "2test", "2t.test", "test2222", 33));

    example(list, 'N');
  }

  public static List<SimpleClass> example(List<SimpleClass> list, Character character) {
    return list
        .stream()
        .filter(p -> (p.getFirstName().charAt(0) != character))
        .filter(p -> (p.getAge() > 10))
        .toList();
  }
}
