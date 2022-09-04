package module.logics;

import module.animal.Animal;
import module.world.cell.EarthCell;

public class MovementLogic {
    int x, y;
    public void startMove(int direction, int corX, int corY, Animal object, EarthCell[][] earthCell){
        x = corX; y = corY;
        int steep = object.toGenerate(object.getSpeed());
        if(direction == 0 && steep!=0){
           if(earthCell.length > (corX + steep){
               startMoveCorX(x,y,object,earthCell,corX + steep));
            } else if () {


           }
        }else if (direction == 1){

        }

    }
    public void startMoveCorX( int corY,Animal object, EarthCell[][] earthCell, int steep ){
        if(earthCell[steep][corY].getMapAnimal().get(object.getAnimalType()).size()< object.getMaxAnimal()) {
            earthCell[steep][corY].getMapAnimal().get(object.getAnimalType()).add(object);
            object.setRealSatiety(object.getRealSatiety() *0.5);
        }else {
            object.setRealSatiety(object.getRealSatiety() *0.5);
        }

    }
    public void startMoveCorY(int corX,Animal object, EarthCell[][] earthCell, int steep) {
        if(earthCell[corX][steep].getMapAnimal().get(object.getAnimalType()).size()< object.getMaxAnimal()) {
            earthCell[corX][steep].getMapAnimal().get(object.getAnimalType()).add(object);
            object.setRealSatiety(object.getRealSatiety() *0.5);
        }else{
            object.setRealSatiety(object.getRealSatiety() *0.5);
        }

    }
    }

