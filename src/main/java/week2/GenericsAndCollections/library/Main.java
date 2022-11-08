package week2.GenericsAndCollections.library;

import week2.GenericsAndCollections.library.dao.BookDao;

public class Main {

  public static void main(String[] args) {
    BookDao bookDao =new BookDao();
    bookDao.create(new Book(1, "test", "test"));
    bookDao.create(new Book(2, "test2", "test2"));
    bookDao.create(new Book(3, "test3", "test3"));

    System.out.println("GET_ALL");
    bookDao.getAll().forEach(i -> {
      System.out.println(i.getTitle());
    });


    System.out.println("GET_BY_ID");
    System.out.println(bookDao.getById(1).getTitle());


    bookDao.delete(1);
    System.out.println("GET_ALL_AFTER_DELETE");

    bookDao.getAll().forEach(i -> {
      System.out.println(i.getTitle());
    });


    Book book = bookDao.getById(2);
    book.setTitle("UPDATED");
    bookDao.update(book);

    System.out.println("AFTER_UPDATE");
    bookDao.getAll().forEach(i -> {
      System.out.println(i.getTitle());
    });

  }
}
