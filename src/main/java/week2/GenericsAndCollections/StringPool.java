package week2.GenericsAndCollections;

//https://topjava.ru/blog/rukovodstvo-po-string-pool-v-java

/*
В string pool сохраняются исключительно уникальные значения строковых литералов,
а не все строки подряд. Процесс помещения строк в пул называется интернирование

Когда мы объявляем переменную типа String и присваиваем ей строковый литерал,
то JVM обращается в пул строк и ищет там такое же значение. Если пул содержит необходимое значение,
то компилятор просто возвращает ссылку на соответствующий адрес строки без выделения дополнительной памяти.
Если значение не найдено, то новая строка будет интернирована, а ссылка на нее возвращена и присвоена переменной.
 */
public class StringPool {

  public static void main(String[] args) {
    //Способы создания String
    String stringLiteral = "Java"; //Хранится в String pool
    String stringViaConstructor = new String("Java"); //хранится в heap
    char[] chars = {'T', 'o', 'p', 'J', 'a', 'v', 'a'};
    String str = new String(chars); //хранится в heap

    String str1 = "test";
    String str2 = "test";
//    https://thumb.tildacdn.com/tild6234-6639-4065-a563-303961643637/-/resize/760x/-/format/webp/Frame_197.jpg
    System.out.println("Строка 1 равна строке 2? " + (str1 == str2)); //== сравнивает ссылки //true

    String str3 = "TopJava";
    String str4 = "Top" + "Java";

//    В строке «Top» + «Java» создаются два строковых объекта со значениями «Top» и «Java»,
//    которые помещаются в пул. «Склеенные» строки образуют еще одну строку со значением «TopJava»,
//    ссылка на которую берется из пула строк (а не создается заново), т.к. она была интернирована в него ранее.
//    https://thumb.tildacdn.com/tild3731-3831-4761-a165-616437383964/-/resize/760x/-/format/webp/Frame_215.jpg
    System.out.println("Строка 3 равна строке 4? " + (str3 == str4)); //true

    String str5 = "TopJava";
    String str6 = "Java";
    String str7 = "Top" + str6;

//    Причиной получения false является то, что интернирование происходит не во время работы приложения (runtime),
//    а во время компиляции. А т.к. значение строки str3 вычисляется во время выполнения приложения,
//    то на этапе компиляции оно не известно и потому, не добавляется в пул строк.
//    https://thumb.tildacdn.com/tild3734-3833-4834-b733-653938633934/-/resize/760x/-/format/webp/Frame_201_1.jpg
    System.out.println("Строка 5 равна строке 7? " + (str5 == str7)); //false

    //СОЗДАНИЕ ЧЕРЕЗ КОНСТРУКТОР
    String str8 = "TopJava";
    String str9 = "TopJava";
    String str10 = new String("TopJava");
    String str11 = new String("TopJava");

//    https://thumb.tildacdn.com/tild3231-3735-4564-b235-333766393963/-/resize/760x/-/format/webp/Frame_214.png
    System.out.println("Строка 8 равна строке 9? " + (str8 == str9)); //true
    System.out.println("Строка 9 равна строке 10? " + (str9 == str10)); //false
    System.out.println("Строка 10 равна строке 11? " + (str10 == str11)); //false


    //Ручное интернирование
    String str12 = "TopJava";
    String str13 = "TopJava";
    String str14 = (new String("TopJava")).intern();
    String str15 = (new String("TopJava")).intern();

//    https://thumb.tildacdn.com/tild3532-6331-4566-b735-373630383863/-/resize/760x/-/format/webp/Frame_202.jpg
    System.out.println("Строка 12 равна строке 13? " + (str12 == str13)); //true
    System.out.println("Строка 13 равна строке 14? " + (str13 == str14)); //true
    System.out.println("Строка 14 равна строке 15? " + (str14 == str15)); //true
  }
}
