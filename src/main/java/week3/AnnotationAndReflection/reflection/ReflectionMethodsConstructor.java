package week3.AnnotationAndReflection.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/*
Работа с методами
getMethods(),
getDeclaredMethods(),
getMethod(),
getDeclaredMethod()

Основные методы класса Method:
getModifiers()
getName()
newInstance() - Создаёт новый инстанс класса, вызвав конструктор

Работа с конструкторами:
getConstructors()
getDeclaredConstructors()
getConstructor()
getDeclaredConstructor()
 */
public class ReflectionMethodsConstructor {


    public static void main(String[] args) {

//        Задача 4:
//        Сконструировать класс.
//        То есть вызвать конструктор класса и обработать все возможные ошибки.

        Class<Task4> cls = Task4.class;
        //НАПИСАТЬ ВСЕ ИСКЛЮЧЕНИЯ
        try {
            Constructor<Task4> constructor = cls.getDeclaredConstructor(int.class, String.class);
            Task4 result = constructor.newInstance(142, "Test");
            System.out.println(result);
            System.out.println(result.a);
            System.out.println(result.b);
            //КОНЕЦ ЗАДАЧИ 4
            Method method = cls.getMethod("printHelloWorld");
            System.out.println("Получить метод по его имени " + method.getName());
            //Выполнить метод
            method.invoke(result);
            //Список всех методов
            showAllMethods(cls);
        }
        catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.println("ERROR: " + e.getMessage());
        }


    }

    private static void showAllMethods(Class<?> cls) {
        Arrays.stream(cls.getMethods()).forEach((i) -> {
            System.out.println("Имя метода: " + i.getName() + " Класс: " + i.getDeclaringClass().getSimpleName());
        });
    }
}

class Task4 {
    int a;
    String b;

    public Task4(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public void printHelloWorld() {
        System.out.println("hello world");
    }

    @Override
    public String toString() {
        return "Task4{" +
            "a=" + a +
            ", b='" + b + '\'' +
            '}';
    }
}
