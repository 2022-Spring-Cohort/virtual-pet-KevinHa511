package virtual_pet;

public class Dog {

    private String Name;
    int age;
    int hungry;
    int thirsty;
    int stamina;
    int happiness;

    public Dog(String name, int age, int hungry, int thirsty, int stamina, int happiness) {
        Name = name;
        this.age = age;
        this.hungry = hungry;
        this.thirsty = thirsty;
        this.stamina = stamina;
        this.happiness = happiness;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public int getHungry() {
        return hungry;
    }

    public int getThirsty() {
        return thirsty;
    }

    public int getStamina() {
        return stamina;
    }

    public int getHappiness() {
        return happiness;
    }

    public void tick() {
        hungry++;
        thirsty++;
        stamina++;
        happiness++;

    }

    public void feedDog() {
        hungry = hungry - 6;
        thirsty++;
        stamina++;
        happiness++;
    }

    public void waterDog() {
        thirsty = thirsty - 6;
        hungry++;
        happiness++;
    }

    public void sleepDog() {
        stamina = stamina - 6;
        hungry++;
        thirsty++;
        happiness++;
    }

    public void playDog() {
        happiness = happiness - 6;
        hungry++;
        thirsty++;
        hungry++;
        stamina++;
    }

}


