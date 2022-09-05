package control.creation;

import module.logics.Basic;
import module.logics.DataOutputLogic;
import module.logics.DeadLogic;
import module.world.Island;
import view.uic.UCI;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;


public class RunApp implements Runnable{
    Island island;
    UCI uci;
    Basic logic;
    DeadLogic deadLogic = new DeadLogic();
    DataOutputLogic dataOutputLogic = new DataOutputLogic();
    public void run() {
        uci = new UCI();
        //ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
        uci.launchUCI();
        island = uci.getIsland();
        logic = new Basic(island);
        while (island.isLive()) {
            logic.openIsland();
            dataOutputLogic.launchLogic(island);
            deadLogic.startClearIsland(island);
        }
        System.out.println("Live Dead");
//        while(island.isLive()) {
//            System.out.println(island.isLive()+" " + count++);
//            logic.openIsland();
//
//        }
//        Callable task = () -> {
//            return "Hello, World!";
//        };

//        basicLogic = new Basic(island);
//        basicLogic.openIsland();

    }
}
