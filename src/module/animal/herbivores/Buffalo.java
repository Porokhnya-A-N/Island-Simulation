package module.animal.herbivores;

import module.animal.Animal;
import module.animal.AnimalType;

import java.util.List;

import static module.animal.AnimalType.PLANTS;

//буйвол
public class Buffalo extends Animal {
    public Buffalo() {
        super(700, 100, 3, 1, AnimalType.BUFFALO);
        setMaxAnimal(10);
        setListHunting(List.of(PLANTS));
        setListHuntingPresent(List.of( 100));
    }
}
