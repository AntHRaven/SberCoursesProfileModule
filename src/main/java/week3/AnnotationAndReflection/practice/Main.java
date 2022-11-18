package week3.AnnotationAndReflection.practice;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {


    public static void main(String[] args) {

        SomeClassWithMethods someClassWithMethods = new SomeClassWithMethods();
        LoggingService.log(someClassWithMethods, "foo");
        someClassWithMethods.foo(1);
        LoggingService.log(someClassWithMethods, "bar");
        someClassWithMethods.bar(1);
        LoggingService.log(someClassWithMethods, "baz");
        someClassWithMethods.baz(1);
//        List<String> privateFieldsAndMethods = firstExample(SimpleClass.class);
//        for(String value : privateFieldsAndMethods) {
//            System.out.println(value);
//        }

        SimpleClass simpleClass = new SimpleClass();
//        System.out.println(simpleClass.publicString);
//        System.out.println(simpleClass.publicInteger);
//        System.out.println(simpleClass.publicDate);
        try {
//            setDefaultValue(SimpleClass.class, simpleClass);
//            System.out.println(simpleClass.publicString);
//            System.out.println(simpleClass.publicInteger);
//            System.out.println(simpleClass.publicDate);
            System.out.println("----");
            System.out.println(simpleClass);
            setDefaultValueFromAnnotation(SimpleClass.class, simpleClass);
            invokeMethodWithAnnotation(SimpleClass.class, simpleClass);
            System.out.println(simpleClass);
        }
        catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
    //Задача 1
    //Вывести список всех приватных полей и методов класса
    public static List<String> firstExample(Class<?> cls) {
        List<String> privateList = new ArrayList<>();
        List<Field> fields = getAllPrivateFields(cls);
        List<Method> methods = getAllPrivateMethods(cls);

        for(Field field : fields) {
            privateList.add(field.getName());
        }

        for (Method method : methods) {
            privateList.add(method.getName());
        }

//        privateList.addAll(getAllPrivateFields(cls).stream().map(Field::getName).toList());
//        privateList.addAll(getAllPrivateMethods(cls).stream().map(Method::getName).toList());
        return privateList;
    }

    public static List<Field> getAllPrivateFields(Class<?> cls) {
        List<Field> privateFields = new ArrayList<>();

        for (Field field : cls.getDeclaredFields()) {
            if (Modifier.isPrivate(field.getModifiers())) {
                privateFields.add(field);
            }
        }

        return privateFields;
    }

    public static List<Method> getAllPrivateMethods(Class<?> cls) {
        List<Method> privateMethods = new ArrayList<>();
        for (Method method : cls.getDeclaredMethods()) {
            if (Modifier.isPrivate(method.getModifiers())) {
                privateMethods.add(method);
            }
        }

        return privateMethods;
    }

//    Поиск количества схожих названий полей,
//    если схожих полей больше половины от количества полей в классе с наибольшим кол-вом полей,
//    выводить предупреждение
    public static void compareClassFields(Class<?> firstClass, Class<?> secondClass) {
        Set<String> firstClassFields = new HashSet<>();
        for(Field field : firstClass.getDeclaredFields()) {
            firstClassFields.add(field.getName());
        }

        Set<String> secondClassFields = new HashSet<>();
        for(Field field : secondClass.getDeclaredFields()) {
            firstClassFields.add(field.getName());
        }

//        Set<String> firstClassFields = Arrays
//              .stream(firstCSlass.getDeclaredFields())
//              .map(Field::getName)
//              .collect(Collectors.toSet());
//        Set<String> secondClassFields = Arrays
//              .stream(secondClass.getDeclaredFields())
//              .map(Field::getName)
//              .collect(Collectors.toSet());

        Set<String> maxFieldsSet = firstClassFields;
        Set<String> minFieldsSet = secondClassFields;

        if(secondClass.getDeclaredFields().length > maxFieldsSet.size()) {
           maxFieldsSet = secondClassFields;
           minFieldsSet = firstClassFields;
        }

        int countFields = maxFieldsSet.size();
        maxFieldsSet.removeAll(minFieldsSet);
        if(maxFieldsSet.size() < countFields / 2) {
            System.out.println("Классы содержат много схожих по имени полей");
        }
    }

//    public static void compareClassFields(Class<?> firstClass, Class<?> secondClass) {
//        Set<String> firstClassFields = Arrays.stream(firstClass.getDeclaredFields()).map(Field::getName).collect(Collectors.toSet());;
//        Set<String> secondClassFields = Arrays.stream(secondClass.getDeclaredFields()).map(Field::getName).collect(Collectors.toSet());;
//
//        Set<String> commonFields = new ArrayList<>(firstClassFields);
//        commonFields.retainAll(secondClassFields);
//        if (commonFields.size() > firstClassFields.size() / 2 || commonFields.size() > secondClassFields.size() / 2) {
//            System.out.println("warning!");
//        }
//    }


//    Методы который устанавливает дефолтное значение всем полям класса если значения не указаны (для разных типов: String, Integer, Date)
    public static void setDefaultValue(Class<?> cls, Object object) throws IllegalAccessException {
//        AccessibleObject.setAccessible(cls.getDeclaredFields(), true);
        for(Field field : getAllFields(cls)) {
            if(Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(true);
            }
            if(field.get(object) == null) {
                if(field.getType() == Integer.class) {
                    field.set(object, 0);
                }
                if(field.getType() == String.class) {
                    field.set(object, "defaultValue");
                }
                if (field.getType() == Date.class) {
                    field.set(object, new Date());
                }
            }
        }
    }

    public static List<Field> getAllFields(Class<?> cls) {
        return List.of(cls.getDeclaredFields());
    }

    //Установить значение указанное в аннотации для поля помеченного этой аннотацией
    public static void setDefaultValueFromAnnotation(Class<?> cls, Object object) throws IllegalAccessException {
        List<Field> fields = getAllFields(cls);
        for(Field field : fields) {
            if(!field.isAnnotationPresent(SetValue.class)) {
                continue;
            }

            SetValue setValue = field.getAnnotation(SetValue.class);
            if(Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(true);
            }
            field.set(object, setValue.value());
        }
    }

    //Выполнить метод помеченный аннотацией
    public static void invokeMethodWithAnnotation(Class<?> cls, Object object) throws InvocationTargetException, IllegalAccessException {
        List<Method> methods = List.of(cls.getDeclaredMethods());
        for(Method method : methods) {
            if(method.isAnnotationPresent(Invoke.class)) {
                if(Modifier.isPrivate(method.getModifiers())) {
                    method.setAccessible(true);
                }

                method.invoke(object);
            }
//            Invoke invoke = method.getAnnotation(Invoke.class);

        }
    }
}
