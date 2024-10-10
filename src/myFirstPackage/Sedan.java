package myFirstPackage;

public class Sedan extends CarMaker {
    public Sedan(String model) {
        super(model);
    }

    @Override
    public int getMaxSpeed() {
        return isSportMode ? 220 : 180; // max speed varies if in sport mode
    }
}
