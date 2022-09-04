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
//        System.out.println("--" + object.getAnimalType());
        typeAnimal = object.toGenerate(object.getListHunting().size() - 1);
//        System.out.println(typeAnimal);
        percent = object.getListHuntingPresent().get(typeAnimal);
//        System.out.println(percent);
//        System.out.println(object.getListHunting().get(typeAnimal));
        List<Animal> list = cell.getMapAnimal().get(object.getListHunting().get(typeAnimal));
        if(list.size() == 0) {
            animal = list.isEmpty() ? null : list.get(0);
        }else {
            animal = list.get(object.toGenerate(list.size() - 1));
        }
//        System.out.println("-----------------");
        if(animal != null && animal.isDead()) {
            if (object.toGenerate(100) >= (100 - percent)) {
                object.eat(animal.getWeight());
                animal.setHp(0);
                System.out.println(animal.getAnimalType() + "dead hunting");
                return 0;
            } else {
                return 1;
            }
        }else {
            return startHunting(object,cell);
        }
    }
}
