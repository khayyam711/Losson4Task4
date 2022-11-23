package business.abstracts;

import entities.concretes.Entity;

import java.util.List;

public interface IControlManager {

    boolean checkNameIsEmpty(Entity entity);
    boolean checkNameIsRepeat(List<Entity> entityList, Entity entity);
}
