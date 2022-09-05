package module.logics;

import module.animal.Animal;
import module.world.cell.EarthCell;

import java.util.List;

public class BreedingLogic {
    public int startReproduction(Animal object , EarthCell cell){
        if(cell.getMapAnimal().get(object.getAnimalType()).size() < object.getMaxAnimal()) {
            List<Animal> animals = cell.getMapAnimal().get(object.getAnimalType());
            for (Animal animal:animals) {
                if(animal.isDead() && animal.getRealSatiety()>(animal.getSatiety()*0.9)){
                    animals.add(object.reproduction());
                    object.setRealSatiety(object.getRealSatiety() - (object.getSatiety()*0.5));
                    break;
                }
            }
            return 0;
        }else{
            return 1;
        }
    }
}
