package module.logics;

import module.animal.Animal;
import module.animal.predators.Eagle;
import module.animal.predators.Fox;
import module.animal.predators.Wolf;
import module.animal.predators.hunting.EagleHunting;
import module.animal.predators.hunting.FoxHunting;
import module.animal.predators.hunting.WolfHunting;
import module.world.cell.EarthCell;

public class HuntingLogic {
        public int startHunting(Animal object, EarthCell cell){
         if(object instanceof Wolf){
             Wolf wolf = (Wolf) object;

             return 1;
         }else if (object instanceof Fox) {
             Fox fox = (Fox) object;
             return fox.toGenerate(FoxHunting.values().length);
         }else if(object instanceof Eagle){
             Eagle eagle = (Eagle) object;
             return eagle.toGenerate(EagleHunting.values().length);
         }else
             return 0;
        }
}
