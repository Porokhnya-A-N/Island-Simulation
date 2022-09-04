package module.world;

import module.animal.AnimalType;
import module.world.cell.EarthCell;


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
    public boolean isLive(){
        boolean status = false;
        for(int i =0 ; i < arrayCell.length; i++){
            for (int j = 0; j < arrayCell[i].length; j++) {
                for (AnimalType type: AnimalType.values()) {
                    if(type != AnimalType.PLANTS){
                    status = arrayCell[i][j].getMapAnimal().get(type).isEmpty();
                        if(status){
                            return true;
                        }
                    }

                }


            }
        }
        return false;
    }
}
