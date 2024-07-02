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
        registry.put(entity.getId(), entity);
    }

    @Override
    public void update(String id, T updatedEntity) {
        registry.put(id, updatedEntity);
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<>(registry.values());
    }

    @Override
    public T getById(String id) {
        return registry.get(id);
    }
}
