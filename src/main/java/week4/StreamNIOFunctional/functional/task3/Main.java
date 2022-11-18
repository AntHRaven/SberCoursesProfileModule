package week4.StreamNIOFunctional.functional.task3;

public class Main {
    public static void main(String[] args) {
        //получить значение PI через наш интерфейс
        MyInterface ref = () -> Math.PI;
        System.out.println(ref.getPiValue());
        
        MyInterface ref2;
        ref2 = () -> 3.14;
    }
}
