package module.animal;
import module.animal.actions.*;
public abstract class Animal implements Move,Eat,Reproduction,Dead {
    //Основные жизненые показатели животных - вес - скорость- сытость - жизнь -
    private int weight, speed, satiety,hp;
}
