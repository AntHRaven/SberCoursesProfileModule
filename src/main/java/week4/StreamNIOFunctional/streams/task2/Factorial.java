package week4.StreamNIOFunctional.streams.task2;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
Посчитать n! с помощью стримов
 */
public class Factorial {
    public static void main(String[] args) {
        //для чисел меньше 20 (переполнение)
        System.out.println(fact(5));
        
        //для чисел больше 20
        System.out.println(factorial1(30));
    }
    
    public static int fact(int n) {
        return IntStream
              .rangeClosed(1, n)
              .reduce(1, (int x, int y) -> x * y);
    }
    
    public static BigInteger factorial1(int n) {
        return IntStream.rangeClosed(1, n)
              .mapToObj(BigInteger::valueOf)
              .reduce(BigInteger.ONE, BigInteger::multiply);
    }
    
    public static BigInteger fact1(int n) {
        return Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE))
              .limit(n)
              .reduce(BigInteger.ONE, BigInteger::multiply);
    }
}
