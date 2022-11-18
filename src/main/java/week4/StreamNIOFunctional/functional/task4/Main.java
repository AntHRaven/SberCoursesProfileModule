package week4.StreamNIOFunctional.functional.task4;

/*
реализовать метод, чтобы вывести строку наоборот, используя наш ReverseInterface
 */
public class Main {
    public static void main(String[] args) {
        ReverseInterface reverseInterface = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        
        ReverseInterface reverseInterface1 = (str) -> new StringBuilder(str)
              .reverse()
              .toString();
        
        System.out.println(reverseInterface.reverse("Lambda"));
        System.out.println(reverseInterface1.reverse("Lambda"));
    }
}
