package week4.StreamNIOFunctional.functional.task1;
//https://habr.com/ru/post/512730/ - статья с теорией
//вызов
public class Main {
    public static void main(String[] args) {
        //обычный привычный вызов
        Timer timer = new Timer();
        timer.measureTime(new SimpleSummator());
        System.out.println(timer.timeNanoseconds);
        
        //анонимным классом
        Timer timer1 = new Timer();
        timer1.measureTime(new Runnable() {
            @Override
            public void run() {
                long sum = 0;
                for (int i = 1; i <= 1_000_000_000; ++i) {
                    sum += i;
                }
                System.out.println(sum);
            }
        });
        System.out.println(timer1.timeNanoseconds);
        
        //начиная с 8 джавы можем использовать лямбда функции
        Timer timer2 = new Timer();
        timer1.measureTime(() -> {
            long sum = 0;
            for (int i = 1; i <= 1_000_000_000; ++i) {
                sum += i;
            }
            System.out.println(sum);
        });
        System.out.println(timer2.timeNanoseconds);
    }
}
