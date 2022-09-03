package module.animal.predators.hunting;

public enum BoaHunting {
    FOX(15),RABBIT(20),MOUSE(40),DUCK(10);
    int percent;
    BoaHunting(int percent){
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }
}
