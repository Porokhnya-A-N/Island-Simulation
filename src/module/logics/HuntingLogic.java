package module.logics;

import module.animal.Animal;
import module.animal.predators.Wolf;
import module.world.cell.EarthCell;

import java.util.List;

public class HuntingLogic {
    EarthCell earthCell;

    public int startHunting(Animal object, EarthCell cell) {
        int typeAnimal = 0;
        int percent = 0;
        earthCell = cell;
        Animal animal = null;
        typeAnimal = object.toGenerate(object.getListHunting().size() - 1);
        percent = object.getListHuntingPresent().get(typeAnimal);
        List<Animal> list = cell.getMapAnimal().get(object.getListHunting().get(typeAnimal));
        if(list.size() == 0) {
            animal = list.isEmpty() ? null : list.get(0);
        }else {
            animal = list.get(object.toGenerate(list.size() - 1));
        }
        if(animal != null && animal.isDead()) {
            if (object.toGenerate(100) >= (100 - percent)) {
                System.out.println(" - " + object.getRealSatiety());
                object.eat(animal.getWeight());
                System.out.println(" + "+object.getRealSatiety());
                animal.setHp(0);
                return 0;
            } else {
                return 1;
            }
        }else {
            return startHunting(object,cell);
        }
    }
}
