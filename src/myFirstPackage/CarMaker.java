package myFirstPackage;

import javax.swing.JOptionPane;

public abstract class CarMaker {
    protected String model;
    protected boolean isOn;
    protected boolean isSportMode;
    protected int fuel;

    public CarMaker(String model) {
        this.model = model;
        this.isOn = false;
        this.isSportMode = false;
        this.fuel = 10; // 10 seconds of fuel
    }

    abstract public int getMaxSpeed();

    public void turnOnCar() {
        this.isOn = true;
        this.fuel = 10; // reset fuel when turned on
    }

    public void drive(boolean sportMode) {
        this.isSportMode = sportMode;
    }

    public void useFuel() {
        if (this.fuel > 0) {
            this.fuel--;
        } else {
            displayFuelWarning();
        }
    }

    private void displayFuelWarning() {
        JOptionPane.showMessageDialog(null, "Fuel is run out!");
    }
}
