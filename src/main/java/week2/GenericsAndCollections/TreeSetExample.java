package week2.GenericsAndCollections;

import java.util.HashMap;
import java.util.TreeSet;

public class TreeSetExample {

  //1 отсортировать сет по длинне текста (в классе персон)
  //2 в обратную сторону
  //3 по возрасту
  public static void main(String[] args) {
    TreeSet<Person> treeSet = new TreeSet<>(new PersonAgeComparator());
    treeSet.add(new Person("test", 1));
    treeSet.add(new Person("tes", 2));
    treeSet.add(new Person("testt", 3));

    treeSet.forEach(i -> {
      System.out.println(i.getName() + "-" + i.getAge());
    });

  }

}
