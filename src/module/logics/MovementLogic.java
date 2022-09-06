package module.logics;

import module.animal.Animal;
import module.world.cell.EarthCell;

public class MovementLogic {
    private int x, y;
    public void startMove(int direction, int corX, int corY, Animal object, EarthCell[][] earthCell){
        System.out.println("Move -> " + object.getAnimalType());
        System.out.println(object.getRealSatiety());
      x = corX;
      y = corY;
        int steep = object.move();
        System.out.println("Step ->" + steep);
        if(steep == 0){
            steep = 1;
        }
        System.out.println("Step ->" + steep);
        if(direction == 0){
            System.out.println("Corx");
           if(earthCell.length >= (x + steep)){
               while(steep > 0){
               if(isSteepOnRight(earthCell.length,steep)) {
                    startMoveCorX(y, object, earthCell, x + steep);
                    break;
                }else{
                   steep--;
               }
               }
            } else if (earthCell.length < (x + steep)) {
                while(steep > 0){
                    if(isSteepOnLeft(steep)){
                        startMoveCorX(y, object, earthCell, x - steep);
                        break;
                    }else {
                        steep--;
                    }

                }

           }
        }else if (direction == 1){
            System.out.println("CorY");
                if(earthCell[x].length >= (y + steep)){
                    while (steep>0){
                        if(isSteepOnBottom(earthCell[x].length,steep)){
                            startMoveCorY(x,object,earthCell,steep);
                            break;
                        }else {
                            steep--;
                        }
                    }
                }else if(earthCell[x].length < (y + steep)){
                    while(steep>0){
                        if(isSteepOnTop(steep)){
                            startMoveCorY(x,object,earthCell,steep);
                            break;
                        }else{
                            steep--;
                        }
                    }
                }
        }
        earthCell[x][y].getMapAnimal().get(object.getAnimalType()).remove(object);
    }
    private boolean isSteepOnLeft( int steep){
        return (x - steep ) >= 0;
    }
    private boolean isSteepOnRight(int length, int steep){
        return (length - ( x+ steep )) >= steep;
    }
    private boolean isSteepOnTop(int steep){
        return (y - steep ) >= 0;
    }
    private boolean isSteepOnBottom(int length, int steep){
        return (length - ( y+ steep )) >= steep;
    }
    public void startMoveCorX( int corY,Animal object, EarthCell[][] earthCell, int steep ){
        if(earthCell[steep][corY].getMapAnimal().get(object.getAnimalType()).size()< object.getMaxAnimal()) {
            earthCell[steep][corY].getMapAnimal().get(object.getAnimalType()).add(object);
            object.setRealSatiety(object.getRealSatiety() - (object.getSatiety()*0.2));
        }else {
            object.setRealSatiety(object.getRealSatiety() - (object.getSatiety()*0.2));
        }

    }
    public void startMoveCorY(int corX,Animal object, EarthCell[][] earthCell, int steep) {
        if(earthCell[corX][steep].getMapAnimal().get(object.getAnimalType()).size()< object.getMaxAnimal()) {
            earthCell[corX][steep].getMapAnimal().get(object.getAnimalType()).add(object);
            object.setRealSatiety(object.getRealSatiety() - (object.getSatiety()*0.2));
        }else{
            object.setRealSatiety(object.getRealSatiety() - (object.getSatiety()*0.2));
        }

    }
    }

