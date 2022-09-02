package module.animal.predators;

import module.animal.Animal;
import module.animal.AnimalType;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

//волк
public class Wolf extends Animal {
    @Override
    public void setHunting(List<AnimalType> hunting) {
        super.setHunting(Arrays.asList(AnimalType.HORSE,AnimalType.DEER,AnimalType.RABBIT,
                AnimalType.MOUSE,AnimalType.GOAT,AnimalType.SHEEP,AnimalType.BOAR,AnimalType.BUFFALO,AnimalType.DUCK));
    }
    public Wolf() {
        super(50, 8, 3, 1, AnimalType.WOLF);
    }






    @Override
    public void reproduction() {

    }
}
