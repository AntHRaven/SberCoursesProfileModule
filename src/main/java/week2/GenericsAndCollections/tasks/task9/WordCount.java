package week2.GenericsAndCollections.tasks.task9;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
На вход подается количество слов n и слова (каждое на отдельной строке).
(Scanner) - альтернатива - List<String>
Посчитать сколько раз встретилось каждое слово.
Вывести результат для каждого слова (в любом порядке).
Пример:
6
слон
слон
кот
мышь
кот
кот
->
слон 2
кот 3
мышь 1
 */
public class WordCount {

    public static void main(String[] args) {
        //решение со списком
        List<String> words = new ArrayList<>();
        words.add("слон");
        words.add("слон");
        words.add("кот");
        words.add("мышь");
        words.add("кот");
        words.add("слон");
        System.out.println(getWordsCount(words));

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("a", 2);
        map1.put("a", 1);
        System.out.println("MAP: " + map1);
        //решение со Scanner
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            Integer count = map.get(str);
            if (count == null) {
                count = 1;
            }
            else {
                count++;
            }
            map.put(str, count);
        }
        System.out.println(map);
    }

    private static Map<String, Integer> getWordsCount(List<String> words) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            int cnt = 1;
            if (map.containsKey(s)) {
                cnt = map.get(s);
                cnt++;
            }
            map.put(s, cnt);
        }
        return map;
    }

}
