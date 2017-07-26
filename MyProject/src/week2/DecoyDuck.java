package week2;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("Look's like a decoy duck");
	}
}
