package module.world.cell;

import module.animal.Animal;
import module.animal.AnimalCount;
import module.animal.AnimalType;
import module.generation.Generation;
import module.generation.factory.AnimalFactory;
import module.world.Create;

import java.util.*;

public class EarthCell extends Cell implements Create, Generation {
    private AnimalType plantsAndAnimal;
    private AnimalCount animalCount;
    Map<AnimalType, List<Animal>> mapAnimal = new HashMap<>();
    public AnimalFactory animalFactory = new AnimalFactory();
    @Override
    public void create() {
        createLiveInCell();

    }
    private void createLiveInCell(){
        //Перебор значений ENUM
        AnimalType[] types = plantsAndAnimal.values();
        AnimalCount[] count = animalCount.values();
        //Заполнения животными клетки.
        for (int i = 0; i < types.length; i++) {
            mapAnimal.put(types[i],createAnimal(types[i], toGenerate(count[i].getCount())));
        }
    }
    private List<Animal> createAnimal(AnimalType type,int count){
        //Добавить проверку на 0.
        List<Animal> newList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
           newList.add(animalFactory.createAnimal(type));
        }
        return newList;
    }

    public Map<AnimalType, List<Animal>> getMapAnimal() {
        return mapAnimal;
    }
}

