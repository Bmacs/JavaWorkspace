package week2;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("Look's like a redhead");
	}
}
