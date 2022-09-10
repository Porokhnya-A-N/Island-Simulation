package module.animal.plants;

import module.animal.Animal;
import module.animal.AnimalType;

public class Plants extends Animal {
    public Plants() {
        super(1, 0, 0, 1, AnimalType.PLANTS);
        setMaxAnimal(200);
        setMove(0);
    }
}
