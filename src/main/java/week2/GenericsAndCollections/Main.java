package week2.GenericsAndCollections;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
//    Этот код выполнится хорошо.Но что если к нам пришли и сказали, что фраза "Hello, world!" избита и можно вернуть только Hello?
//    Удалим из кода конкатенацию со строкой ", world!".Казалось бы, что может быть безобиднее ?
//    Но на деле мы получим ошибку ПРИ КОМПИЛЯЦИИ:
    List list = new ArrayList(); // Сырой тип
    list.add("Hello");
    String text = list.get(0) + ", world!";
    System.out.print(text);

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
  }
}
