package control.creation;

import module.logics.Basic;
import module.logics.CreatePlantsLogic;
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
    CreatePlantsLogic createPlantsLogic = new CreatePlantsLogic();
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
            deadLogic.startClearIsland(island);
            dataOutputLogic.launchLogic(island);
            createPlantsLogic.openIsland(island);

        }
        System.out.println("Live Dead");
    }
}
