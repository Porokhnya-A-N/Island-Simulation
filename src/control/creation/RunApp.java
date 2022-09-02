package control.creation;

import module.logics.ReadIsland;
import module.world.Island;

public class RunApp implements Runnable {
    private Island island;
    private ReadIsland readIsland;

    @Override
    public void run() {
        island = new Island();
        island.create();
    }
}
