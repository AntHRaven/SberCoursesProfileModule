package week4.StreamNIOFunctional.functional.task2;

/*
Задача 2
С помощью функционального интерфейса выполнить подсчет квадрата числа:
 */
public class Main {
    public static void main(String[] args) {
        Square s = (int x) -> x * x;
        
        Square s1 = new Square() {
            @Override
            public int calculate(int x) {
                return x * x;
            }
        };
        
        int a = 3;
        System.out.println(s.calculate(a));
        System.out.println(s1.calculate(a));
    }
}
