package module.logics;

import module.animal.Animal;
import module.animal.AnimalType;
import module.world.Island;
import module.world.cell.EarthCell;

import java.util.List;

public class DeadLogic {
    List<Animal> animals;
    AnimalType[] types = AnimalType.values();
    public void startClearIsland(Island island){
        openIsland(island.getArrayCell());
    }
    private void openIsland(EarthCell[][] cells){
        for (int i = 0; i <cells.length ; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                openCell(cells[i][j]);
            }

        }
    }
    private void openCell(EarthCell cells){
        for (int i = 0; i < types.length; i++) {
            animals = cells.getMapAnimal().get(types[i]);
            clearDeadAnimal();
        }
    }
    private void clearDeadAnimal(){
        System.out.println("Hungry");
        hungryDeath();
        System.out.println("Remove");
        removeDeadAnimal();

    }
    private void removeDeadAnimal(){
        Animal animal = null;
        System.out.println(animals.isEmpty());
        if(!animals.isEmpty()) {
            for (int i = 0; i < animals.size(); i++) {
                animal = animals.get(i);
                if (animal.getHp() == 0) {
                    System.out.println("Remote Animal isDead" + animal.getAnimalType());
                    animals.remove(i);
                } else if (animal == null) {
                    System.out.println("Remote Animal isNull");
                    animals.remove(i);
                }
            }
        }
    }
    private void hungryDeath(){
        if(animals.isEmpty())
        for (Animal animal:animals) {
            if(animal.getRealSatiety() <= 0.0){
                animal.setHp(0);
            }
        }
    }
}
