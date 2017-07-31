package week2;

public class Koopa extends Character {
	public Koopa() {
		flyBehavior = new FlyNoFly();
		yellBehavior = new YellNone();
		jumpBehavior = new JumpDouble();
	}
	
	public void display() {
		System.out.println("An enemy with a green shell on its back");
	}
}
