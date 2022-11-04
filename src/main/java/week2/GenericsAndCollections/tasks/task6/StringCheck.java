package week2.GenericsAndCollections.tasks.task6;

import java.util.Set;
import java.util.TreeSet;

/*
Задача с собеседований:
На вход подается строка, состоящая из маленьких латинских символов.
Проверить, что в строке встречаются все символы английского алфавита хотя бы раз:
thequickbrownfoxjumpsoverthelazydog -> true
sdfaaaa -> false
 */
public class StringCheck {

    public static boolean checkString(String sequence) {
        if (sequence.length() < 26) {
            return false;
        }
        Set<Character> set = new TreeSet<>();
        for (char ch : sequence.toCharArray()) {
            set.add(ch);
        }
        return set.size() == 26;
    }

    public static void main(String[] args) {
        System.out.println(checkString("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkString("sdfaaaa"));
    }
}
