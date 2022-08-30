package module.logics;

import module.animal.Animal;

public class Basic {
    private Animal object;

    public void launchBasicLogic(Animal obj){
      object = obj;
        if(object.isDead()){
            if(object.getRealSatiety() >= (object.getSatiety() *0.8)){
                object.reproduction();
            }else{
                object.eat();
            }
        }else{
            object = null;
        }
    }
}
