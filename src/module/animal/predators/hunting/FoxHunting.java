package module.animal.predators.hunting;

public enum FoxHunting {
    RABBIT(60),MOUSE(80),DUCK(40), CATERPILLAR(40);
    int percent;
    FoxHunting(int percent){
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }
}
