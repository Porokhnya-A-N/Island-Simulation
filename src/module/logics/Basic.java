package module.logics;

import module.animal.Animal;
import module.animal.AnimalType;
import module.world.Island;
import module.world.cell.EarthCell;

import java.util.List;
import java.util.Map;

public class Basic {
    int coordinateX,coordinateY;
    private HuntingLogic huntingLogic = new HuntingLogic();
    private MovementLogic movementLogic = new MovementLogic();
    BreedingLogic breedingLogic = new BreedingLogic();
    private Animal object;
    private Island island;
    private EarthCell[][] earthCell;
    private EarthCell cell;
    public Basic(Island island){
        this.island = island;
    }

    private void launchBasicLogic(){
        if(object.isDead()) {
            if (object.getAnimalType() != AnimalType.PLANTS) {
                if (object.getRealSatiety() >= (object.getSatiety() * 0.8)) {
                    //Запуск логики размножения.
                    if (breedingLogic.startReproduction(object, cell) == 0) {
                        return;
                    } else {
                        if (object.toGenerate(100) > 50) {
                            movementLogic.startMove(0, coordinateX, coordinateY, object, earthCell);
                        } else {
                            movementLogic.startMove(1, coordinateX, coordinateY, object, earthCell);
                        }
                    }

                } else {
                    //Запуск логики охоты.
                    if (huntingLogic.startHunting(object, cell) == 0) {
                        return;
                    } else {
                        if (object.toGenerate(100) > 50) {
                            movementLogic.startMove(0, coordinateX, coordinateY, object, earthCell);
                        } else {
                            movementLogic.startMove(1, coordinateX, coordinateY, object, earthCell);
                        }
                    }

                }
            } else {
                object = null;
            }
        }
    }
    public void openIsland(){
        earthCell = island.getArrayCell();
        readCell();
    }
    private void openCell(){
       Map<AnimalType, List<Animal>> mapAnimal =  cell.getMapAnimal();
        for (int i = 0; i < AnimalType.values().length; i++) {
           List<Animal> animalList = mapAnimal.get(AnimalType.values()[i]);
            for (int j = 0; j < animalList.size(); j++) {
                object =animalList.get(j);
                launchBasicLogic();
            }

        }
    }
    private void readCell(){
        for (int i = 0; i < earthCell.length; i++) {
            for (int j = 0; j < earthCell[i].length; j++) {
                coordinateX = i; coordinateY = j;
                cell = earthCell[i][j];
                openCell();
            }
        }
    }

}
