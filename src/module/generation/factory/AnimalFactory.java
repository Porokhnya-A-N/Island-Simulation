package module.generation.factory;

import module.animal.Animal;
import module.animal.AnimalType;
import module.animal.herbivores.*;
import module.animal.predators.*;
//Фабрика для создания объектов.

public class AnimalFactory {
    public Animal createAnimal(AnimalType type){
        Animal animal =
        switch(type){
            case BEAR -> new Bear();
            case BOA -> new Boa();
            case EAGLE -> new Eagle();
            case FOX -> new Fox();
            case WOLF -> new Wolf();
            //------------------------
            case BOAR -> new Boar();
            case BUFFALO -> new Buffalo();
            case CATERPILLAR -> new Caterpillar();
            case DEER -> new Deer();
            case DUCK -> new Duck();
            case GOAT -> new Goat();
            case HORSE -> new Horse();
            case MOUSE -> new Mouse();
            case RABBIT -> new Rabbit();
            case SHEEP -> new Sheep();
            default -> null;
        };
        return animal;
    }
}
