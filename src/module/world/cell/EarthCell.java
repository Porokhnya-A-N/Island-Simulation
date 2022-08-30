package module.world.cell;

import module.animal.Animal;
import module.animal.AnimalType;
import module.world.Create;

import java.util.List;
import java.util.Map;

public class EarthCell extends Cell implements Create {
    private AnimalType plantsAndAnimal;
    Map<String, List<Animal>> mapAnimal;
    @Override
    public void create() {

    }
}

