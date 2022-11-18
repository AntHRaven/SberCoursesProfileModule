package week4.StreamNIOFunctional.streams;

import java.util.List;

//https://javarush.ru/groups/posts/845-lambda-vihrazhenija-na-primerakh
/*
примеры
TODO: прочесть про функциональные интерфейсы (предикаты, функции и тп) https://habr.com/ru/post/677610/
 */
public class StreamExamples {
    public static void main(String[] args) {
        List<String> myPlaces = List.of("Nepal, Kathmandu", "Nepal, Pokhara", "India, Delhi", "USA, New York", "Africa, Nigeria");
        
        //фильтрация городов с выводом на экран
        myPlaces.stream()
              .filter((p) -> p.startsWith("Nepal"))
              .map(String::toUpperCase)
              //.map((p) -> p.toUpperCase())
              .sorted()
              .forEach(System.out::println);
              //.forEach((p) -> System.out.println(p));
        //Выражение System.out::println является ссылкой на метод, который эквивалентен лямбда-выражению x -> System.out.println(x).
    }
}
