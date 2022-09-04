package module.animal.predators;

import module.animal.Animal;
import module.animal.AnimalType;

import java.util.List;

import static module.animal.AnimalType.*;

//орел
public class Eagle extends Animal {

    public Eagle() {
        super(6, 1, 3, 1, AnimalType.EAGLE);
        setMaxAnimal(20);
        setListHunting(List.of(FOX,RABBIT,MOUSE,DUCK));
        setListHuntingPresent(List.of( 10,90,90,80));

        //FOX(10),RABBIT(90),MOUSE(90),DUCK(80);
    }
    @Override
    public void reproduction() {

    }
}
