package module.animal.herbivores;

import module.animal.Animal;
import module.animal.AnimalType;

import java.util.List;

import static module.animal.AnimalType.PLANTS;

//коза
public class Goat extends Animal {
    public Goat () {
        super(60, 10, 3, 1, AnimalType.GOAT);
        setMaxAnimal(140);
        setListHunting(List.of(PLANTS));
        setListHuntingPresent(List.of( 100));
    }
}
