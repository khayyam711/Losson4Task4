package business.concretes;

import business.abstracts.IControlManager;
import entities.concretes.Entity;

import java.util.List;

public class ControlManager implements IControlManager {


    @Override
    public boolean checkNameIsEmpty(Entity entity) {
        if (entity.getName().isEmpty()){
            return  true;
        }
        return  false;
    }

    @Override
    public boolean checkNameIsRepeat(List<Entity> entityList, Entity entity) {
        for (Entity entityCur:entityList){
            if (entityCur.getName()==entity.getName())
                return  true;
        }
        return  false;
    }
}
