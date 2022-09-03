package module.animal.predators;
import module.animal.Animal;
import module.animal.AnimalType;
import module.animal.predators.hunting.BoaHunting;

//Питон
public class Boa extends Animal {
    BoaHunting boaHunting;
    public Boa() {
        super(15, 3, 1, 1, AnimalType.BOA);
    }
    @Override
    public void reproduction() {

    }
}
