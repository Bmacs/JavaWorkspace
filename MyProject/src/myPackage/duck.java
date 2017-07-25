package myPackage;

public class duck {
	
	int legs;
	int eyes;
	int wingSpan;
	String color;
	

	public int getLegs() {
		return legs;
	}


	public void setLegs(int legs) {
		this.legs = legs;
	}


	public int getEyes() {
		return eyes;
	}


	public void setEyes(int eyes) {
		this.eyes = eyes;
	}


	public int getWingSpan() {
		return wingSpan;
	}


	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	public void fly() {
		System.out.println("Flap Flap Flap");
	}
	
	public void display() {
		System.out.println("Raises wing");
	}
	
	public void quack() {
		System.out.println("Quack");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duck Duck = new duck();
		Duck.quack();
		Duck.fly();
		Duck.display();
		Duck.setWingSpan(20);
		Duck.setColor("Yellow");
		Duck.setEyes(2);
		Duck.setLegs(2);

	}

}
