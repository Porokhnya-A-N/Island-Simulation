package module.world;

import module.world.cell.EarthCell;

import java.util.ArrayList;
import java.util.List;

public class Island extends World{
    public EarthCell[][] getArrayCell() {
        return arrayCell;
    }

    private EarthCell[][] arrayCell;
    public Island(){
        this(2,2);
    }
    public Island(int sizeV, int sizeG){
        this.sizeV = sizeV;
        this.sizeG = sizeG;
    }


    // создание Острова.
    @Override
    public void create() {
        System.out.println("Create Island");
        createIsland(sizeV,sizeG);
    }
    //Создание острава заданного размера.
    private void createIsland(int sizeV,int sizeG) {
        arrayCell = new EarthCell[sizeV][sizeG];
        for (int i = 0; i < sizeV; i++) {
            for (int j = 0; j < sizeG; j++) {
                arrayCell[i][j] = new EarthCell();
                arrayCell[i][j].create();
            }

        }
    }
}
