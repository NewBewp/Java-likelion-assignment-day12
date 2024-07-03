package day12.exersise.ClassManagement.Service;

import day12.exersise.ClassManagement.Entity.Entity;
import day12.exersise.ClassManagement.Interfaces.EntityInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntityService <T extends Entity> implements EntityInterface<T> {

    private Map<String, T> registry = new HashMap<>();

    @Override
    public void add(T entity) {
        registry.put(entity.getId(),entity);
    }

    @Override
    public void update(String id, T updatedEntity) {
        registry.put(id,updatedEntity);
    }

    @Override
    public  List<T> getAll() {
        List<T> entities = new ArrayList<>(registry.values());
        // In ra danh sách các thực thể
        for (T entity : entities) {
            System.out.println(entity.toString());
        }
        // Trả về danh sách các thực thể
        return entities;
    }

    @Override
    public T getById(String id) {
        return registry.get(id);
    }
}
