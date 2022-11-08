package week2.GenericsAndCollections.library.dao;

import java.util.List;

public interface GenericDao<T> {

  T getById(Integer id);
  T create(T obj);
  void delete(Integer id);
  T update(T newObj);
  List<T> getAll();

}
