package week4.StreamNIOFunctional.streams.task3;

/*
Проверить, является ли текст палиндром.
Из исходной строки с помощью стримов убрать все символы,
не являющиеся цифрой или буквой, привести к нижнему регистру.
 */
public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aB121ba"));
    }
    
    public static boolean isPalindrome(String s) {
        StringBuilder leftToRight = new StringBuilder();
        s.chars()
              .filter(Character::isLetterOrDigit)
              .map(Character::toLowerCase)
              .forEach(leftToRight::appendCodePoint);
        
        StringBuilder rightToLeft = new StringBuilder(leftToRight).reverse();
        
        return leftToRight.toString().equals(rightToLeft.toString());
    }
    
}
