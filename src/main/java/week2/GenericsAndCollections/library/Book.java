package week2.GenericsAndCollections.library;

import java.util.Objects;

public class Book {
  private Integer id;
  private String title;
  private String author;

  public Book(Integer id, String title, String author) {
    this.id = id;
    this.title = title;
    this.author = author;
  }

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public Book() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  //  Основные принципы переопределения
//  Если x.equals(y) == true, то обязательно hashcode(x) == hashcode(y)
//  Если hashcode(x) == hashcode(y), то не обязательно x.equals(y) == true

//  Реализация по умолчанию для equals
//  public boolean equals(Object x) {
//    return(this == y)
//  }
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 31 * hash + (title == null ? 0 : title.hashCode());
    hash = 31 * hash + (author == null ? 0 : author.hashCode());
    return hash;
  }
  //  Необходим для сравнения по значениям, а не по ссылке
  @Override
  public boolean equals(Object o) {
    // self check
    if (this == o)
      return true;
    // null check
    if (o == null)
      return false;
    // type check and cast
    if (getClass() != o.getClass())
      return false;
    Book person = (Book) o;
    // field comparison
    return Objects.equals(title, person.title)
        && Objects.equals(author, person.author);
  }

}
