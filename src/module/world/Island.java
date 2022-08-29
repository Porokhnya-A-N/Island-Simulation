package module.world;

import module.world.cell.EarthCell;

import java.util.ArrayList;
import java.util.List;

public class Island extends World{
    private List<EarthCell[]> listCell;
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
        System.out.println("Create Live");
        createLive(listCell);
    }
    //Создание острава заданного размера.
    private void createIsland(int sizeV,int sizeG){
        listCell = new ArrayList<>();
        for (int i = 0 ; i < sizeG ; i++) {
            listCell.add(new EarthCell[sizeV]);
        }
    }
    //Создание жизни.
    private void createLive(List<EarthCell[]> list){
        for(EarthCell[] arrayCell : list){
            for (int i = 0; i < arrayCell.length; i++) {
                arrayCell[i] = new EarthCell();
                arrayCell[i].create();
            }
        }
    }
}
