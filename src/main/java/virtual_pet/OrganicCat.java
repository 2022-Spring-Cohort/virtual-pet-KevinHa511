package virtual_pet;

public class OrganicCat extends OrganicPets {
    public OrganicCat(String name, String description, int hungerLevel, int thirstLevel, int moodLevel, int soilLevel) {
        super(name, description, hungerLevel, thirstLevel, moodLevel, soilLevel);
    }
    public void walk() {
        hungerLevel +=10;
        moodLevel +=10;
        soilLevel -=10;
    }
}