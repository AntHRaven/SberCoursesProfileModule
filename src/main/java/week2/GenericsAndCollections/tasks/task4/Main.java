package week2.GenericsAndCollections.tasks.task4;


import static week2.GenericsAndCollections.tasks.task4.ListUtils.countIf;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Boolean> list1 = new ArrayList<>();
        list1.add(true);
        list1.add(true);
        list1.add(false);
        System.out.println(countIf(list1, true));
        System.out.println(countIf(list1, false));

        List<String> list2 = new ArrayList<>();
        list2.add("abc");
        list2.add("qqq");
        list2.add("qwerty");
        list2.add("qwerty");
        System.out.println(countIf(list2, "qwerty"));
        //System.out.println(countIf(list2, new String("qwerty")));

        //про стринг пул говорим
        // Оставить на занятие на буднях
        String str1 = "TopJava";
        String str2 = "TopJava";
        String str3 = (new String("TopJava")).intern();
        String str4 = (new String("TopJava")).intern();

        System.out.println("Строка 1 равна строке 2? " + (str1 == str2));
        System.out.println("Строка 2 равна строке 3? " + (str2 == str3));
        System.out.println("Строка 3 равна строке 4? " + (str3 == str4));

        //https://topjava.ru/blog/rukovodstvo-po-string-pool-v-java


    }
}
