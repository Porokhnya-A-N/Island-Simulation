package module.world.cell;

import module.animal.Animal;
import module.animal.PlantsAndAnimal;
import module.world.Create;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class EarthCell extends Cell implements Create {
    private PlantsAndAnimal plantsAndAnimal;
    Map<String, List<Animal>> mapAnimal;
    @Override
    public void create() {

    }
}

