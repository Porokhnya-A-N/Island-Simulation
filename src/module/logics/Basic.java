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
    private Animal object;
    private Island island;
    private EarthCell[][] earthCell;
    private EarthCell cell;
    public Basic(Island island){
        this.island = island;
    }

    private void launchBasicLogic(){
        if(object.isDead()){
            if(object.getRealSatiety() >= (object.getSatiety() *0.8)){
                //Запуск логики размножения.
                System.out.println("run logic 1");
                System.out.println(object.getSatiety());

            }else{
                //Запуск логики охоты.
               huntingLogic.startHunting(object,cell);
            }
        }else{
            object = null;
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
                System.out.println(object.getAnimalType());
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
