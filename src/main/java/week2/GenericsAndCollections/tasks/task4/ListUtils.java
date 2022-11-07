package week2.GenericsAndCollections.tasks.task4;

import java.util.List;

/*
  Реализовать метод, который считает количество элементов в переданном List
  (элемент передается на вход, посчитать количество таких элементов в list)
 */
public class ListUtils {

    public static <T> int countIf(List<T> from, T value) {
        int counter = 0;
        for (T element : from) {
            if (element.equals(value)) {
                //if (element == value) {
                ++counter;
            }
        }

        return counter;
    }
}
