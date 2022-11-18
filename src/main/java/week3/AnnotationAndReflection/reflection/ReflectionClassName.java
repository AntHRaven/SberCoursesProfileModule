package week3.AnnotationAndReflection.reflection;

/*
получение имени класса из Class
 */
public class ReflectionClassName {
    /*
    1) getName()
    полное имя класса (ex: java.lang.Integer)

    2) getSimpleName()
    короткое имя (без пакетов) - (ex:Integer)

    3) getPackage().getName()
    получать только имя пакета (ex: java.lang)
     */

    public static void main(String[] args) {
        printNamesForClass(int.class, "int.class (primitives)");
        printNamesForClass(String.class, "String.class");
        printNamesForClass(java.util.HashMap.class,
                           "java.util.HashMap.class (nested class)");
        printNamesForClass(week3.AnnotationAndReflection.reflection.SimpleClass.class, "SimpleClass.class (custom class)");
    }

    public static void printNamesForClass(Class<?> clazz, String label) {
        System.out.println(label + ":");
        System.out.println("   getName():\t\t\t\t\t\t" + clazz.getName());
        System.out.println("   getSimpleName():\t\t\t" + clazz.getSimpleName());
        //https://stackoverflow.com/questions/15202997/what-is-the-difference-between-canonical-name-simple-name-and-class-name-in-jav
        System.out.println("   getCanonicalName():\t" + clazz.getCanonicalName()); //каноническое имя — это имя, которое будет использоваться в операторе импорта.
        System.out.println("   getTypeName():\t\t\t\t" + clazz.getTypeName()); //added in Java 8
        System.out.println();
    }

}
