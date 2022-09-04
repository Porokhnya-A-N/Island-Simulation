package module.animal.predators;

import module.animal.Animal;
import module.animal.AnimalType;

import java.util.List;

import static module.animal.AnimalType.*;

//медведь
public class Bear extends Animal {
    public Bear() {

        super(500, 80, 2, 1, AnimalType.BEAR);
        setMaxAnimal(5);
        setListHunting(List.of(BOA,HORSE,DEER,RABBIT,MOUSE,GOAT,SHEEP,BOAR,BUFFALO,DUCK));
        setListHuntingPresent(List.of( 80,40,80,80,80,70,70,50,20,10));
        //BOA(80),HORSE (40),DEER(80),RABBIT(80),MOUSE(80),GOAT(70),SHEEP(70),BOAR(50),BUFFALO(20),DUCK(10);
    }
}
