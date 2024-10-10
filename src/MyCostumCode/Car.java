package MyCostumCode;

public abstract class Car {
	
	
	private int maxSpeed;
	public int carSelectNumber;
	private String owner;
	public String drivingMode;
	
	public Car() {
		this("The fabric it self", "normal");
	}
	
		
	public Car(String newOwner, String newDrivingMode) {
		drivingMode = newDrivingMode;
		
	
		
	}
		
	public static void main(String[] args) {
		

	}
	
	public void updateMaxSpeed(String newDrivingMode) {
		if (newDrivingMode == "normal") {
			maxSpeed = 180;
		}else {
			maxSpeed = 230;
		}
	}
	
	////////////////////
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String newOwner) {
		this.owner = newOwner;
	}
	///////////////////////

}
