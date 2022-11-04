package week2.GenericsAndCollections.tasks.task1;

/*
Создать класс Pair, который умеет хранить два значения:
a) любого типа (T, V)
b) одинакового типа (T - в единственном числе)
c) первый только String, второй только числовой
(T extends String, V extends Number)
 */
public class Pair <T, V> {
//public class Pair<T extends String, V extends Number> {
    public T first;
    public V second;

    public void print() {
        System.out.println("First: " + first + ", Second: " + second);
    }
}
