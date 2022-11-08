package week2.GenericsAndCollections;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {


  @Override
  public int compare(Person o1, Person o2) {
    return o2.getName().length()-o1.getName().length();
  }
}
