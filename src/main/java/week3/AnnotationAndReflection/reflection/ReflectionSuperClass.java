package week3.AnnotationAndReflection.reflection;
/*
Получение родителей
getSuperClass() - вернет Class родителей текущего класса
getInterfaces() - вернет список Class'ов интерфейсов, реализуемых текущим классом.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface A {}

interface B {}

class C
      implements A {}

class D
      extends C
      implements B {}

public class ReflectionSuperClass {
    /*
    запросить и вывести для класса D все интерфейсы
     */
    public static void main(String[] args) {
        //Получить класс родитель
        System.out.println("Класс родитель класса D -> " + D.class.getSuperclass().getSimpleName());

        //Получить список всех интерфейсов
        System.out.println("Интерфейсы класса D:");
        for (Class<?> cls : D.class.getInterfaces()) {
            System.out.println("\t" + cls.getSimpleName());
        }
        //увидим только B - так как не идет по иерархии,
        // и, соответственно, выводит только то, что в описании класса

        /*
        Задача:
        Получить все интерфейсы класса, включая интерфейсы от классов-родителей.
        Не включать интерфейсы родительских интерфейсов.
         */
        List<Class<?>> interfaces = getAllInterfaces(D.class);
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getSimpleName());
        }
    }

    // Берем переданный класс, заполняем лист его интерфейсами, в переменную cls записываем класс родитель и снова попадаем в цикл
    public static List<Class<?>> getAllInterfaces(Class<?> cls) {
        List<Class<?>> interfaces = new ArrayList<>();
        while (cls != Object.class) {
            interfaces.addAll(Arrays.asList(cls.getInterfaces()));
            cls = cls.getSuperclass();
        }
        return interfaces;
    }
}
