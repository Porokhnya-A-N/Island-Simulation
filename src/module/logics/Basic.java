package module.logics;

import module.animal.Animal;

public class Basic {
    private Animal object;

    public void launchBasicLogic(Animal obj){
        //System.out.println(obj.getAnimalType());
      object = obj;
        if(object.isDead()){
            if(object.getRealSatiety() >= (object.getSatiety() *0.8)){
                //Запуск логики размножения.
                System.out.println("run logic 1");

            }else{
                //Запуск логики охоты.
                System.out.println("run logic 2");

            }
        }else{
            object = null;
        }
    }
}
