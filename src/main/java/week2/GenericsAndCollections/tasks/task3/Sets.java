package week2.GenericsAndCollections.tasks.task3;

import java.util.HashSet;
import java.util.Set;

/*
 На вход подаются два сета, вывести уникальные элементы,
 которые встречаются и в первом и во втором.
 */
//https://developer.alexanderklimov.ru/android/java/set.php
public class Sets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(null);
        set1.add(3);
        set1.forEach(System.out::println);
        System.out.println("====");
        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set1.add(null);
        set2.add(3);
        set2.add(2);
        set2.add(2);

        //встроенный метод полезный
        //Оставляет только общие в обеих коллекциях элемента
        set1.retainAll(set2);
        //можно решать задачу обычным перебором элементов set и сравнивания

        for (Integer elem : set1) {
            System.out.println(elem);
        }
        //метод true/false есть ли хоть один элемент нашей текущей коллекции в другой коллекции
        //Collections.disjoint();
    }
}
