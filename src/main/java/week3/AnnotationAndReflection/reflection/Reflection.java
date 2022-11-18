package week3.AnnotationAndReflection.reflection;
/*
Рефлексия (англ. reflection) – знание кода о самом себе
К рефлексии можно отнести возможность проитерироваться по всем полям класса
или найти и создать объект класса, по имени, заданному через текстовую строку
 */

public class Reflection {

  public static void main(String[] args) {
    //получить объект(ы) класса Class
    //1 Способ:
    Class<String> c1 = String.class;
    //поле .class - не настоящее поле, конструкция языка специальная.
    System.out.println(c1);
    //2 Способ:
    //метод getClass()
    //учитывает полиморфизм!
    String seq = "My String";
    Class<?> c2 = seq.getClass(); //вернется Class<String>
    System.out.println(c2);

    //3 способ:
    //найти класс по имени
    try {
      Class<?> integerClass = Class.forName("java.lang.Integer");
      System.out.println(integerClass);
    } catch (ClassNotFoundException ex) {
      System.out.println("Couldn't find the specified class");
    }

  }
}
