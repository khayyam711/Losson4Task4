package dataAccess.concretes;

import business.concretes.ControlManager;
import dataAccess.abstracts.IProgrammingLanguageRepository;
import entities.concretes.Entity;
import java.util.List;

public class ProgrammingLanguageRepository implements IProgrammingLanguageRepository {

    private MemoryRepository memoryRepository;
    private ControlManager controlManager;
    public ProgrammingLanguageRepository(MemoryRepository memoryRepository,ControlManager controlManager) {
        this.memoryRepository = memoryRepository;
        this.controlManager=controlManager;
    }

    @Override
    public void add(Entity entity) {
        if(controlManager.checkNameIsRepeat(memoryRepository.entityList,entity) || controlManager.checkNameIsEmpty(entity))
        {
            System.out.println("oops!...This name is already use");
        }
        else {
            memoryRepository.add(entity);
        }
    }

    @Override
    public void delete(Entity entity) {
        memoryRepository.entityList.remove(entity);
    }

    @Override
    public void update(Entity oldEntity,Entity newEntity) {
        if(controlManager.checkNameIsRepeat(memoryRepository.entityList,newEntity) || controlManager.checkNameIsEmpty(newEntity))
        {
            System.out.println("oops!...This name is already use");
        }
        else {
            memoryRepository.entityList.set(memoryRepository.entityList.indexOf(oldEntity),newEntity);
        }
    }

    @Override
    public List<Entity> getAll() {
        return memoryRepository.entityList;
    }

    @Override
    public Entity getElementsById(int id) {
        for(Entity entity: memoryRepository.entityList){
            if(entity.getId()==id)
                return  entity;
        }
        Entity entity=new Entity();
        return entity;
    }
}
