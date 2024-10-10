package myFirstPackage;
import javax.swing.JOptionPane;

public class CarApplication {

    public static void main(String[] args) {
        String carModel = JOptionPane.showInputDialog("Enter the model of the car you want to buy:");
        Sedan myCar = new Sedan(carModel);

        int confirm = JOptionPane.showConfirmDialog(null, "Do you want to buy this car?");
        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You bought " + myCar.model + " car.");
            
            int startCar = JOptionPane.showConfirmDialog(null, "Do you want to turn on the car?");
            if (startCar == JOptionPane.YES_OPTION) {
                myCar.turnOnCar();
                JOptionPane.showMessageDialog(null, "Car is turned on.");

                int sportMode = JOptionPane.showConfirmDialog(null, "Do you want to drive in sport mode?");
                myCar.drive(sportMode == JOptionPane.YES_OPTION);
                
                while (myCar.fuel > 0) {
                    myCar.useFuel();
                    try {
                        Thread.sleep(1000); // simulate 1 second of driving
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "You did not buy the car.");
        }
    }
}
