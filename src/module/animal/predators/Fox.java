package module.animal.predators;

import module.animal.Animal;
import module.animal.AnimalType;
import module.animal.predators.hunting.FoxHunting;

//лиса
public class Fox extends Animal {
    FoxHunting foxHunting;
    public Fox() {
        super(8, 2, 2, 1, AnimalType.FOX);
    }
    @Override
    public void reproduction() {

    }
}
