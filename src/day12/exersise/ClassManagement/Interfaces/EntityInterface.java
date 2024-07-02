package day12.exersise.ClassManagement.Interfaces;

import java.util.List;

//interface chứa các phương thức để các interface khác kế thừa lại chức năng
public interface EntityInterface<T> {
    void add (T entity);
    void update (String id, T updatedEntity);
    List<T> getAll();
    T getById (String id);
}
