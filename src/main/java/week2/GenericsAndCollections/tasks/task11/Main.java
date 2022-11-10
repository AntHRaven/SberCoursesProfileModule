package week2.GenericsAndCollections.tasks.task11;

import java.util.ArrayList;
import java.util.List;

public class Main {
  static class Item {

  }

  static class Book extends Item {
    String name;
  }

  static class Phone extends Item {
    String model;
  }
  //PECS
  //Producer Extends, Consumer Super
  public static void copy(List<? extends Item> src, List<? super Item> dst) {
    for (Item item : src) {
      dst.add(item);
    }
  }

  /*
  Books ---
            \
              ---> Item ---> Object //т.е. копировать можно от подкласса к классу родителю
            /
  Phone ---
   */
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    List<Phone> phones = new ArrayList<>();
    List<Item> items = new ArrayList<>();
    List<Object> objects = new ArrayList<>();

    copy(books, items);
    copy(phones, objects);
    //copy(books, phones); //ошибка
    //copy(items, books); //ошибка
  }

}
