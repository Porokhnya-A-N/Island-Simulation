package module.logics;

import module.animal.Animal;

public class Basic {
    private Animal object;

    public void launchBasicLogic(Animal obj){
        this.object = obj;
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
