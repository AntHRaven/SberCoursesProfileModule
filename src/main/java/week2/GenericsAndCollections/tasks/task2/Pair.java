package week2.GenericsAndCollections.tasks.task2;

//теперь нам надо дополнить класс getters/setters
public class Pair<T, V> {
    private T first;
    private V second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "First: " + first + "; second: " + second;
    }
}
