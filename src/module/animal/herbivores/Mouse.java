package module.animal.herbivores;

import module.animal.Animal;
import module.animal.AnimalType;

import java.nio.CharBuffer;
import java.util.List;

import static module.animal.AnimalType.CATERPILLAR;
import static module.animal.AnimalType.PLANTS;

//мышь
public class Mouse extends Animal {
    public Mouse () {
        super(0.5, 0.1, 1, 1, AnimalType.MOUSE);
        setMaxAnimal(500);
        setListHunting(List.of(CATERPILLAR,PLANTS));
        setListHuntingPresent(List.of( 90,100));
    }






    @Override
    public void reproduction() {

    }
}
