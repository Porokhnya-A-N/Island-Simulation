package module.logics;

import module.animal.AnimalCount;
import module.animal.AnimalType;
import module.generation.Generation;
import module.generation.factory.AnimalFactory;
import module.world.Island;
import module.world.cell.EarthCell;

public class CreatePlantsLogic implements Generation {
    public void setIsland(Island island) {
        this.island = island;
    }

    AnimalFactory animalFactory = new AnimalFactory();
    Island island;
    public void openIsland(Island island){
        EarthCell[][] earthCells = island.getArrayCell();
        for (int i = 0; i <earthCells.length ; i++) {
            for (int j = 0; j < earthCells[i].length; j++) {
                EarthCell cell = earthCells[i][j];
                if(cell.getMapAnimal().get(AnimalType.PLANTS).size() < AnimalCount.MAX_PLANTS.getCount()){
                    int size = AnimalCount.MAX_PLANTS.getCount() - cell.getMapAnimal().get(AnimalType.PLANTS).size();
                    int random = toGenerate(size);
                    for(int k = 0 ; k < random; k++ )
                    cell.getMapAnimal().get(AnimalType.PLANTS).add(animalFactory.createAnimal(AnimalType.PLANTS));
                }
            }
        }
    }
}
