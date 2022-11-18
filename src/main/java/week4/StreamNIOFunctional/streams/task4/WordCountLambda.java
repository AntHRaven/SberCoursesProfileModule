package week4.StreamNIOFunctional.streams.task4;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Вывести количество повторений каждой строки и саму строку
 */
public class WordCountLambda {
    
    public static void main(String[] args) {
        List<String> names = List.of("Sam", "James", "Elena", "James", "Joe", "Sam", "James");
        
        //1 способ (после обычного цикла)
        Set<String> unique = new HashSet<>(names);
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(names, key));
        }
        
        //2 способ
        Map<String, Long> frequencyMap = names.stream()
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //select name, count(*)
        //from table
        //group by name
        System.out.println(frequencyMap);
        
        //3 способ
        Map<String, Integer> counts = names.parallelStream()
              .collect(Collectors.toConcurrentMap(w -> w, w -> 1, Integer::sum));
        System.out.println(counts);
    }
}
