package module.world.cell;

import module.animal.Animal;
import module.animal.AnimalType;
import module.generation.Generation;
import module.generation.factory.AnimalFactory;
import module.world.Create;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EarthCell extends Cell implements Create, Generation {
    private AnimalType plantsAndAnimal;
    Map<String, List<Animal>> mapAnimal = new HashMap<>();
    public AnimalFactory animalFactory = new AnimalFactory();
    @Override
    public void create() {
        createLiveInCell();

    }
    private void createLiveInCell(){
        AnimalType types[] = plantsAndAnimal.values();

        for(AnimalType type : types){
            System.out.println(type);

        }
    }
}

