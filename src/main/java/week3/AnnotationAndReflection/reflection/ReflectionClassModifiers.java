package week3.AnnotationAndReflection.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/*
Получение модификаторов класса
getModifiers() позволяет узнать все модификаторы, с которыми был объявлен класс:
public native int getModifiers();

Модификаторы пакуются внутри битов инта, распаковать информацию можно методами класса Modifier:
public static boolean isPublic(int mod) { }
public static boolean isPrivate(int mod) { }
public static boolean isProtected(int mod) { }
public static boolean isStatic(int mod) { }
public static boolean isFinal(int mod) { }
public static boolean isInterface(int mod) { }
public static boolean isAbstract(int mod) { }
 */
/*
    Работа с полями
    getFields() - возвращает все публичные поля класса или интерфейса, включая унаследованные:
    public Field[] getFields() throws SecurityException;

    getDeclaredFields() возвращает вообще все поля класса или интерфейса, но исключая унаследованные:
    public Field[] getDeclaredFields() throws SecurityException

    getField(), getDeclaredField() - поле по его строчному имени.

    Основные методы класса Field:
    get() и set() позволяют прочитать и записать значение поля
    getName() возвращает имя поля
    getType() возвращает объект Class для его типа
    getModifiers() тоже есть и работает так же, как для Class
     */
public class ReflectionClassModifiers {

  public static void printAllFields(Class<?> clazz) {
    System.out.println("\nСписок всех полей и их модификаторов: ");
    for (Field field : clazz.getDeclaredFields()) {
      int mods = field.getModifiers();

      System.out.println("TEST: " + Modifier.toString(mods));
//      if (Modifier.isPublic(mods)) {
//        System.out.print("public ");
//      }
//      if (Modifier.isProtected(mods)) {
//        System.out.print("protected ");
//      }
//      if (Modifier.isPrivate(mods)) {
//        System.out.print("private ");
//      }
//      if (Modifier.isStatic(mods)) {
//        System.out.print("static ");
//      }
//      if (Modifier.isFinal(mods)) {
//        System.out.print("final ");
//      }
      System.out.println(field.getType().getSimpleName() + " " + field.getName());
    }
  }

  public static void printAllFieldsWithValues(Class<?> clazz, Task task) throws IllegalAccessException {
    printAllFields(clazz);
    for (Field field : clazz.getDeclaredFields()) {
      int mods = field.getModifiers();
      //Если поле приватное устанавливаем делаем его доступным для получения значения
      if (Modifier.isPrivate(mods)) {
        field.setAccessible(true);
      }
      System.out.println(field.get(task));
    }
  }

  public static void main(String[] args) throws IllegalAccessException {
    //пример получения модификатора
    System.out.println("Модификаторы класса");
    System.out.println(ReflectionClassModifiers.class.getModifiers()); //возвращает инт
    System.out.println("Класс публичный? " + Modifier.isPublic(ReflectionClassModifiers.class.getModifiers())); //проверяем является ли он публичным

    // Пример получения полей
    Class<?> cls = Task.class;
    System.out.println("\nСписок всех публичных полей (включая унаследованные)");
    //getFields возвращает все публичные поля класса или интерфейса, включая унаследованные
    Arrays.stream(cls.getFields()).forEach((i) -> {
      System.out.println("Имя поля: " + i.getName() + "\tТип поля: " + i.getType().getSimpleName());
    });
    System.out.println("\nСписок полей (без унаследованных)");
    //getDeclaredFields возвращает вообще все поля класса или интерфейса, но исключая унаследованные
    Arrays.stream(cls.getDeclaredFields()).forEach((i) -> {
      System.out.println("Имя поля: " + i.getName() + "\tТип поля: " + i.getType().getSimpleName());
    });
    try {
      //Выводим значение конкретного поля

      Task task = new Task();
      Field field = Task.class.getField("field");
      System.out.println(field.getName());
      System.out.println(field.getType());
      System.out.println(field.get(task));

      //ЗАДАЧА 2
      //Выводим все значения всех доступных полей
//      Arrays.stream(cls.getDeclaredFields()).forEach((i) -> {
//        try {
//          //Поле не должно быть приватным
//          if(!Modifier.isPrivate(i.getModifiers())) {
//            System.out.println("Имя поля: " + i.getName() + "\tТип поля: " + i.getType().getSimpleName() + " Значение поля: " + i.get(task));
//          }
//        } catch (IllegalAccessException e) {
//          e.printStackTrace();
//        }
//      });
      field.set(task, "test");
      System.out.println("Значение поля field после изменения: " + field.get(task));

    } catch (NoSuchFieldException e) {
      e.printStackTrace();
    }
        /*
        Задача:
        Вывести все поля класса, их модификаторы и типы.
        */
    printAllFields(Task.class);
        /*
        Продолжение задачи 2.
        Создать инстанс класса Task и вывести значения его полей.
        (Подсказка): Для приватных полей нужно делать setAccessible = true
         */
    Task task = new Task();
    task.i = 777;
    printAllFieldsWithValues(Task.class, task);
  }

}

class Task extends TaskExt {

  public String field = "field";
  public static boolean a = false;
  static String b = "";
  protected Integer i;
  private double d = 0.5;
}

class TaskExt {
  public String j;
  private String e;
}
