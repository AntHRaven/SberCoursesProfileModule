package week2.GenericsAndCollections.tasks.task5;

import java.util.HashSet;
import java.util.TreeSet;

/*
Создать метод, переводящий из HashSet в TreeSet. Вывести оба варианта.
Про разницу Lista и hashSet:
https://javarush.ru/groups/posts/3452-razbor-voprosov-i-otvetov-s-sobesedovaniy-na-java-razrabotchika-chastjh-10

Про деревья:
 https://habr.com/ru/post/330644/

Структуры данных в картинках:
  https://habr.com/ru/post/128017/
 */
public class ConvertHashSet {

    public static <T> TreeSet<T> convertHashSet(HashSet<T> from) {
        TreeSet<T> toReturn = new TreeSet<>();
        //Collections.addAll();
        for (T elem : from) {
            toReturn.add(elem);
        }

        return toReturn;
    }
}
