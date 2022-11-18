package week2.GenericsAndCollections.tasks.task10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import week2.GenericsAndCollections.library.Book;

public class Main {

  public static void main(String[] args) {
    Book book1 = new Book("Java", "Herbert Schildt");
    List<Integer> list1 = Arrays.asList(10, 9, 10, 10);

    Book book2 = new Book("Introduction to Algorithms", "Thomas H. Cormen");
    List<Integer> list2 = Arrays.asList(9, 10, 8, 10);

    Book book3 = new Book("The Art of Computer Programming", "Donald Knuth");
    List<Integer> list3 = Arrays.asList(8, 9, 8, 7);


    Map<Book, List<Integer>> map = new HashMap<>();
    map.put(book1, list1);
    map.put(book2, list2);
    map.put(book3, list3);

    System.out.println(map.get(new Book("Introduction to Algorithms", "Thomas H. Cormen")));
  }

}
