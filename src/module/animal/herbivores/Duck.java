package module.animal.herbivores;

import module.animal.Animal;
import module.animal.AnimalType;

import java.util.List;

import static module.animal.AnimalType.CATERPILLAR;
import static module.animal.AnimalType.PLANTS;

//утка
public class Duck extends Animal {
    public Duck() {
        super(1, 0.15, 4, 1, AnimalType.DUCK);
        setListHunting(List.of(CATERPILLAR,PLANTS));
        setListHuntingPresent(List.of( 90,100));
    }







    @Override
    public void reproduction() {

    }
}
