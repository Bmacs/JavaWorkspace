package MarioQuest;

public abstract class Character {
	
	FlyBehavior flyBehavior;
	JumpBehavior jumpBehavior;
	YellBehavior yellBehavior;
	
	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}
	
	public void yellBehavior() {
		yellBehavior.yell();
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setYellBehavior(YellBehavior yb) {
		yellBehavior = yb;
	}
	
	public void setJumpBehavior(JumpBehavior jb) {
		jumpBehavior = jb;
	}
}
