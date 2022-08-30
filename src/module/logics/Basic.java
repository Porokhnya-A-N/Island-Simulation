package module.logics;

import module.animal.Animal;

public class Basic {
    private Animal object;
    public Basic(Animal object){
        this.object = object;
    }
    public void launchBasicLogic(){
        if(object.isDead()){
            if(object.getSatiety() > object.getRealSatiety()){
                object.reproduction();
            }else{
                object.eat();
            }
        }else{
            object = null;
        }
    }
}
