package virtual_pet;

public class RoboCat extends RoboPets {

        public RoboCat (String name, String description, int repairLevel, int oilLevel, int powerLevel) {
        super(name, description, repairLevel, oilLevel, powerLevel);
    }
        public void walk() {
        powerLevel -=10;
        oilLevel -=10;
    }



}





