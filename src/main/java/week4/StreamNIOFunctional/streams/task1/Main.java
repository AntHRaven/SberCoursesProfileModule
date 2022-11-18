package week4.StreamNIOFunctional.streams.task1;

import java.util.ArrayList;
import java.util.List;
import week4.StreamNIOFunctional.functional.task2.Square;

/*
Использовать реализованный функциональный интерфейс Square на массиве чисел, вывести на экран
 */
public class Main {
    public static void main(String[] args) {
        Square s = (int x) -> x * x;
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(10);
        
        nums.stream()
              //.map(num -> s.calculate(num))
              .map(s::calculate)
              .forEach(System.out::println);
    }
}
