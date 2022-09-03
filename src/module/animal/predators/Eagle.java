package module.animal.predators;

import module.animal.Animal;
import module.animal.AnimalType;
import module.animal.predators.hunting.EagleHunting;

//орел
public class Eagle extends Animal {
    EagleHunting eagleHunting;
    public Eagle() {
        super(6, 1, 3, 1, AnimalType.EAGLE);
    }
    @Override
    public void reproduction() {

    }
}
