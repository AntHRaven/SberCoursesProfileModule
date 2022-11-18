package week4.StreamNIOFunctional.functional.task1;

/*
Задача 1
Создать таймер, который считает время выполнения метода, используя Runnable.
 */
public class SimpleSummator
      implements Runnable {
   //задаем свой метод
    @Override
    public void run() {
        long sum = 0;
        for (int i = 1; i <= 1_000_000_000; ++i) {
            sum += i;
        }
        System.out.println(sum);
    }
}
