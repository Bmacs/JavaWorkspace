package week2;

public class Luigi extends Character {
	public Luigi() {
		flyBehavior = new FlyNoFly();
		yellBehavior = new YellYell();
		jumpBehavior = new JumpOnce();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Tall, lanky, and green attire");
	}
}
