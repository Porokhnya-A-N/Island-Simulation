package module.logics;

import module.animal.Animal;

public class Basic {
    private Animal object;

    public void launchBasicLogic(Animal obj){
      object = obj;
        if(object.isDead()){
            if(object.getRealSatiety() >= (object.getSatiety() *0.8)){
                //Запуск логики размножения.

            }else{
                //Запуск логики охоты.

            }
        }else{
            object = null;
        }
    }
}
