package day12.exersise.ClassManagement.Interfaces;

import java.util.List;

public interface StudentInterface<S> {
    void insert(S Student);
    List<S> findAll();
    void showAll();

}
