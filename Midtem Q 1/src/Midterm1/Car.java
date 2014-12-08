package Midterm1;


public class Car extends Vehicle implements VehicleInt {

	private int NumberOfDoors;

	public Car() {

	}

	public Car(int NumberOfDoors) {
		this.NumberOfDoors = NumberOfDoors;
	}

	public int getNumberOfDoors() {
		return NumberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		NumberOfDoors = numberOfDoors;
	}

	@Override
	public void transferOwnerShip(Person newOwner) {
		Owner = newOwner;
	}

}