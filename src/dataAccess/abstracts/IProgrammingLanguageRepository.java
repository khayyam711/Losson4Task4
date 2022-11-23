package dataAccess.abstracts;

import entities.concretes.Entity;

import java.util.List;

public interface IProgrammingLanguageRepository {
    void add(Entity entity);
    void delete(Entity entity);
    void update(Entity oldEntity,Entity newEntity);
    List<Entity> getAll();
    Entity getElementsById(int id);
}
