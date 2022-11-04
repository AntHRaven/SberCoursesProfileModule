package week2.GenericsAndCollections.tasks.task2;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();
        pair.setFirst("testFirst");
        pair.setSecond(123);
        System.out.println(pair);
    }
}
