package week4.StreamNIOFunctional.functional.task5;

/*
Создать параметризованный функциональный интерфейс (Generics)
На выходе получить:
1) Строку наоборот
2) Факториал числа
 */
public class Main {
    public static void main(String[] args) {
        //Reverse
        MyGenericInterface<String> reverse = (str) -> new StringBuilder(str).reverse().toString();
        
        //factorial
        MyGenericInterface<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        
        System.out.println("Reversed string: " + reverse.func("Lambda"));
        System.out.println("n factorial: " + factorial.func(5));
    }
}
