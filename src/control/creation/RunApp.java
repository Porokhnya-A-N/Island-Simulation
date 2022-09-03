package control.creation;

import module.logics.Basic;
import module.world.Island;

public class RunApp implements Runnable {
    Basic basicLogic;
    Island island;
    @Override
    public void run() {
        island = new Island();
        island.create();
        basicLogic = new Basic(island);
        basicLogic.openIsland();

    }
}
