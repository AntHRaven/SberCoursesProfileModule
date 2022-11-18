package week2.GenericsAndCollections;

//https://metanit.com/java/tutorial/5.6.php
public class Person implements Comparable<Person> {

  private String name;
  private Integer age;

  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

//  Интерфейс Comparable содержит один единственный метод int compareTo(E item),
//  который сравнивает текущий объект с объектом, переданным в качестве параметра.
//  Если этот метод возвращает отрицательное число, то текущий объект будет располагаться перед тем,
//  который передается через параметр. Если метод вернет положительное число, то,
//  наоборот, после второго объекта. Если метод возвратит ноль, значит, оба объекта равны.
  @Override
  public int compareTo(Person p) {
    return name.length()-p.getName().length();
  }
}
