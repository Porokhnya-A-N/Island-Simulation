package module.animal.herbivores;

import module.animal.Animal;
import module.animal.AnimalType;

import java.util.List;

import static module.animal.AnimalType.PLANTS;

//овца
public class Sheep extends Animal {
    public Sheep() {
        super(70, 15, 3, 1, AnimalType.SHEEP);
        setListHunting(List.of(PLANTS));
        setListHuntingPresent(List.of( 100));
    }





    @Override
    public void reproduction() {

    }
}
