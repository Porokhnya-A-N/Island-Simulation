package module.animal.herbivores;

import module.animal.Animal;
import module.animal.AnimalType;

import java.util.List;

import static module.animal.AnimalType.*;

//лошадь
public class Horse extends Animal {
    public Horse() {
        super(400, 60, 4, 1, AnimalType.HORSE);
        setMaxAnimal(20);
        setListHunting(List.of(PLANTS));
        setListHuntingPresent(List.of( 100));
    }






    @Override
    public void reproduction() {

    }
}
