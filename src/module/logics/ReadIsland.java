package module.logics;

import module.world.cell.EarthCell;

public class ReadIsland {
    private EarthCell[][] island;
    private CellSearch cellSearch = new CellSearch();
    public void readIsland(EarthCell[][] island){
        this.island = island;
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                cellSearch.openCell(island[i][j]);
            }
        }
    }
}
