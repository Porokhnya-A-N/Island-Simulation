package module.animal.predators;

import module.animal.Animal;
import module.animal.AnimalType;
import java.util.List;
import static module.animal.AnimalType.*;
//волк
public class Wolf extends Animal {
    public Wolf() {
        super(50, 8, 3, 1, AnimalType.WOLF);
        setListHunting(List.of( HORSE,DEER,RABBIT,MOUSE,GOAT,SHEEP,BOAR,BUFFALO,DUCK));
        setListHuntingPresent(List.of( 10,15,60,80,60,70,15,10,40));
    }

    @Override
    public void reproduction() {

    }

}
