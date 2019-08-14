package day1;

public class Vehicle {

	private int numberOfWheels;

	public Vehicle(int numberOfWheels) {
		super();
		this.numberOfWheels = numberOfWheels;
	}

	@Override
	public String toString() {
		return "Vehicle [numberOfWheels=" + numberOfWheels + "]";
	}
}
