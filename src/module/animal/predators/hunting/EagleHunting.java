package module.animal.predators.hunting;

public enum EagleHunting {
    FOX(10),RABBIT(90),MOUSE(90),DUCK(80);
    int percent;
    EagleHunting(int percent){
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }
}
