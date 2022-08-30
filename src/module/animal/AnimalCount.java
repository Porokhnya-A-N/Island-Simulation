package module.animal;

public enum AnimalCount {
//Кабан.
     MAX_BOAR (50),
    //Буйвол
    MAX_BUFFALO (10),
    //Гусеница
      MAX_CATERPILLAR  (1000),
    //Олень
    MAX_DEER (20),
    //Утка
     MAX_DUCK  (200),
    //Коза
    MAX_GOAT  (140),
    //Лошадь
     MAX_HOURS  (20),
    //Мышь
     MAX_MOUSE  (500),
    //Кролик
     MAX_RABBIT  (150),
    //Овца
   MAX_SHEEP  (140),
    //Медведь
    MAX_BEAR ( 5 ),
    //Удав
     MAX_BOA  (30 ),
    //Орел
    MAX_EAGLE  (20),
    //Лиса
     MAX_FOX  (30 ),
    //Волк
    MAX_WOLF (30),
    //Растения.
    MAX_PLANTS(200);
 private int count;
    AnimalCount(int i) {
        count = i;
    }
    public int getCount(){
        return count;
    }
}
