package virtual_pet;

public class RoboDog extends RoboPets{
    public RoboDog(String name, String description, int disrepairLevel, int oilLevel, int powerLevel) {
        super(name, description, disrepairLevel, oilLevel, powerLevel);
    }


    public void walk() {
        powerLevel -=10;
        oilLevel -=10;
    }
}
