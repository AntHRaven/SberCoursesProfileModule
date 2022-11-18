package week2.GenericsAndCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import week2.GenericsAndCollections.library.Book;

public class Main {

  public static void main(String[] args) {
//    Этот код выполнится хорошо.Но что если к нам пришли и сказали, что фраза "Hello, world!" избита и можно вернуть только Hello?
//    Удалим из кода конкатенацию со строкой ", world!".Казалось бы, что может быть безобиднее ?
//    Но на деле мы получим ошибку ПРИ КОМПИЛЯЦИИ:
//    List list = new ArrayList(); // Сырой тип
//    list.add("Hello");
//    String text = list.get(0) + ", world!";
//    System.out.print(text);

//    List<String> list2 = new ArrayList<>(); // Типизированный тип
//    list2.add("Hello!");
//    list2.add(123);
//    for (Object str : list2) {
//      System.out.println(str);
//    }
//
//    List list3 = new ArrayList<String>();
//    list2.add("Hello!");
//    list2.add(123);
//    for (Object str : list2) {
//      System.out.println(str);
//    }





  List<Integer> listInt = new ArrayList<>();
    listInt.add(5);
    listInt.add(2);
    listInt.add(56);
    listInt.add(7);
    listInt.add(1);
    listInt.add(33);
    Collections.sort(listInt);

    Set<Integer> set = new HashSet<>(listInt);

    System.out.println(set);
//    firstExample(listInt);
  }

  //Отсортировать по возрастанию лист integer записав только уникальные значения листа
  public static Set<Integer> firstExample(List<Integer> list) {
    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
    list.sort(Integer::compareTo);
    System.out.println(list);
    for(Integer e : list) {
      linkedHashSet.add(e);
    }

//    linkedHashSet.addAll(list);
//    return new LinkedHashSet<>(list);
    return linkedHashSet;
  }
}
