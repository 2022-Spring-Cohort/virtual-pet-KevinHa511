package virtual_pet;

public class OrganicDog extends OrganicPets implements Walkable{
    public OrganicDog(String name, String description, int hungerLevel, int thirstLevel, int moodLevel, int soilLevel) {
        super(name, description, hungerLevel, thirstLevel, moodLevel, soilLevel);
    }


    public void walk() {
        hungerLevel +=10;
        moodLevel +=10;
        soilLevel -=10;
    }
}


