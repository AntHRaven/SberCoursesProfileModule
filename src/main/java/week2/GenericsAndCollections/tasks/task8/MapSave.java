package week2.GenericsAndCollections.tasks.task8;

import java.util.HashMap;

/*
Простая задача: сохранить в мапе три элемента (1, “first”).
Вывести элемент значение по ключу 2
 */
public class MapSave {
    public static void main(String[] args) {
        HashMap<Integer, String> hm1 = new HashMap<>();

        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        System.out.println("Элементы HashMap: " + hm1);

        System.out.println("Значение элемента 2: " + hm1.get(2));
    }
}
