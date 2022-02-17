package virtual_pet;

public abstract class VirtualPets {
    private String name;
    private String description;


    public VirtualPets(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public abstract void energize();

    public abstract void fluid();

    public abstract void playPet();

    public abstract void tick();

    public String getPetByDescription() {
        return description;
    }

    public abstract void walk();
}

