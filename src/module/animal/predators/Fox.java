package module.animal.predators;

import module.animal.Animal;
import module.animal.AnimalType;

import java.util.List;

import static module.animal.AnimalType.*;

//лиса
public class Fox extends Animal {

    public Fox() {
        super(8, 2, 2, 1, AnimalType.FOX);
        setListHunting(List.of(RABBIT,MOUSE,DUCK,CATERPILLAR));
        setListHuntingPresent(List.of(60,80,40,40));
        //RABBIT(60),MOUSE(80),DUCK(40), CATERPILLAR(40);
    }
    @Override
    public void reproduction() {

    }
}
