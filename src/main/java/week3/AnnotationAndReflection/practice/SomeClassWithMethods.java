package week3.AnnotationAndReflection.practice;

public class SomeClassWithMethods {

    @ToBeLogged
    public void foo(int a) {
        System.out.println("foo!" + a);
    }

    @ToBeLogged(logLevel = Logger.DEBUG)
    public void bar(int a) {
        System.out.println("bar!" + a);
    }

    public void baz(int a) {
        System.out.println("baz!" + a);
    }
}
