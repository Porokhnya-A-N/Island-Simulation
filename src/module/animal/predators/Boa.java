package module.animal.predators;
import module.animal.Animal;
import module.animal.AnimalType;

import java.util.List;

import static module.animal.AnimalType.*;

//Питон
public class Boa extends Animal {

    public Boa() {
        super(15, 3, 1, 1, AnimalType.BOA);
        setListHunting(List.of(FOX,RABBIT,MOUSE,DUCK));
        setListHuntingPresent(List.of(15,20,40,10));
       // FOX(15),RABBIT(20),MOUSE(40),DUCK(10);
    }
    @Override
    public void reproduction() {

    }
}
