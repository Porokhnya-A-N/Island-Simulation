package module.animal;
import module.animal.actions.*;
public abstract class Animal implements Move,Eat,Reproduction,Dead {
    //Основные жизненые показатели животных - вес - скорость- сытость - жизнь -
    private double weight, satiety, realSatiety;
     private int speed, hp;

    public Animal(double weight, double satiety, int speed, int hp) {
        this.weight = weight;
        this.satiety = satiety;
        this.speed = speed;
        this.hp = hp;
        realSatiety = satiety * 0.50;
    }

    public double getWeight() {
        return weight;
    }

    public double getRealSatiety() {
        return realSatiety;
    }

    public double getSatiety() {
        return satiety;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public boolean isDead() {
        return (hp > 0);
    }
}
