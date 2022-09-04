package module.logics;

import module.animal.Animal;
import module.world.cell.EarthCell;

public class MovementLogic {
    public void startMove(int corX, int corY, Animal object, EarthCell[][] earthCell){
        if(corX > 0 && corY == 0){
           if(earthCell.length > (corX + object.getSpeed())){
               startMoveCorX(object,earthCell,corX + object.toGenerate(object.getSpeed()));
            } else if (earthCell.length > (corX + object.getSpeed()-1)) {
               startMoveCorX(object,earthCell,corX + object.toGenerate(object.getSpeed())-1);

           }
        }else{

        }

    }
    public void startMoveCorX(Animal object, EarthCell[][] earthCell, int steep ){
        if(earthCell[steep][0].getMapAnimal().get(object.getAnimalType()).size()< object.getMaxAnimal()) {
            earthCell[steep][0].getMapAnimal().get(object.getAnimalType()).add(object);
        }

    }
    public void startMoveCorY(Animal object, EarthCell[][] earthCell, int steep) {
        if(earthCell[0][steep].getMapAnimal().get(object.getAnimalType()).size()< object.getMaxAnimal()) {
            earthCell[0][steep].getMapAnimal().get(object.getAnimalType()).add(object);
        }

    }
    }

