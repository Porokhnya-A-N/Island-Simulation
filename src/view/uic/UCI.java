package view.uic;

import module.world.Island;

import java.util.Scanner;

public class UCI {
    public Island getIsland() {
        return island;
    }

    Island island;
    int x,y;
    public void launchUCI(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the island life simulation!");
        System.out.println("Set the size of the island:");
        System.out.println("X: " + (x =  scanner.nextInt()));
        System.out.println("Y: " + (y =  scanner.nextInt()));
        System.out.println("The creation and filling of the island with life will be introduced.");
        island = new Island(x,y);
        island.create();
        System.out.println(island.isLive());
    }
}
