package week2;

public class SquirrelMario extends Character {
	public SquirrelMario() {
		jumpBehavior = new JumpCrit();
		flyBehavior = new FlyGlide();
		yellBehavior = new YellLine();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Normal looking Mario, but in Squirrel form");
	}
}
