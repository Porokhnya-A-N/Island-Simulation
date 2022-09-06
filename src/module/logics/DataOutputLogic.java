package module.logics;

import module.animal.AnimalType;
import module.world.Island;
import module.world.cell.EarthCell;

import java.util.HashMap;
import java.util.Map;

public class DataOutputLogic {
    public DataOutputLogic(){
        writeKeyMap();
    }
    private Island island;
    AnimalType[] type = AnimalType.values();
    Map<AnimalType,Integer> mapCount = new HashMap<>();
    private void readDataIsland(){
        readDataArrayCell(island.getArrayCell());
    }
 private void readDataArrayCell(EarthCell[][] cells){
     for (int i = 0; i < cells.length; i++) {
         for (int j = 0; j < cells[i].length; j++) {
            readDataCell(cells[i][j]);
         }
     }
 }
 private  void readDataCell(EarthCell cell){
     for (int i = 0; i < type.length; i++) {
         int count = cell.getMapAnimal().get(type[i]).size();
            mapCount.merge(type[i],count,Integer::sum);
     }
 }
 private void writeKeyMap(){
     for (int i = 0; i < type.length; i++) {
         mapCount.put(type[i],0);
     }
 }
    public void setIsland(Island island) {
        this.island = island;
    }
    private void dataOutput(){
        //System.out.println("------------------------");
        for (int i = 0; i < type.length; i++) {
            System.out.print(type[i] + ": {" + mapCount.get(type[i])+ "} ");
            if(i%4==0&& i> 0){
                System.out.println();
            }else if( i == type.length-1){
                System.out.println();
            }
        }
        System.out.println("------------------------");
        writeKeyMap();
    }
    public void launchLogic(Island is){
        setIsland(is);
        readDataIsland();
        dataOutput();
    }
}
