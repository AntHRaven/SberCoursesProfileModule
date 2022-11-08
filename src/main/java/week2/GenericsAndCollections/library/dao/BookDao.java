package week2.GenericsAndCollections.library.dao;

import java.util.List;
import week2.GenericsAndCollections.library.Book;
import week2.GenericsAndCollections.library.Library;

public class BookDao implements GenericDao<Book>{
  List<Book> books = Library.getBookList();

  @Override
  public Book getById(Integer id) {
    for(Book book : books) {
      if(book.getId().equals(id)) {
        return book;
      }
    }
    return null;
  }

  @Override
  public Book create(Book obj) {
    books.add(obj);
    Library.setBookList(books);
    return obj;
  }

  @Override
  public void delete(Integer id) {
    List<Book> books = Library.getBookList();
    books.remove(getById(id));
    Library.setBookList(books);
  }

  @Override
  public Book update(Book newObj) {
    delete(newObj.getId());
    create(newObj);
    return newObj;
  }

  @Override
  public List<Book> getAll() {
    return books;
  }
}
