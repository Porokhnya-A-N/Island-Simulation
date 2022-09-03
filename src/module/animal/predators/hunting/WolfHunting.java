package module.animal.predators.hunting;

public enum WolfHunting {
    HORSE (10),DEER(15),RABBIT(60),MOUSE(80),GOAT(60),SHEEP(70),BOAR(15),BUFFALO(10),DUCK(40);
    int percent;
    WolfHunting(int percent){
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }
}
