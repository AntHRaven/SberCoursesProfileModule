package week2.GenericsAndCollections.tasks.task5;

import static week2.GenericsAndCollections.tasks.task5.ConvertHashSet.convertHashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("A");
        set.add("B");
        set.add("c");

        System.out.println("HashSet: ");
        for (String s : set) {
            System.out.println(s + " ");
        }
        System.out.println("\nTreeSet: ");
        TreeSet<String> set1 = convertHashSet(set);
        for (String s : set1) {
            System.out.println(s + " ");
        }
    }
}
