package module.animal.herbivores;

import module.animal.Animal;
import module.animal.AnimalType;

import java.util.List;

import static module.animal.AnimalType.PLANTS;

//гусеница
public class Caterpillar extends Animal {
    public Caterpillar() {
        super(0.01, 0, 0, 1, AnimalType.CATERPILLAR);
        setMaxAnimal(100);
        setListHunting(List.of(PLANTS));
        setListHuntingPresent(List.of( 100));
    }







    @Override
    public void reproduction() {

    }
}
