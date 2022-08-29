package control.creation;

import module.world.Island;

public class RunApp implements Runnable {
    private Island island;

    @Override
    public void run() {
        island = new Island();
        island.create();
    }
}
