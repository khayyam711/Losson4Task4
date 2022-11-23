package dataAccess.abstracts;

import entities.concretes.Entity;
import entities.concretes.Memory;

public interface IMemoryRepository {
    public void add(Entity entity);
}
