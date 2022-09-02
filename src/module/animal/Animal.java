package module.animal;
import module.animal.actions.*;
import module.generation.Generation;
import module.generation.factory.AnimalFactory;

public abstract class Animal implements Move,Eat,Reproduction,Dead, Generation {
    //Основные жизненые показатели животных - вес - скорость- сытость - жизнь -
    private AnimalType animalType;
    private double weight, satiety, realSatiety;
    private int speed, hp;
    private AnimalFactory factory;
    public Animal(double weight, double satiety, int speed, int hp, AnimalType animalType) {
        this.weight = weight;
        this.satiety = satiety;
        this.speed = speed;
        this.hp = hp;
        this.animalType = animalType;
        realSatiety = satiety * 0.50;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    //Базовая логика питания.
    @Override
    public void eat(int food) {
        if (food >= satiety){
            realSatiety = satiety;
        }else if (food < satiety){
            if((realSatiety+food) > satiety){
                realSatiety = satiety;
            }else {
                realSatiety+=food;
            }

        }
    }
    //Базовая логика передвижения

    @Override
    public int move(int speed) {
        return toGenerate(speed);
    }

    @Override
    public void reproduction() {
           // return factory.createAnimal(name);
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
