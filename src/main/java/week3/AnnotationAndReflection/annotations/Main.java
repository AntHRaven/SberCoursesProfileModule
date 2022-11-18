package week3.AnnotationAndReflection.annotations;
/*
Аннотации - это форма метаданных.
Они предоставляют информацию о программе, при том сами частью программы не являются.

Применение:
1) Информация для компилятора. Для нахождения ошибок и подавления предупреждений.
2) Обработка во время компиляции и развертывания. Программа может создавать код, XML-документы и тп.
на основе аннотаций.
3) Обработка во время выполнения программы.
Некоторые аннотации могут использоваться во время выполнения программы.
 */

/*
Стандартные аннотации:
Как пример - встроенные в джава аннотации, типа @Depricated
 */
//public interface Summable {
//    int sum(int a, int b);
//}
//public class Summator implements Summable {
//
//    @Override
//    public int sum(int a, int b) {
//        return 0;
//    }
//}

//@SuppressWarnings

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

    }
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void suppressSet(){
        Set set = new HashSet();
        set.add(1);
        System.out.println(set.size());
    }
}
