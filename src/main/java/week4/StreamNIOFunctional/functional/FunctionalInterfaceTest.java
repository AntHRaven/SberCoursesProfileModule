package week4.StreamNIOFunctional.functional;

public class FunctionalInterfaceTest {
    
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("я только что реализовал функциональный интерфейс");
            }
        }).start();
    }
}
