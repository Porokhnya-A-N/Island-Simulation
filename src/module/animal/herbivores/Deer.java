package module.animal.herbivores;

import module.animal.Animal;
import module.animal.AnimalType;

import java.util.List;

import static module.animal.AnimalType.PLANTS;

//олень
public class Deer extends Animal {
    public Deer() {
        super(300, 50, 4, 1, AnimalType.DEER);
        setMaxAnimal(20);
        setListHunting(List.of(PLANTS));
        setListHuntingPresent(List.of( 100));
    }
}
