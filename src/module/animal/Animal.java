package module.animal;
import module.animal.actions.*;
import module.generation.Generation;
import module.generation.factory.AnimalFactory;

import java.util.Arrays;
import java.util.List;

public abstract class Animal implements Move,Eat,Reproduction,Dead, Generation {
    public void setRealSatiety(double realSatiety) {
        this.realSatiety = realSatiety;
    }

    //Основные жизненые показатели животных - вес - скорость- сытость - жизнь -
    private List<AnimalType> hunting;
    private int maxAnimal;

    public void setMaxAnimal(int maxAnimal) {
        this.maxAnimal = maxAnimal;
    }

    public int getMaxAnimal() {
        return maxAnimal;
    }

    public void setHunting(List<AnimalType> hunting) {
        this.hunting = hunting;
    }

    public List<AnimalType> getHunting() {
        return hunting;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    private AnimalType animalType;
    private double weight, satiety, realSatiety;
    private int speed, hp;
    private AnimalFactory factory = new AnimalFactory();
    private List<AnimalType> listHunting;
    private List<Integer> listHuntingPresent;

    public List<AnimalType> getListHunting() {
        return listHunting;
    }

    public void setListHunting(List<AnimalType> listHunting) {
        this.listHunting = listHunting;
    }

    public List<Integer> getListHuntingPresent() {
        return listHuntingPresent;
    }

    public void setListHuntingPresent(List<Integer> listHuntingPresent) {
        this.listHuntingPresent = listHuntingPresent;
    }

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
    public void eat(double food) {
        if (food >= satiety){
            realSatiety = satiety;
        }else if (food < satiety){
            if((realSatiety+food) >= satiety){
                realSatiety = satiety;
            }else {
                realSatiety+=food;
            }

        }
    }
    //Базовая логика передвижения

    @Override
    public int move() {
        return toGenerate(speed);
    }

    @Override
    public Animal reproduction() {
            return factory.createAnimal(getAnimalType());
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
