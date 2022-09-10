package module.logics;

import module.animal.Animal;
import module.world.cell.EarthCell;

import java.util.List;

public class HuntingLogic {
    EarthCell earthCell;
    public int startHunting(Animal object, EarthCell cell) {
        earthCell = cell;
        Animal animal = null;
        int typeAnimal = object.toGenerate(object.getListHunting().size() - 1);
        int percent = object.getListHuntingPresent().get(typeAnimal);
        List<Animal> list = cell.getMapAnimal().get(object.getListHunting().get(typeAnimal));
        if(list.isEmpty()) {
            for (int i = 0; i < object.getListHunting().size(); i++) {
                if(!cell.getMapAnimal().get(object.getListHunting().get(i)).isEmpty()){
                    list = cell.getMapAnimal().get(object.getListHunting().get(i));
                    animal = list.get(object.toGenerate(list.size() - 1));
                    break;
                }
            }
        }else{
            animal = list.get(object.toGenerate(list.size() - 1));
        }
        if(animal != null && animal.isDead()) {
            if(object.toGenerate(100) >= (100 - percent)) {
                object.eat(animal.getWeight());
                animal.setHp(0);
            } else {
                object.setRealSatiety(object.getRealSatiety() - (object.getSatiety()*0.2));
            }
            return 0;
        }else {
            return 1;
        }
    }
}
