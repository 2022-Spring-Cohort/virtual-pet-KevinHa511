package virtual_pet;

public abstract class OrganicPets extends VirtualPets  {
    public int moodLevel;
    public int thirstLevel;
    public int hungerLevel;
    public int soilLevel;

    public OrganicPets(String name, String description, int hungerLevel, int thirstLevel, int moodLevel, int soilLevel) {
        super(name, description);
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.moodLevel = moodLevel;
        this.soilLevel = soilLevel;

    }


    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }


    public int getHungerLevel() {
        return hungerLevel;
    }

    @Override
    public void tick() {
        hungerLevel+= 10;
        thirstLevel+= 10;
        moodLevel+= 10;

    }

    @Override
    public void energize() {
        hungerLevel-=5;
    }

    @Override
    public void fluid() {
        thirstLevel-=5;
    }

    @Override
    public void playPet() {
        moodLevel -=5;
    }

    @Override
    public String toString() {
        return "Pet{" +
                '\'' +
                ", moodLevel=" + moodLevel +
                ", thirstLevel=" + thirstLevel +
                ", hungerLevel=" + hungerLevel +
                '}';
    }
}

