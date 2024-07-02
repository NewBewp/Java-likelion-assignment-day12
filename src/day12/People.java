package day12;

import java.util.List;

public interface People <T>{
    void doSomeThing (T doing);
    void insert(T Object);
    void update(T Object);
    List findAdll();
    void remove(T Object);

}
