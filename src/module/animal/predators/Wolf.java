package module.animal.predators;

import module.animal.Animal;
import module.animal.AnimalType;
import module.animal.predators.hunting.WolfHunting;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

//волк
public class Wolf extends Animal {
    public WolfHunting wolfHunting;
    public Wolf() {
        super(50, 8, 3, 1, AnimalType.WOLF);
    }

    @Override
    public void reproduction() {

    }
}
