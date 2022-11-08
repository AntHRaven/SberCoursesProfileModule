package week2.GenericsAndCollections.library;

import java.util.HashSet;

public class Author {

  private Integer id;
  private Integer name;
  private HashSet<Book> books;

  public Author(Integer id, Integer name, HashSet<Book> books) {
    this.id = id;
    this.name = name;
    this.books = books;
  }

  public Author() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getName() {
    return name;
  }

  public void setName(Integer name) {
    this.name = name;
  }

  public HashSet<Book> getBooks() {
    return books;
  }

  public void setBooks(HashSet<Book> books) {
    this.books = books;
  }
}
