package dataAccess.concretes;

import dataAccess.abstracts.IMemoryRepository;
import entities.concretes.Entity;
import entities.concretes.Memory;

import java.util.ArrayList;
import java.util.List;

public class MemoryRepository  implements IMemoryRepository {

    public List<Entity> entityList =new ArrayList<>();

    public void add(Entity entity){
       entityList.add(entity);
    }

}
