package day12;

import java.util.ArrayList;
import java.util.List;

public class ManService<T> implements People<T>{

    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void doSomeThing(T doing) {
        System.out.println(doing);
    }


    @Override
    public void insert(T Object) {
        list.add(Object);
    }

    @Override
    public void update(T Object) {

    }

    @Override
    public List<T> findAdll() {
        return list;
    }

    @Override
    public void remove(T Object) {

    }

}
