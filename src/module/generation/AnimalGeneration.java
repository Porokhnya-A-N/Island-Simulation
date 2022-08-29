package module.generation;

import module.animal.Animal;
import module.animal.PlantsAndAnimal;

public class AnimalGeneration implements Generation{
    @Override
    public int toGenerate(int maxCount) {
        return (int) (Math.random() * maxCount);
    }


}
