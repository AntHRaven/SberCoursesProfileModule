package week2.GenericsAndCollections.tasks.task1;

public class Main {

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>();
        pair1.first = "abc";
        pair1.second = 1;
        pair1.print();
    }
}
