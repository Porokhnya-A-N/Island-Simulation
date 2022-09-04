package module.animal.herbivores;

import module.animal.Animal;
import module.animal.AnimalType;

import java.util.List;

import static module.animal.AnimalType.PLANTS;

//кролик
public class Rabbit extends Animal {
    public Rabbit() {
        super(2, 0.45, 2, 1, AnimalType.RABBIT);
        setMaxAnimal(150);
        setListHunting(List.of(PLANTS));
        setListHuntingPresent(List.of( 100));
    }






    @Override
    public void reproduction() {

    }
}
