package module.animal.predators;

import module.animal.Animal;
import module.animal.AnimalType;
import module.animal.predators.hunting.BearHunting;

//медведь
public class Bear extends Animal {
    BearHunting bearHunting;
    public Bear() {

        super(500, 80, 2, 1, AnimalType.BEAR);
    }
    @Override
    public void reproduction() {

    }
}
