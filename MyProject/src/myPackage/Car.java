package myPackage;

public class Car implements Vehicle {
	
	String color;
//	Tire firestone = new Tire();
	
	public void drive() {
		System.out.println("drive in road");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car camry = new Car();
		camry.drive();
//		Car nsx = new Car();
//		nsx.setColor("pink");
//		nsx.firestone.setDiameter(17);
//		System.out.println("Color = " + nsx.getColor());
//		System.out.println("Diameter = " + nsx.firestone.getDiameter());
		
	}

//	private void setColor(String newColor) {
//		// TODO Auto-generated method stub
//		color = newColor;
//		
//	}
//
//	private String getColor() {
//		// TODO Auto-generated method stub
//		return color;
//	}

}
