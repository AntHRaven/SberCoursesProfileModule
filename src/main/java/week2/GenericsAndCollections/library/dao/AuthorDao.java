package week2.GenericsAndCollections.library.dao;

import java.util.List;
import week2.GenericsAndCollections.library.Author;
import week2.GenericsAndCollections.library.Book;
import week2.GenericsAndCollections.library.Library;

public class AuthorDao implements GenericDao<Author> {

  List<Author> authorList = Library.getAuthorList();

  @Override
  public Author getById(Integer id) {
    for(Author author : authorList) {
      if(author.getId().equals(id)) {
        return author;
      }
    }
    return null;
  }

  @Override
  public Author create(Author obj) {
    authorList.add(obj);
//    Library.setBookList(authorList);
    return obj;
  }

  @Override
  public void delete(Integer id) {

  }

  @Override
  public Author update(Author newObj) {
    return null;
  }

  @Override
  public List<Author> getAll() {
    return null;
  }

}
