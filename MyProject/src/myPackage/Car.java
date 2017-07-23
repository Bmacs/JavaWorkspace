package myPackage;

public class Car extends Vehicle {
	
	public void drive() {
		System.out.println("drive in road");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car camry = new Car();
		camry.drive();
		camry.lightsOn();
		
	}

}
