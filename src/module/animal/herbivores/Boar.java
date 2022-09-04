package module.animal.herbivores;

import module.animal.Animal;
import module.animal.AnimalType;

import java.util.List;

import static module.animal.AnimalType.*;

//кабан
public class Boar extends Animal {
    public Boar() {
        super(400, 50, 2, 1, AnimalType.BOAR);
        setMaxAnimal(50);
        setListHunting(List.of(MOUSE,CATERPILLAR,PLANTS));
        setListHuntingPresent(List.of( 50,90,100));
    }
}
