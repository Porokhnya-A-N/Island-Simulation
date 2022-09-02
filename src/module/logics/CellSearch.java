package module.logics;

import module.animal.Animal;
import module.animal.AnimalType;
import module.world.cell.EarthCell;

import java.util.List;
import java.util.Map;

public class CellSearch {
    int coordinateX, coordinateY;
    private EarthCell earthCell;

    public void openCell(EarthCell earthCell){
        AnimalType[] type = AnimalType.values();
        Basic logic = new Basic();
        Map<AnimalType, List<Animal>> map = earthCell.getMapAnimal();
        for (int i = 0; i < type.length ; i++) {
            List<Animal> list =  map.get(type[i]);
            for (int j = 0; j < list.size(); j++) {
                logic.launchBasicLogic(list.get(j));
            }

        }

    }
}
