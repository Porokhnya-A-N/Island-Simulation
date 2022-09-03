package module.animal.predators.hunting;

public enum BearHunting {
    BOA(80),HORSE (40),DEER(80),RABBIT(80),MOUSE(80),GOAT(70),SHEEP(70),BOAR(50),BUFFALO(20),DUCK(10);
    int percent;
    BearHunting(int percent){
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }
}
