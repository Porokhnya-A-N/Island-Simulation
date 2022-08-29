package module.generation;

import module.animal.Animal;
import module.animal.PlantsAndAnimal;

public interface Generation {
     default int toGenerate(int maxCount){
          return (int) (Math.random() * maxCount);
     }

}
