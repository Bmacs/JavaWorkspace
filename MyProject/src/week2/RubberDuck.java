package week2;

public class RubberDuck extends Duck {
	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("Look's like a rubber duck");
	}
}
